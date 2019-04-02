package com.kangce.main.service.impl;

import com.github.pagehelper.PageHelper;
import com.kangce.main.dto.SalaryItemParam;
import com.kangce.main.service.SalaryItemService;
import com.kangce.mybatis.mapper.SalaryItemMapper;
import com.kangce.mybatis.mapper.StaffInfoMapper;
import com.kangce.mybatis.model.SalaryItem;
import com.kangce.mybatis.model.SalaryItemExample;
import com.kangce.mybatis.model.StaffInfo;
import com.kangce.mybatis.model.StaffInfoExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SalaryItemServiceImp implements SalaryItemService {

    @Autowired
    SalaryItemMapper itemMapper;

    @Autowired
    StaffInfoMapper staffInfoMapper;

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


    /**
     * 录取工资的员工
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> getSalaryStaff(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
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

    /**
     * 未录入工资的员工
     */
    @Override
    public List<Map<String, Object>> getUnSalary(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<SalaryItem> salaryItems = itemMapper.selectByExample(new SalaryItemExample());
        List<Integer> collect = salaryItems.stream().map(SalaryItem::getsId).distinct().collect(Collectors.toList());
        //查出  录入 的 id
        StaffInfoExample staffInfoExample = new StaffInfoExample();
        //如果 都没有录入工资,不设置查询标准
        if (collect.size()>0){
            staffInfoExample.createCriteria().andIdNotIn(collect);
        }

        List<Map<String, Object>> unSalaryStaff = staffInfoMapper.selectByExample(staffInfoExample).stream().map(this::getUser).collect(Collectors.toList());

        // 查出  id  不在 用户表的id
        return unSalaryStaff;
    }


    public Map<String, Object> getUser(StaffInfo staffInfo) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", staffInfo.getId());
        hashMap.put("name", staffInfo.getName());
        hashMap.put("state",staffInfo.getState());
        return hashMap;
    }

}
