package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.impl.SheetServiceImpl;
import com.kangce.mybatis.model.Utbasebalancesheet;
import com.kangce.mybatis.model.Utbasecashflowstatement;
import com.kangce.mybatis.model.Utbaseincomestatement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@Api(tags = "sheet-controller", description = "报表数据查询")
@RequestMapping("/sheet")
public class SheetController {
    @Autowired
    SheetServiceImpl sheetService;

    @ApiOperation("获取资产负债表")
    @PostMapping("getBalanceSheet")
    public Object getBalanceSheet(@RequestParam("type") int type) {
        List<Utbasebalancesheet> balanceSheet = sheetService.getBalanceSheet(type);
        if (balanceSheet == null) {
            return new CommonResult().failed("获取数据失败");
        } else {
            return new CommonResult().success(balanceSheet);
        }
    }

    @ApiOperation("获取现金流量表")
    @PostMapping("getCashFlowSheet")
    public Object getCashFlowSheet() {
        List<Utbasecashflowstatement> cashFlowSheet = sheetService.getCashFlowSheet();
        if (cashFlowSheet == null) {
            return new CommonResult().failed("获取数据失败");
        } else {
            return new CommonResult().success(cashFlowSheet);
        }
    }

    @ApiOperation("获取损益表")
    @PostMapping("getIncomeSheet")
    public Object getIncomeSheet() {
        List<Utbaseincomestatement> incomeSheet = sheetService.getIncomeSheet();
        if (incomeSheet == null) {
            return new CommonResult().failed("获取数据失败");
        } else {
            return new CommonResult().success(incomeSheet);
        }
    }

    @ApiOperation("获取工资分配表")
    @PostMapping("getAllocateSheet")
    public Object getAllocateSheet() {
        List<Map<String, Object>> allocationSheet = sheetService.getSalaryAllocation();
        if (allocationSheet == null) {
            return new CommonResult().failed("获取数据失败");
        } else {
            return new CommonResult().success(allocationSheet);
        }
    }
}
