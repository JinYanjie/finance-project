package com.kangce.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private BigDecimal baseSalary;

    /**
     * 职位工资
     *
     * @mbggenerated
     */
    private BigDecimal jobSalary;

    /**
     * 奖金
     *
     * @mbggenerated
     */
    private BigDecimal bonus;

    /**
     * 加班工资
     *
     * @mbggenerated
     */
    private BigDecimal addSalary;

    /**
     * 绩效工资
     *
     * @mbggenerated
     */
    private BigDecimal performSalary;

    /**
     * 福利
     *
     * @mbggenerated
     */
    private BigDecimal welfare;

    /**
     * 公积金基数
     *
     * @mbggenerated
     */
    private BigDecimal reservedFundsBase;

    /**
     * 住房公积金
     *
     * @mbggenerated
     */
    private BigDecimal reservedFunds;

    /**
     * 医疗保险基数
     *
     * @mbggenerated
     */
    private BigDecimal insureMedicineBase;

    /**
     * 医疗保险
     *
     * @mbggenerated
     */
    private BigDecimal insureMedicine;

    /**
     * 养老保险基数
     *
     * @mbggenerated
     */
    private BigDecimal insurePensionBase;

    /**
     * 养老保险
     *
     * @mbggenerated
     */
    private BigDecimal insurePension;

    /**
     * 失业保险基数
     *
     * @mbggenerated
     */
    private BigDecimal insureJobBase;

    /**
     * 失业保险
     *
     * @mbggenerated
     */
    private BigDecimal insureJob;

    /**
     * 考勤扣除
     *
     * @mbggenerated
     */
    private BigDecimal attandance;

    /**
     * 其他扣除
     *
     * @mbggenerated
     */
    private BigDecimal otherFee;

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
    private BigDecimal pTax;

    /**
     * 子女教育
     *
     * @mbggenerated
     */
    private BigDecimal childEdu;

    /**
     * 继续教育
     *
     * @mbggenerated
     */
    private BigDecimal continueEdu;

    /**
     * 大病医疗
     *
     * @mbggenerated
     */
    private BigDecimal bigDisease;

    /**
     * 住房贷款利息
     *
     * @mbggenerated
     */
    private BigDecimal homeLoan;

    /**
     * 住房租金
     *
     * @mbggenerated
     */
    private BigDecimal homeRent;

    /**
     * 赡养老人
     *
     * @mbggenerated
     */
    private BigDecimal helpOld;

    /**
     * 实发工资
     *
     * @mbggenerated
     */
    private BigDecimal reallySalary;

    /**
     * 工作状态
     *
     * @mbggenerated
     */
    private Integer state;

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

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(BigDecimal jobSalary) {
        this.jobSalary = jobSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getAddSalary() {
        return addSalary;
    }

    public void setAddSalary(BigDecimal addSalary) {
        this.addSalary = addSalary;
    }

    public BigDecimal getPerformSalary() {
        return performSalary;
    }

    public void setPerformSalary(BigDecimal performSalary) {
        this.performSalary = performSalary;
    }

    public BigDecimal getWelfare() {
        return welfare;
    }

    public void setWelfare(BigDecimal welfare) {
        this.welfare = welfare;
    }

    public BigDecimal getReservedFundsBase() {
        return reservedFundsBase;
    }

    public void setReservedFundsBase(BigDecimal reservedFundsBase) {
        this.reservedFundsBase = reservedFundsBase;
    }

    public BigDecimal getReservedFunds() {
        return reservedFunds;
    }

    public void setReservedFunds(BigDecimal reservedFunds) {
        this.reservedFunds = reservedFunds;
    }

    public BigDecimal getInsureMedicineBase() {
        return insureMedicineBase;
    }

    public void setInsureMedicineBase(BigDecimal insureMedicineBase) {
        this.insureMedicineBase = insureMedicineBase;
    }

    public BigDecimal getInsureMedicine() {
        return insureMedicine;
    }

    public void setInsureMedicine(BigDecimal insureMedicine) {
        this.insureMedicine = insureMedicine;
    }

    public BigDecimal getInsurePensionBase() {
        return insurePensionBase;
    }

    public void setInsurePensionBase(BigDecimal insurePensionBase) {
        this.insurePensionBase = insurePensionBase;
    }

    public BigDecimal getInsurePension() {
        return insurePension;
    }

    public void setInsurePension(BigDecimal insurePension) {
        this.insurePension = insurePension;
    }

    public BigDecimal getInsureJobBase() {
        return insureJobBase;
    }

    public void setInsureJobBase(BigDecimal insureJobBase) {
        this.insureJobBase = insureJobBase;
    }

    public BigDecimal getInsureJob() {
        return insureJob;
    }

    public void setInsureJob(BigDecimal insureJob) {
        this.insureJob = insureJob;
    }

    public BigDecimal getAttandance() {
        return attandance;
    }

    public void setAttandance(BigDecimal attandance) {
        this.attandance = attandance;
    }

    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getpTax() {
        return pTax;
    }

    public void setpTax(BigDecimal pTax) {
        this.pTax = pTax;
    }

    public BigDecimal getChildEdu() {
        return childEdu;
    }

    public void setChildEdu(BigDecimal childEdu) {
        this.childEdu = childEdu;
    }

    public BigDecimal getContinueEdu() {
        return continueEdu;
    }

    public void setContinueEdu(BigDecimal continueEdu) {
        this.continueEdu = continueEdu;
    }

    public BigDecimal getBigDisease() {
        return bigDisease;
    }

    public void setBigDisease(BigDecimal bigDisease) {
        this.bigDisease = bigDisease;
    }

    public BigDecimal getHomeLoan() {
        return homeLoan;
    }

    public void setHomeLoan(BigDecimal homeLoan) {
        this.homeLoan = homeLoan;
    }

    public BigDecimal getHomeRent() {
        return homeRent;
    }

    public void setHomeRent(BigDecimal homeRent) {
        this.homeRent = homeRent;
    }

    public BigDecimal getHelpOld() {
        return helpOld;
    }

    public void setHelpOld(BigDecimal helpOld) {
        this.helpOld = helpOld;
    }

    public BigDecimal getReallySalary() {
        return reallySalary;
    }

    public void setReallySalary(BigDecimal reallySalary) {
        this.reallySalary = reallySalary;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", jobSalary=").append(jobSalary);
        sb.append(", bonus=").append(bonus);
        sb.append(", addSalary=").append(addSalary);
        sb.append(", performSalary=").append(performSalary);
        sb.append(", welfare=").append(welfare);
        sb.append(", reservedFundsBase=").append(reservedFundsBase);
        sb.append(", reservedFunds=").append(reservedFunds);
        sb.append(", insureMedicineBase=").append(insureMedicineBase);
        sb.append(", insureMedicine=").append(insureMedicine);
        sb.append(", insurePensionBase=").append(insurePensionBase);
        sb.append(", insurePension=").append(insurePension);
        sb.append(", insureJobBase=").append(insureJobBase);
        sb.append(", insureJob=").append(insureJob);
        sb.append(", attandance=").append(attandance);
        sb.append(", otherFee=").append(otherFee);
        sb.append(", date=").append(date);
        sb.append(", pTax=").append(pTax);
        sb.append(", childEdu=").append(childEdu);
        sb.append(", continueEdu=").append(continueEdu);
        sb.append(", bigDisease=").append(bigDisease);
        sb.append(", homeLoan=").append(homeLoan);
        sb.append(", homeRent=").append(homeRent);
        sb.append(", helpOld=").append(helpOld);
        sb.append(", reallySalary=").append(reallySalary);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}