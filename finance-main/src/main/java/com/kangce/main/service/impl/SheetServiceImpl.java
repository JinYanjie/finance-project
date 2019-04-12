package com.kangce.main.service.impl;

import com.kangce.main.service.SheetService;
import com.kangce.mybatis.mapper.UtbasebalancesheetMapper;
import com.kangce.mybatis.mapper.UtbasecashflowstatementMapper;
import com.kangce.mybatis.mapper.UtbaseincomestatementMapper;
import com.kangce.mybatis.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    UtbasebalancesheetMapper utbasebalancesheetMapper;
    @Autowired
    UtbasecashflowstatementMapper utbasecashflowstatementMapper;
    @Autowired
    UtbaseincomestatementMapper utbaseincomestatementMapper;

    @Override
    public List<Utbasebalancesheet> getBalanceSheet(int type) {
        UtbasebalancesheetExample utbasebalancesheetExample = new UtbasebalancesheetExample();
        utbasebalancesheetExample.createCriteria().andTypeEqualTo(type);
        return utbasebalancesheetMapper.selectByExample(utbasebalancesheetExample);
    }

    @Override
    public List<Utbasecashflowstatement> getCashFlowSheet() {
        return utbasecashflowstatementMapper.selectByExample(new UtbasecashflowstatementExample());
    }

    @Override
    public List<Utbaseincomestatement> getIncomeSheet() {
        return utbaseincomestatementMapper.selectByExample(new UtbaseincomestatementExample());
    }
}
