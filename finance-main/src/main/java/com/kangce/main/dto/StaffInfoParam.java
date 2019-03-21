package com.kangce.main.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
public class StaffInfoParam {
    /**
     * 职员编码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "员工编号")
    private int id;

    /**
     * 职员姓名
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "员工姓名", required = true)
    @NotEmpty(message = "员工姓名不能为空")
    private String name;

    /**
     * 职员手机号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 性  别
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "性别", required = true)
    @NotEmpty(message = "性别不能为空")
    private String gender;

    /**
     * 民    族
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "民族")
    private String nation;

    /**
     * 出生日期
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "出生日期")
    private String birthday;

    /**
     * 职员类别
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "职员类别")
    private Integer position;

    /**
     * 文化程度
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "文化程度")
    private Integer education;

    /**
     * 入职日期
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "入职日期", required = true)
    @NotEmpty(message = "入职日期不能为空")
    private Date inDate;

    /**
     * 职员状态
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "职员状态")
    private Integer state;

    /**
     * 职务
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "职务")
    private String job;

    /**
     * 部门
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "部门")
    private Integer department;

    /**
     * 离职日期
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "离职日期")
    private Date outDate;

    /**
     * 籍贯
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "籍贯")
    private String birthplace;

    /**
     * 身份证号码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "身份证号码", required = true)
    @NotEmpty(message = "身份证不能为空")
    private String idCard;

    /**
     * 银行名称
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "银行名称")
    private String bankName;

    /**
     * 银行卡号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "银行卡号")
    private String bankNum;
}
