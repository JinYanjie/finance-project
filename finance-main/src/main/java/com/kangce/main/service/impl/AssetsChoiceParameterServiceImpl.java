package com.kangce.main.service.impl;

import com.kangce.mybatis.mapper.UtassettypeMapper;
import com.kangce.mybatis.mapper.UtchangemodeMapper;
import com.kangce.mybatis.model.Utassettype;
import com.kangce.mybatis.model.UtassettypeExample;
import com.kangce.mybatis.model.Utchangemode;
import com.kangce.mybatis.model.UtchangemodeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsChoiceParameterServiceImpl implements AssetsChoiceParameterService {

    @Autowired
    UtchangemodeMapper utchangemodeMapper;

    @Autowired
    UtassettypeMapper utassettypeMapper;

    /**
     * 获取所有资产变更方式
     * @return
     */
    @Override
    public List<Utchangemode> loadAllChangeMode() {
        return utchangemodeMapper.selectByExample(new UtchangemodeExample());
    }


    /**
     *获取所有资产类型
     * @return
     */
    @Override
    public List<Utassettype> loadAllAssetType() {
        return utassettypeMapper.selectByExample(new UtassettypeExample());
    }


}
