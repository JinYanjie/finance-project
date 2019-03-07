package com.kangce.main.service.impl;



import com.kangce.main.service.DepartmentService;
import com.kangce.mybatis.mapper.DepartmentMapper;
import com.kangce.mybatis.model.Department;
import com.kangce.mybatis.model.DepartmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public int addDepartment(String name) {
        Department department=new Department();
        department.setName(name);
        int insert = departmentMapper.insert(department);
        return insert;
    }

    @Override
    public int updateDepartment(byte id,String name) {
        Department department=new Department();
        department.setName(name);
        department.setId(id);
        int num = departmentMapper.updateByPrimaryKey(department);
        return num;
    }

    @Override
    public int deleteDepartment(byte id) {
        int i = departmentMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int deletePartDepartment(List<Byte> ids) {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria().andIdIn(ids);
        return departmentMapper.deleteByExample(departmentExample);
    }

    @Override
    public List<Department> listAllDepartment() {
        return departmentMapper.selectByExample(new DepartmentExample());
    }

    @Override
    public List<Department> listDepartment(byte id) {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria().andIdEqualTo(id);
        return departmentMapper.selectByExample(departmentExample);
    }
}
