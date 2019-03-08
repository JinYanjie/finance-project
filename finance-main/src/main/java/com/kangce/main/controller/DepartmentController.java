package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.DepartmentService;
import com.kangce.mybatis.model.Department;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "DepartmentController", description = "部门管理")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @ApiOperation("添加部门")
    @PostMapping(value = "/add")
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


    @ApiOperation("更新部门")
    @PostMapping("/update")
    @ResponseBody
    public Object updateDepartment(@RequestParam("id") byte id, @RequestParam("name") String name) {
        int count = departmentService.updateDepartment(id, name);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }


    @ApiOperation("删除部门")
    @PostMapping("/delete")
    @ResponseBody
    public Object deleteDepartment(@RequestParam("id") byte id) {
        int count = departmentService.deleteDepartment(id);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @ApiOperation("批量删除部门")
    @PostMapping("/delete/batch")
    @ResponseBody
    public Object deleteBatch(List<Byte> ids) {
        int count = departmentService.deletePartDepartment(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed("");
    }

    @ApiOperation("查询所有部门")
    @PostMapping("/all")
    @ResponseBody
    public Object listAll() {
        List<Department> departments = departmentService.listAllDepartment();
        return new CommonResult().success(departments);
    }

    @ApiOperation("查询指定部门")
    @PostMapping("/item")
    @ResponseBody
    public Object getDepartment(@RequestParam("id") byte id) {
        List<Department> departments = departmentService.listDepartment(id);

        return new CommonResult().success(departments);
    }

}
