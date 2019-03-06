package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utassettype implements Serializable {
    private Integer id;

    private String anum;

    private String aname;

    private Integer useyear;

    private Integer netsalvage;

    private Integer depreciation;

    private String encodingtype;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnum() {
        return anum;
    }

    public void setAnum(String anum) {
        this.anum = anum;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getUseyear() {
        return useyear;
    }

    public void setUseyear(Integer useyear) {
        this.useyear = useyear;
    }

    public Integer getNetsalvage() {
        return netsalvage;
    }

    public void setNetsalvage(Integer netsalvage) {
        this.netsalvage = netsalvage;
    }

    public Integer getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(Integer depreciation) {
        this.depreciation = depreciation;
    }

    public String getEncodingtype() {
        return encodingtype;
    }

    public void setEncodingtype(String encodingtype) {
        this.encodingtype = encodingtype;
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
        sb.append(", anum=").append(anum);
        sb.append(", aname=").append(aname);
        sb.append(", useyear=").append(useyear);
        sb.append(", netsalvage=").append(netsalvage);
        sb.append(", depreciation=").append(depreciation);
        sb.append(", encodingtype=").append(encodingtype);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}