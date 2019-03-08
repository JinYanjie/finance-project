package com.kangce.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class StaffInfo implements Serializable {
    /**
     * 职员编码
     *
     * @mbggenerated
     */
    private Integer id;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", nation=").append(nation);
        sb.append(", birthday=").append(birthday);
        sb.append(", position=").append(position);
        sb.append(", education=").append(education);
        sb.append(", inDate=").append(inDate);
        sb.append(", state=").append(state);
        sb.append(", job=").append(job);
        sb.append(", department=").append(department);
        sb.append(", outDate=").append(outDate);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", idCard=").append(idCard);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankNum=").append(bankNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}