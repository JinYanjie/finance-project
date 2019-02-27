package com.kangce.main.service.impl;

import com.kangce.main.service.DepartmentService;
import com.kangce.mybatis.mapper.DepartmentMapper;
import com.kangce.mybatis.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public int add(String name) {
        Department department=new Department();
        department.setName(name);
        int insert = departmentMapper.insert(department);
        return insert;
    }
}
