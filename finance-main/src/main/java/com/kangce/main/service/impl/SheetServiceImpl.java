package com.kangce.main.service.impl;

import com.kangce.main.service.SheetService;
import com.kangce.mybatis.mapper.SalaryItemMapper;
import com.kangce.mybatis.mapper.UtbasebalancesheetMapper;
import com.kangce.mybatis.mapper.UtbasecashflowstatementMapper;
import com.kangce.mybatis.mapper.UtbaseincomestatementMapper;
import com.kangce.mybatis.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    UtbasebalancesheetMapper utbasebalancesheetMapper;
    @Autowired
    UtbasecashflowstatementMapper utbasecashflowstatementMapper;
    @Autowired
    UtbaseincomestatementMapper utbaseincomestatementMapper;
    @Autowired
    SalaryItemMapper salaryItemMapper;

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

    @Override
    public List<Map<String, Object>> getSalaryAllocation() {
        List<SalaryItem> salaryItems = salaryItemMapper.selectByExample(new SalaryItemExample());
        List<Map<String, Object>> list = new ArrayList<>();
//        List<AllocateBean> collect = salaryItems.stream().map(new MyFun()).collect(Collectors.toList());

        double sum = salaryItems.stream().collect(Collectors.summarizingDouble(value -> value.getReallySalary().doubleValue())).getSum();
        salaryItems
                .stream()
                .collect(Collectors.groupingBy(SalaryItem::getDepartmentName))
                .forEach((k, v) -> {
                    double sumDep = v.stream().collect(Collectors.summarizingDouble(value -> value.getReallySalary().doubleValue())).getSum();
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("name", k);
                    map.put("depSalary", sumDep);
                    map.put("allSalary", sum);
                    list.add(map);
                });


//        HashSet<String> strings = new HashSet<>();
//        for (AllocateBean allocateBean : collect) {
//            strings.add(allocateBean.name);
//        }
//        for (String string : strings) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("name", string);
//            map.put("allSalary", 0);
//            for (AllocateBean allocateBean : collect) {
//                if (allocateBean.getName().equals(string)) {
//                    BigDecimal allSalary = (BigDecimal) map.get("allSalary");
//                    map.put("allSalary", BigDecimal.valueOf(allSalary.doubleValue() + allocateBean.salary.doubleValue()));
//                }
//            }
//            list.add(map);
//        }

        return list;
    }


    class MyFun implements Function<SalaryItem, AllocateBean> {

        @Override
        public AllocateBean apply(SalaryItem salaryItem) {
            AllocateBean allocateBean = new AllocateBean();
            allocateBean.setName(salaryItem.getDepartmentName());
            allocateBean.setSalary(salaryItem.getReallySalary());
            return allocateBean;
        }

        @Override
        public <V> Function<V, AllocateBean> compose(Function<? super V, ? extends SalaryItem> before) {
            return null;
        }

        @Override
        public <V> Function<SalaryItem, V> andThen(Function<? super AllocateBean, ? extends V> after) {
            return null;
        }
    }

    class AllocateBean {
        String name;
        BigDecimal salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }
    }
}
