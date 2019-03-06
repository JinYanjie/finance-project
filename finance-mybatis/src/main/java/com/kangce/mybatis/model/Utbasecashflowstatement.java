package com.kangce.mybatis.model;

import java.io.Serializable;

public class Utbasecashflowstatement implements Serializable {
    private Integer id;

    private String name;

    private String rowstring;

    private Integer hierarchy;

    private String formula;

    private Integer priority;

    private Integer edition;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRowstring() {
        return rowstring;
    }

    public void setRowstring(String rowstring) {
        this.rowstring = rowstring;
    }

    public Integer getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Integer hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", rowstring=").append(rowstring);
        sb.append(", hierarchy=").append(hierarchy);
        sb.append(", formula=").append(formula);
        sb.append(", priority=").append(priority);
        sb.append(", edition=").append(edition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}