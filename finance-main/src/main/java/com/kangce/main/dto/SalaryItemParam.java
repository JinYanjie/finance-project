package com.kangce.main.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Getter
@Setter
public class SalaryItemParam {

    private int id;

    @ApiModelProperty(value = "员工id")
    @NotEmpty(message = "员工编号不能为空")
    private int sId;

    @ApiModelProperty(value = "员工姓名")
    @NotEmpty(message = "员工姓名不能为空")
    private String sName;

    @ApiModelProperty(value = "基本工资")
    private BigDecimal baseSalary;

    @ApiModelProperty(value = "职位工资")
    private BigDecimal jobSalary;


    @ApiModelProperty(value = "奖金")
    private BigDecimal bonus;

    @ApiModelProperty(value = "加班工资")
    private BigDecimal addSalary;

    @ApiModelProperty(value = "绩效工资")
    private BigDecimal performSalary;

    @ApiModelProperty(value = "福利")
    private BigDecimal welfare;

    @ApiModelProperty(value = "公积金基数")
    private BigDecimal reservedFundsBase;

    @ApiModelProperty(value = "公积金")
    private BigDecimal reservedFunds;

    @ApiModelProperty(value = "医疗保险基数")
    private BigDecimal insureMedicineBase;

    @ApiModelProperty(value = "医疗保险")
    private BigDecimal insureMedicine;

    @ApiModelProperty(value = "养老保险基数")
    private BigDecimal insurePensionBase;

    @ApiModelProperty(value = "养老保险")
    private BigDecimal insurePension;

    @ApiModelProperty(value = "失业保险基数")
    private BigDecimal insureJobBase;

    @ApiModelProperty(value = "失业保险")
    private BigDecimal insureJob;

    @ApiModelProperty(value = "考勤扣除")
    private BigDecimal attandance;

    @ApiModelProperty(value = "其他扣除")
    private BigDecimal otherFee;


    @ApiModelProperty(value = "个人所得税")
    private BigDecimal pTax;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "子女教育")
    private BigDecimal childEdu;


    @ApiModelProperty(value = "继续教育")
    private BigDecimal continueEdu;

    @ApiModelProperty(value = "大病医疗")
    private BigDecimal bigDisease;

    @ApiModelProperty(value = "住房贷款利息")
    private BigDecimal homeLoan;

    @ApiModelProperty(value = "住房租金")
    private BigDecimal homeRent;

    @ApiModelProperty(value = "赡养老人")
    private BigDecimal helpOld;

    @ApiModelProperty(value = "实发工资")
    private BigDecimal reallySalary;

    @ApiModelProperty(value = "工作状态")
    private int state;
}


