package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utprintsetting implements Serializable {
    private Integer id;

    private Integer printtype;

    private Integer datasendtype;

    private String templatepapername;

    private String papername;

    private Integer paperwidth;

    private Integer paperheight;

    private Integer topmargin;

    private Integer bottommargin;

    private Integer leftmargin;

    private Integer rightmargin;

    private Integer paperorient;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrinttype() {
        return printtype;
    }

    public void setPrinttype(Integer printtype) {
        this.printtype = printtype;
    }

    public Integer getDatasendtype() {
        return datasendtype;
    }

    public void setDatasendtype(Integer datasendtype) {
        this.datasendtype = datasendtype;
    }

    public String getTemplatepapername() {
        return templatepapername;
    }

    public void setTemplatepapername(String templatepapername) {
        this.templatepapername = templatepapername;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername;
    }

    public Integer getPaperwidth() {
        return paperwidth;
    }

    public void setPaperwidth(Integer paperwidth) {
        this.paperwidth = paperwidth;
    }

    public Integer getPaperheight() {
        return paperheight;
    }

    public void setPaperheight(Integer paperheight) {
        this.paperheight = paperheight;
    }

    public Integer getTopmargin() {
        return topmargin;
    }

    public void setTopmargin(Integer topmargin) {
        this.topmargin = topmargin;
    }

    public Integer getBottommargin() {
        return bottommargin;
    }

    public void setBottommargin(Integer bottommargin) {
        this.bottommargin = bottommargin;
    }

    public Integer getLeftmargin() {
        return leftmargin;
    }

    public void setLeftmargin(Integer leftmargin) {
        this.leftmargin = leftmargin;
    }

    public Integer getRightmargin() {
        return rightmargin;
    }

    public void setRightmargin(Integer rightmargin) {
        this.rightmargin = rightmargin;
    }

    public Integer getPaperorient() {
        return paperorient;
    }

    public void setPaperorient(Integer paperorient) {
        this.paperorient = paperorient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", printtype=").append(printtype);
        sb.append(", datasendtype=").append(datasendtype);
        sb.append(", templatepapername=").append(templatepapername);
        sb.append(", papername=").append(papername);
        sb.append(", paperwidth=").append(paperwidth);
        sb.append(", paperheight=").append(paperheight);
        sb.append(", topmargin=").append(topmargin);
        sb.append(", bottommargin=").append(bottommargin);
        sb.append(", leftmargin=").append(leftmargin);
        sb.append(", rightmargin=").append(rightmargin);
        sb.append(", paperorient=").append(paperorient);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}