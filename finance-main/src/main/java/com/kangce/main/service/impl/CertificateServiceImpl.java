package com.kangce.main.service.impl;

import com.kangce.main.dto.CertificateWordParam;
import com.kangce.main.service.CertificateService;
import com.kangce.mybatis.mapper.UtcredentialswordMapper;
import com.kangce.mybatis.model.Utcredentialsword;
import com.kangce.mybatis.model.UtcredentialswordExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {
    @Autowired
    UtcredentialswordMapper mapper;

    @Override
    public List<Utcredentialsword> getWord() {
        return mapper.selectByExample(new UtcredentialswordExample());
    }

    @Override
    public int editWord(CertificateWordParam param) {
        Utcredentialsword utcredentialsword = new Utcredentialsword();
        BeanUtils.copyProperties(param, utcredentialsword);
        UtcredentialswordExample utcredentialswordExample = new UtcredentialswordExample();
        utcredentialswordExample.createCriteria().andIdEqualTo(utcredentialsword.getId());
        int i = mapper.updateByExampleSelective(utcredentialsword, utcredentialswordExample);
        return i;
    }

    @Override
    public int addWord(CertificateWordParam param) {
        Utcredentialsword utcredentialsword = new Utcredentialsword();
        BeanUtils.copyProperties(param, utcredentialsword);
        return mapper.insert(utcredentialsword);
    }

    @Override
    public int deleteWord(int id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
