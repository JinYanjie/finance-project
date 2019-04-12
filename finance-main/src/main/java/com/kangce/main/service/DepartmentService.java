package com.kangce.main.service;


import com.kangce.mybatis.model.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 添加部门
     * @param name
     * @return
     */
    int addDepartment(String name);

    /**
     * 修改部门
     */
    int updateDepartment(int id,String name);

    /**
     * 删除指定id部门
     */
    int deleteDepartment(int id);

    /**
     * 删除部分部门
     */
    int deletePartDepartment(List<Integer> ids);

    /**
     * 查看所有部门
     */
    List<Department> listAllDepartment();

    /**
     * 查看指定id的部门
     */
    List<Department> listDepartment(int id);

}
