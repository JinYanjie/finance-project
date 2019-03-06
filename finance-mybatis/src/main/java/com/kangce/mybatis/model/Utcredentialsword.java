package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utcredentialsword implements Serializable {
    private Integer id;

    private String credentcontent;

    private String printtitle;

    private Integer whetherdefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCredentcontent() {
        return credentcontent;
    }

    public void setCredentcontent(String credentcontent) {
        this.credentcontent = credentcontent;
    }

    public String getPrinttitle() {
        return printtitle;
    }

    public void setPrinttitle(String printtitle) {
        this.printtitle = printtitle;
    }

    public Integer getWhetherdefault() {
        return whetherdefault;
    }

    public void setWhetherdefault(Integer whetherdefault) {
        this.whetherdefault = whetherdefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", credentcontent=").append(credentcontent);
        sb.append(", printtitle=").append(printtitle);
        sb.append(", whetherdefault=").append(whetherdefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}