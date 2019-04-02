package com.kangce.main.service.impl;

import com.kangce.main.dto.SocialRateParam;
import com.kangce.main.service.SocialRateService;
import com.kangce.mybatis.mapper.UtsocialrateMapper;
import com.kangce.mybatis.model.Utsocialrate;
import com.kangce.mybatis.model.UtsocialrateExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialRateServiceImp implements SocialRateService {

    @Autowired
    UtsocialrateMapper utsocialrateMapper;

    @Override
    public List<Utsocialrate> getSocialRate() {
        return utsocialrateMapper.selectByExample(new UtsocialrateExample());
    }

    @Override
    public Object update(List<SocialRateParam> list) {
        List<Utsocialrate> Utsocialrates = new ArrayList<>();
        BeanUtils.copyProperties(list, Utsocialrates);
        if (Utsocialrates.size() > 0) {
            for (Utsocialrate utsocialrate : Utsocialrates) {
                int i = utsocialrateMapper.updateByPrimaryKeySelective(utsocialrate);
                if (i < 0) {
                    //更新失败 就把失败的name发出去
                    return utsocialrate.getName() + "更新失败";
                }
            }
        }
        //如果更新成功  就把全部数据返回
        return utsocialrateMapper.selectByExample(new UtsocialrateExample());
    }
}
