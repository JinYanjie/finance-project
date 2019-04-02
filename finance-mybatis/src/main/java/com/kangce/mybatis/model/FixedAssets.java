package com.kangce.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FixedAssets implements Serializable {
    /**
     * 主键id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 资产名称
     *
     * @mbggenerated
     */
    private String assetsName;

    /**
     * 资产类别
     *
     * @mbggenerated
     */
    private Integer assetsType;

    /**
     * 资产编号
     *
     * @mbggenerated
     */
    private String assetsCode;

    /**
     * 计量单位
     *
     * @mbggenerated
     */
    private String countUnit;

    /**
     * 规格型号
     *
     * @mbggenerated
     */
    private String specification;

    /**
     * 入账时间
     *
     * @mbggenerated
     */
    private Date inputTime;

    /**
     * 使用状态
     *
     * @mbggenerated
     */
    private Integer useStatus;

    /**
     * 存放地点
     *
     * @mbggenerated
     */
    private String storageArea;

    /**
     * 变动方式
     *
     * @mbggenerated
     */
    private Integer changeWay;

    /**
     * 经济用途
     *
     * @mbggenerated
     */
    private String purposeWay;

    /**
     * 供应商
     *
     * @mbggenerated
     */
    private String supplier;

    /**
     * 使用部门
     *
     * @mbggenerated
     */
    private Integer departmentUse;

    /**
     * 折旧方式
     *
     * @mbggenerated
     */
    private Integer depreciationWay;

    /**
     * 资产原值
     *
     * @mbggenerated
     */
    private BigDecimal initialAssetValue;

    /**
     * 预计使用时间
     *
     * @mbggenerated
     */
    private Integer estimatedUseTime;

    /**
     * 月折旧率
     *
     * @mbggenerated
     */
    private Float monthDepreciation;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public Integer getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(Integer assetsType) {
        this.assetsType = assetsType;
    }

    public String getAssetsCode() {
        return assetsCode;
    }

    public void setAssetsCode(String assetsCode) {
        this.assetsCode = assetsCode;
    }

    public String getCountUnit() {
        return countUnit;
    }

    public void setCountUnit(String countUnit) {
        this.countUnit = countUnit;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public String getStorageArea() {
        return storageArea;
    }

    public void setStorageArea(String storageArea) {
        this.storageArea = storageArea;
    }

    public Integer getChangeWay() {
        return changeWay;
    }

    public void setChangeWay(Integer changeWay) {
        this.changeWay = changeWay;
    }

    public String getPurposeWay() {
        return purposeWay;
    }

    public void setPurposeWay(String purposeWay) {
        this.purposeWay = purposeWay;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getDepartmentUse() {
        return departmentUse;
    }

    public void setDepartmentUse(Integer departmentUse) {
        this.departmentUse = departmentUse;
    }

    public Integer getDepreciationWay() {
        return depreciationWay;
    }

    public void setDepreciationWay(Integer depreciationWay) {
        this.depreciationWay = depreciationWay;
    }

    public BigDecimal getInitialAssetValue() {
        return initialAssetValue;
    }

    public void setInitialAssetValue(BigDecimal initialAssetValue) {
        this.initialAssetValue = initialAssetValue;
    }

    public Integer getEstimatedUseTime() {
        return estimatedUseTime;
    }

    public void setEstimatedUseTime(Integer estimatedUseTime) {
        this.estimatedUseTime = estimatedUseTime;
    }

    public Float getMonthDepreciation() {
        return monthDepreciation;
    }

    public void setMonthDepreciation(Float monthDepreciation) {
        this.monthDepreciation = monthDepreciation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", assetsName=").append(assetsName);
        sb.append(", assetsType=").append(assetsType);
        sb.append(", assetsCode=").append(assetsCode);
        sb.append(", countUnit=").append(countUnit);
        sb.append(", specification=").append(specification);
        sb.append(", inputTime=").append(inputTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", storageArea=").append(storageArea);
        sb.append(", changeWay=").append(changeWay);
        sb.append(", purposeWay=").append(purposeWay);
        sb.append(", supplier=").append(supplier);
        sb.append(", departmentUse=").append(departmentUse);
        sb.append(", depreciationWay=").append(depreciationWay);
        sb.append(", initialAssetValue=").append(initialAssetValue);
        sb.append(", estimatedUseTime=").append(estimatedUseTime);
        sb.append(", monthDepreciation=").append(monthDepreciation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}