package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utpersonalincometax implements Serializable {
    private Integer id;

    private Float levelmoneylower;

    private Float levelmoneyupper;

    private Float taxrate;

    private Float quickcalnum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLevelmoneylower() {
        return levelmoneylower;
    }

    public void setLevelmoneylower(Float levelmoneylower) {
        this.levelmoneylower = levelmoneylower;
    }

    public Float getLevelmoneyupper() {
        return levelmoneyupper;
    }

    public void setLevelmoneyupper(Float levelmoneyupper) {
        this.levelmoneyupper = levelmoneyupper;
    }

    public Float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Float taxrate) {
        this.taxrate = taxrate;
    }

    public Float getQuickcalnum() {
        return quickcalnum;
    }

    public void setQuickcalnum(Float quickcalnum) {
        this.quickcalnum = quickcalnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", levelmoneylower=").append(levelmoneylower);
        sb.append(", levelmoneyupper=").append(levelmoneyupper);
        sb.append(", taxrate=").append(taxrate);
        sb.append(", quickcalnum=").append(quickcalnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}