package com.kangce.main.service.impl;

import com.kangce.main.dto.SalaryItemParam;
import com.kangce.main.service.SalaryItemService;
import com.kangce.mybatis.mapper.SalaryItemMapper;
import com.kangce.mybatis.model.SalaryItem;
import com.kangce.mybatis.model.SalaryItemExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalaryItemServiceImp implements SalaryItemService {

    @Autowired
    SalaryItemMapper itemMapper;

    @Override
    public SalaryItem addSalaryItem(SalaryItemParam salaryItemParam) {
        SalaryItem salaryItem = new SalaryItem();
        BeanUtils.copyProperties(salaryItemParam, salaryItem);
        itemMapper.insert(salaryItem);
        return salaryItem;
    }


    /**
     * 根据员工id， 获取最近一次的 工资录入情况
     *
     * @param sId
     * @return
     */
    @Override
    public SalaryItem getSalaryItem(int sId) {
        SalaryItemExample salaryItemExample = new SalaryItemExample();
        SalaryItemExample.Criteria criteria = salaryItemExample.createCriteria();
        criteria.andSIdEqualTo(sId);
        salaryItemExample.setOrderByClause("date desc");
        List<SalaryItem> salaryItems = itemMapper.selectByExample(salaryItemExample);
        return salaryItems.get(0);

    }

    @Override
    public List<Map<String, Object>> getSalaryStaff() {
        List<SalaryItem> salaryItems = itemMapper.selectByExample(new SalaryItemExample());
        List<Map<String, Object>> maps = new ArrayList<>();
        if (salaryItems == null) {
            return null;
        }
        for (SalaryItem salaryItem : salaryItems) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", salaryItem.getsName());
            map.put("id", salaryItem.getsId());
        }
        return maps;
    }


}
