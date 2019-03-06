package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utsalaryitem implements Serializable {
    private Integer id;

    private String siname;

    private Integer sitype;

    private Integer status;

    private Boolean isdefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiname() {
        return siname;
    }

    public void setSiname(String siname) {
        this.siname = siname;
    }

    public Integer getSitype() {
        return sitype;
    }

    public void setSitype(Integer sitype) {
        this.sitype = sitype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", siname=").append(siname);
        sb.append(", sitype=").append(sitype);
        sb.append(", status=").append(status);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}