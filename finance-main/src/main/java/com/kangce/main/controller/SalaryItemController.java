package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.dto.SalaryItemParam;
import com.kangce.main.service.SalaryItemService;
import com.kangce.mybatis.model.SalaryItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "salary-item", description = "工资录入")
@RequestMapping("/salary")
public class SalaryItemController {

    @Autowired
    SalaryItemService salaryItemService;

    @ApiOperation(value = "录入工资")
    @PostMapping(value = "/add")
    @ResponseBody
    public Object addSalary(@RequestBody SalaryItemParam salaryItemParam) {
        SalaryItem salaryItem = salaryItemService.addSalaryItem(salaryItemParam);
        if (salaryItem == null) {
            return new CommonResult().failed("录入失败");
        }
        return new CommonResult().success(salaryItem);
    }


    @ApiOperation(value = "获取近一次工资录入情况")
    @PostMapping(value = "/get")
    @ResponseBody
    public Object getSalary(@RequestParam int sId) {
        SalaryItem salaryItem = salaryItemService.getSalaryItem(sId);
        if (salaryItem == null) {
            return new CommonResult().failed("获取失败");
        }
        return new CommonResult().success(salaryItem);
    }


    @ApiOperation(value = "获取录入的员工信息")
    @PostMapping(value = "/get/staffSalary")
    @ResponseBody
    public Object getSalaryStaff() {
        List<Map<String, Object>> salaryStaff = salaryItemService.getSalaryStaff();
        if (salaryStaff == null) {
            return new CommonResult().failed("获取失败");
        }
        return new CommonResult().success(salaryStaff);
    }

}
