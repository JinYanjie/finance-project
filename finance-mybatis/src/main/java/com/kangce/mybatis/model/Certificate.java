package com.kangce.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Certificate implements Serializable {
    /**
     * 凭证id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 凭证保存日期
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * 摘要（借方、贷方）
     *
     * @mbggenerated
     */
    private String summary;

    /**
     * 凭证号
     *
     * @mbggenerated
     */
    private String certificateNum;

    /**
     * 会计科目号
     *
     * @mbggenerated
     */
    private String cNum;

    /**
     * 会计科目名
     *
     * @mbggenerated
     */
    private String cName;

    /**
     * 借方金额
     *
     * @mbggenerated
     */
    private BigDecimal inMoney;

    /**
     * 贷方金额
     *
     * @mbggenerated
     */
    private BigDecimal outMoney;

    /**
     * 审核状态  1 已审核，2 未审核
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * 审核人id
     *
     * @mbggenerated
     */
    private Integer checkUserId;

    /**
     * 凭证类型  1 借方 2 贷方
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 当前是第几个某一类型的凭证 比如 记1、收1
     *
     * @mbggenerated
     */
    private Integer currentNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public BigDecimal getInMoney() {
        return inMoney;
    }

    public void setInMoney(BigDecimal inMoney) {
        this.inMoney = inMoney;
    }

    public BigDecimal getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(BigDecimal outMoney) {
        this.outMoney = outMoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", summary=").append(summary);
        sb.append(", certificateNum=").append(certificateNum);
        sb.append(", cNum=").append(cNum);
        sb.append(", cName=").append(cName);
        sb.append(", inMoney=").append(inMoney);
        sb.append(", outMoney=").append(outMoney);
        sb.append(", state=").append(state);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", type=").append(type);
        sb.append(", currentNum=").append(currentNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}