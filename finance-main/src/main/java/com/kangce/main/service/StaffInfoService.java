package com.kangce.main.service;

import com.kangce.main.dto.StaffInfoParam;
import com.kangce.mybatis.model.StaffInfo;

import java.util.List;

public interface StaffInfoService {
    /**
     * 添加员工
     */
    StaffInfo addStaff(StaffInfoParam param);


    /**
     * 修改员工
     */
    StaffInfo updateStaff(StaffInfoParam param);


    /**
     * 删除员工
     */
    int delStaff(int id);


    /**
     * 查询单个员工信息
     */
    StaffInfo getStaffInfo(int id);


    /**
     * 查询 给定条件 的员工信息
     */
    List<StaffInfo> getBatchStaff(String keyWord,int pageNum,int pageSize);
    /**
     * 查询所有员工信息
     */
    List<StaffInfo> getAll(int pageNum,int pageSize);
}
