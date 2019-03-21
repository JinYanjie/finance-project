package com.kangce.main.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

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
    private float sBase;

    @ApiModelProperty(value = "职位工资")
    private float sJob;


    @ApiModelProperty(value = "奖金")
    private float sAward;

    @ApiModelProperty(value = "加班工资")
    private float sExtra;

    @ApiModelProperty(value = "绩效工资")
    private float sPerform;

    @ApiModelProperty(value = "福利")
    private float sWelfare;

    @ApiModelProperty(value = "公积金基数")
    private float bAccumulation;

    @ApiModelProperty(value = "公积金")
    private float rAccumulation;

    @ApiModelProperty(value = "医疗保险基数")
    private float bInsureMedicine;

    @ApiModelProperty(value = "医疗保险")
    private float rInsureMedicine;

    @ApiModelProperty(value = "养老保险基数")
    private float bInsurePension;

    @ApiModelProperty(value = "养老保险")
    private float rInsurePension;

    @ApiModelProperty(value = "失业保险基数")
    private float bInsureJob;

    @ApiModelProperty(value = "失业保险")
    private float rInsureJob;

    @ApiModelProperty(value = "考勤扣除")
    private float checkInFee;

    @ApiModelProperty(value = "其他扣除")
    private float otherFee;

    @ApiModelProperty(value = "个人税率")
    private float taxRat;

    @ApiModelProperty(value = "个人所得税")
    private float pTax;

    @ApiModelProperty(value = "日期")
    private String date;


}


