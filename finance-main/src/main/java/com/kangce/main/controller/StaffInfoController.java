package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.dto.StaffInfoParam;
import com.kangce.main.service.StaffInfoService;
import com.kangce.mybatis.model.StaffInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "staff-info-controller", description = "员工信息管理")
@RequestMapping("/staff")
public class StaffInfoController {
    @Autowired
    StaffInfoService staffInfoService;

    @ApiOperation(value = "添加员工")
    @PostMapping(value = "/add")
    @ResponseBody
    public Object addStaff(@RequestBody StaffInfoParam staffInfoParam) {
        StaffInfo staffInfo = staffInfoService.addStaff(staffInfoParam);
        if (staffInfo == null) {
            return new CommonResult().failed("插入失败");
        }
        return new CommonResult().success(staffInfo);
    }

    @ApiOperation(value = "修改员工")
    @PostMapping(value = "/update")
    @ResponseBody
    public Object updateStaff(@RequestBody StaffInfoParam staffInfoParam) {
        StaffInfo staffInfo = staffInfoService.updateStaff(staffInfoParam);
        if (staffInfo == null) {
            return new CommonResult().failed("修改失败");
        }
        return new CommonResult().success(staffInfo);
    }

    @ApiOperation(value = "删除员工")
    @PostMapping(value = "/del")
    @ResponseBody
    public Object delStaff(@RequestParam("id") int id) {
        int i = staffInfoService.delStaff(id);
        if (i > 0) {
            return new CommonResult().success(i);
        } else {
            return new CommonResult().failed("删除失败");
        }
    }

    @ApiOperation(value = "查询指定员工信息")
    @PostMapping(value = "/get")
    @ResponseBody
    public Object getStaffInfo(@RequestParam("id") int id) {
        StaffInfo staffInfo = staffInfoService.getStaffInfo(id);
        if (staffInfo != null) {
            return new CommonResult().success(staffInfo);
        } else {
            return new CommonResult().failed("获取失败");
        }
    }


    @ApiOperation(value = "或许某类员工信息")
    @PostMapping(value = "/getPatch")
    @ResponseBody
    public Object getBatchStaff(@RequestParam("keyword") String keyword, @RequestParam("pageNum") int pageNum,
                                @RequestParam("pageSize") int pageSize) {

        List<StaffInfo> batchStaff = staffInfoService.getBatchStaff(keyword, pageNum, pageSize);
        return new CommonResult().pageSuccess(batchStaff);
    }

    @ApiOperation(value = "分页获取所有员工信息")
    @PostMapping(value = "/all")
    @ResponseBody
    public Object getAllStaff(@RequestParam("pageNum") int pageNum,
                              @RequestParam("pageSize") int pageSize) {
        List<StaffInfo> batchStaff = staffInfoService.getAll(pageNum, pageSize);
        return new CommonResult().pageSuccess(batchStaff);
    }
}
