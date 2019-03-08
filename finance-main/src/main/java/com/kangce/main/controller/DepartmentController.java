package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.DepartmentService;
import com.kangce.mybatis.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Controller
@PreAuthorize("hasAnyAuthority('primary_administrator')")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestParam("name") String name) {

        int count = 0;
        try {
            count = departmentService.addDepartment(name);
        } catch (Exception e) {
            if (e instanceof org.springframework.dao.DuplicateKeyException) {
                return new CommonResult().failed(name + "已存在");
            }
        }
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object updateDepartment(@RequestParam("id") byte id, @RequestParam("name") String name) {
        int count = departmentService.updateDepartment(id, name);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object deleteDepartment(@RequestParam("id") byte id) {
        int count = departmentService.deleteDepartment(id);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @RequestMapping("/delete/batch")
    @ResponseBody
    public Object deleteBatch(List<Byte> ids) {
        int count = departmentService.deletePartDepartment(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @RequestMapping("/all")
    @ResponseBody
    public Object listAll() {
        List<Department> departments = departmentService.listAllDepartment();
        return new CommonResult().success(departments);
    }

    @RequestMapping("/item")
    @ResponseBody
    public Object getDepartment(@RequestParam("id") byte id) {
        List<Department> departments = departmentService.listDepartment(id);
        return new CommonResult().success(departments);
    }

}
