package com.kangce.main.service;

import com.kangce.main.dto.SalaryItemParam;
import com.kangce.mybatis.model.SalaryItem;

import java.util.List;
import java.util.Map;

public interface SalaryItemService {
    /**
     * 添加工资
     *
     * @param salaryItemParam
     * @return
     */
    SalaryItem addSalaryItem(SalaryItemParam salaryItemParam);

    /**
     * 根据员工id 获取录入工资情况
     *
     * @param sId
     * @return
     */
    SalaryItem getSalaryItem(int sId);


    /**
     * 查询 工资录入了 那些人？
     */

    List<Map<String,Object>> getSalaryStaff();
}
