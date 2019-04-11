package com.kangce.main.service.impl;

import com.kangce.main.dto.CertificateParam;
import com.kangce.mybatis.mapper.CertificateMapper;
import com.kangce.mybatis.model.Certificate;
import com.kangce.mybatis.model.CertificateExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CertificateManagerServiceImpl implements CertificateManagerService {
    @Autowired
    CertificateMapper certificateMapper;

    @Override
    public int addCertificate(List<CertificateParam> certificateListParam) {
        //先查询 当前品凭证字 的数字  是多少 了
        Certificate bean = new Certificate();
        BeanUtils.copyProperties(certificateListParam.get(0), bean);
        String certificateNum = bean.getCertificateNum();
        CertificateExample certificateExample = new CertificateExample();
        certificateExample.createCriteria().andCertificateNumEqualTo(certificateNum);
        List<Certificate> list = certificateMapper.selectByExample(certificateExample);
        List<Integer> collect = list.stream().map(Certificate::getCurrentNum).distinct().sorted().collect(Collectors.toList());
        Integer numCurrent = collect.get(collect.size() - 1);

        for (CertificateParam certificateParam : certificateListParam) {
            Certificate certificate = new Certificate();
            BeanUtils.copyProperties(certificateParam, certificate);
            certificate.setCurrentNum(numCurrent + 1);
            int insert = certificateMapper.insert(certificate);
            if (insert <= 0) {
                return 0;
            }
        }
        return certificateListParam.size();
    }


    @Override
    public List<Map<String, Object>> getCertificate(int state) {
        CertificateExample certificateExample = new CertificateExample();
        //0是全部   1是已审核  2 是未审核
        if (state != 0) {
            certificateExample.createCriteria().andStateEqualTo(state);
        }
        List<Certificate> certificates = certificateMapper.selectByExample(certificateExample);
        if (certificates != null) {
            List<Map<String, Object>> list = new ArrayList<>();
            Set<String> set = new HashSet<>();

            for (Certificate certificate : certificates) {
                set.add(certificate.getCertificateNum() + certificate.getCurrentNum());
            }
            for (String s : set) {
                List<Certificate> list1 = new ArrayList<>();
                for (Certificate certificate : certificates) {
                    if ((certificate.getCertificateNum() + certificate.getCurrentNum()).equals(s)) {
                        list1.add(certificate);
                    }
                }
                Map<String, Object> map = new HashMap<>();
                map.put("name", s);
                map.put("date", list1.get(0).getDate());
                map.put("checkState", list1.get(0).getState());
                map.put("checkUserId", list1.get(0).getCheckUserId());
                map.put("nameList", list1);
                list.add(map);
            }

            return list;
        }
        return null;
    }

    @Override
    public int update(String certificateNum, int currentNum, int userId, int state) {
        Certificate certificate = new Certificate();
        certificate.setCheckUserId(userId);
        certificate.setState(state);
        CertificateExample certificateExample = new CertificateExample();
        certificateExample.createCriteria().andCertificateNumEqualTo(certificateNum).andCurrentNumEqualTo(currentNum);
        return certificateMapper.updateByExampleSelective(certificate, certificateExample);
    }
}
