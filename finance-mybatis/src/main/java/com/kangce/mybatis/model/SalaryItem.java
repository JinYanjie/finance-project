package com.kangce.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class SalaryItem implements Serializable {
    /**
     * id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 员工编号
     *
     * @mbggenerated
     */
    private Integer sId;

    /**
     * 员工姓名
     *
     * @mbggenerated
     */
    private String sName;

    /**
     * 基本工资
     *
     * @mbggenerated
     */
    private Float sBase;

    /**
     * 职位工资
     *
     * @mbggenerated
     */
    private Float sJob;

    /**
     * 奖金
     *
     * @mbggenerated
     */
    private Float sAward;

    /**
     * 加班工资
     *
     * @mbggenerated
     */
    private Float sExrea;

    /**
     * 绩效工资
     *
     * @mbggenerated
     */
    private Float sPerform;

    /**
     * 福利
     *
     * @mbggenerated
     */
    private Float sWelfare;

    /**
     * 公积金基数
     *
     * @mbggenerated
     */
    private Float bAccumulation;

    /**
     * 住房公积金
     *
     * @mbggenerated
     */
    private Float rAccumulation;

    /**
     * 医疗保险基数
     *
     * @mbggenerated
     */
    private Float bInsureMedicine;

    /**
     * 医疗保险
     *
     * @mbggenerated
     */
    private Float rInsureMedicine;

    /**
     * 养老保险基数
     *
     * @mbggenerated
     */
    private Float bInsurePension;

    /**
     * 养老保险
     *
     * @mbggenerated
     */
    private Float rInsurePension;

    /**
     * 失业保险基数
     *
     * @mbggenerated
     */
    private Float bInsureJob;

    /**
     * 失业保险
     *
     * @mbggenerated
     */
    private Float rInsureJob;

    /**
     * 考勤扣除
     *
     * @mbggenerated
     */
    private Float checkInFree;

    /**
     * 其他扣除
     *
     * @mbggenerated
     */
    private Float otherFree;

    /**
     * 日期
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * 个人所得税
     *
     * @mbggenerated
     */
    private Float pTax;

    /**
     * 税率
     *
     * @mbggenerated
     */
    private Float taxRate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Float getsBase() {
        return sBase;
    }

    public void setsBase(Float sBase) {
        this.sBase = sBase;
    }

    public Float getsJob() {
        return sJob;
    }

    public void setsJob(Float sJob) {
        this.sJob = sJob;
    }

    public Float getsAward() {
        return sAward;
    }

    public void setsAward(Float sAward) {
        this.sAward = sAward;
    }

    public Float getsExrea() {
        return sExrea;
    }

    public void setsExrea(Float sExrea) {
        this.sExrea = sExrea;
    }

    public Float getsPerform() {
        return sPerform;
    }

    public void setsPerform(Float sPerform) {
        this.sPerform = sPerform;
    }

    public Float getsWelfare() {
        return sWelfare;
    }

    public void setsWelfare(Float sWelfare) {
        this.sWelfare = sWelfare;
    }

    public Float getbAccumulation() {
        return bAccumulation;
    }

    public void setbAccumulation(Float bAccumulation) {
        this.bAccumulation = bAccumulation;
    }

    public Float getrAccumulation() {
        return rAccumulation;
    }

    public void setrAccumulation(Float rAccumulation) {
        this.rAccumulation = rAccumulation;
    }

    public Float getbInsureMedicine() {
        return bInsureMedicine;
    }

    public void setbInsureMedicine(Float bInsureMedicine) {
        this.bInsureMedicine = bInsureMedicine;
    }

    public Float getrInsureMedicine() {
        return rInsureMedicine;
    }

    public void setrInsureMedicine(Float rInsureMedicine) {
        this.rInsureMedicine = rInsureMedicine;
    }

    public Float getbInsurePension() {
        return bInsurePension;
    }

    public void setbInsurePension(Float bInsurePension) {
        this.bInsurePension = bInsurePension;
    }

    public Float getrInsurePension() {
        return rInsurePension;
    }

    public void setrInsurePension(Float rInsurePension) {
        this.rInsurePension = rInsurePension;
    }

    public Float getbInsureJob() {
        return bInsureJob;
    }

    public void setbInsureJob(Float bInsureJob) {
        this.bInsureJob = bInsureJob;
    }

    public Float getrInsureJob() {
        return rInsureJob;
    }

    public void setrInsureJob(Float rInsureJob) {
        this.rInsureJob = rInsureJob;
    }

    public Float getCheckInFree() {
        return checkInFree;
    }

    public void setCheckInFree(Float checkInFree) {
        this.checkInFree = checkInFree;
    }

    public Float getOtherFree() {
        return otherFree;
    }

    public void setOtherFree(Float otherFree) {
        this.otherFree = otherFree;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getpTax() {
        return pTax;
    }

    public void setpTax(Float pTax) {
        this.pTax = pTax;
    }

    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sBase=").append(sBase);
        sb.append(", sJob=").append(sJob);
        sb.append(", sAward=").append(sAward);
        sb.append(", sExrea=").append(sExrea);
        sb.append(", sPerform=").append(sPerform);
        sb.append(", sWelfare=").append(sWelfare);
        sb.append(", bAccumulation=").append(bAccumulation);
        sb.append(", rAccumulation=").append(rAccumulation);
        sb.append(", bInsureMedicine=").append(bInsureMedicine);
        sb.append(", rInsureMedicine=").append(rInsureMedicine);
        sb.append(", bInsurePension=").append(bInsurePension);
        sb.append(", rInsurePension=").append(rInsurePension);
        sb.append(", bInsureJob=").append(bInsureJob);
        sb.append(", rInsureJob=").append(rInsureJob);
        sb.append(", checkInFree=").append(checkInFree);
        sb.append(", otherFree=").append(otherFree);
        sb.append(", date=").append(date);
        sb.append(", pTax=").append(pTax);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}