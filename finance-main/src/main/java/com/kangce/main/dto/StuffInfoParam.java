package com.kangce.main.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StuffInfoParam {
    /**
     * 职员编码
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 职员姓名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 性  别
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * 民    族
     *
     * @mbggenerated
     */
    private String nation;

    /**
     * 出生日期
     *
     * @mbggenerated
     */
    private String birthday;

    /**
     * 职员类别
     *
     * @mbggenerated
     */
    private Integer position;

    /**
     * 文化程度
     *
     * @mbggenerated
     */
    private Integer education;

    /**
     * 入职日期
     *
     * @mbggenerated
     */
    private Date inDate;

    /**
     * 职员状态
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * 职务
     *
     * @mbggenerated
     */
    private String job;

    /**
     * 部门
     *
     * @mbggenerated
     */
    private Integer department;

    /**
     * 离职日期
     *
     * @mbggenerated
     */
    private Date outDate;

    /**
     * 籍贯
     *
     * @mbggenerated
     */
    private String birthplace;

    /**
     * 身份证号码
     *
     * @mbggenerated
     */
    private String idCard;

    /**
     * 银行名称
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * 银行卡号
     *
     * @mbggenerated
     */
    private String bankNum;
}
