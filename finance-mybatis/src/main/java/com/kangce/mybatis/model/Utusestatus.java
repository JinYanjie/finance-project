package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utusestatus implements Serializable {
    private Integer id;

    private String snum;

    private String sname;

    private Boolean isdepr;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Boolean getIsdepr() {
        return isdepr;
    }

    public void setIsdepr(Boolean isdepr) {
        this.isdepr = isdepr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", snum=").append(snum);
        sb.append(", sname=").append(sname);
        sb.append(", isdepr=").append(isdepr);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}