package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UtprintsettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtprintsettingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrinttypeIsNull() {
            addCriterion("printType is null");
            return (Criteria) this;
        }

        public Criteria andPrinttypeIsNotNull() {
            addCriterion("printType is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttypeEqualTo(Integer value) {
            addCriterion("printType =", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeNotEqualTo(Integer value) {
            addCriterion("printType <>", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeGreaterThan(Integer value) {
            addCriterion("printType >", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("printType >=", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeLessThan(Integer value) {
            addCriterion("printType <", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeLessThanOrEqualTo(Integer value) {
            addCriterion("printType <=", value, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeIn(List<Integer> values) {
            addCriterion("printType in", values, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeNotIn(List<Integer> values) {
            addCriterion("printType not in", values, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeBetween(Integer value1, Integer value2) {
            addCriterion("printType between", value1, value2, "printtype");
            return (Criteria) this;
        }

        public Criteria andPrinttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("printType not between", value1, value2, "printtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeIsNull() {
            addCriterion("dataSendType is null");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeIsNotNull() {
            addCriterion("dataSendType is not null");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeEqualTo(Integer value) {
            addCriterion("dataSendType =", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeNotEqualTo(Integer value) {
            addCriterion("dataSendType <>", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeGreaterThan(Integer value) {
            addCriterion("dataSendType >", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataSendType >=", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeLessThan(Integer value) {
            addCriterion("dataSendType <", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeLessThanOrEqualTo(Integer value) {
            addCriterion("dataSendType <=", value, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeIn(List<Integer> values) {
            addCriterion("dataSendType in", values, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeNotIn(List<Integer> values) {
            addCriterion("dataSendType not in", values, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeBetween(Integer value1, Integer value2) {
            addCriterion("dataSendType between", value1, value2, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andDatasendtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dataSendType not between", value1, value2, "datasendtype");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameIsNull() {
            addCriterion("templatePaperName is null");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameIsNotNull() {
            addCriterion("templatePaperName is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameEqualTo(String value) {
            addCriterion("templatePaperName =", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameNotEqualTo(String value) {
            addCriterion("templatePaperName <>", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameGreaterThan(String value) {
            addCriterion("templatePaperName >", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameGreaterThanOrEqualTo(String value) {
            addCriterion("templatePaperName >=", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameLessThan(String value) {
            addCriterion("templatePaperName <", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameLessThanOrEqualTo(String value) {
            addCriterion("templatePaperName <=", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameLike(String value) {
            addCriterion("templatePaperName like", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameNotLike(String value) {
            addCriterion("templatePaperName not like", value, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameIn(List<String> values) {
            addCriterion("templatePaperName in", values, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameNotIn(List<String> values) {
            addCriterion("templatePaperName not in", values, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameBetween(String value1, String value2) {
            addCriterion("templatePaperName between", value1, value2, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andTemplatepapernameNotBetween(String value1, String value2) {
            addCriterion("templatePaperName not between", value1, value2, "templatepapername");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNull() {
            addCriterion("paperName is null");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNotNull() {
            addCriterion("paperName is not null");
            return (Criteria) this;
        }

        public Criteria andPapernameEqualTo(String value) {
            addCriterion("paperName =", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotEqualTo(String value) {
            addCriterion("paperName <>", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThan(String value) {
            addCriterion("paperName >", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThanOrEqualTo(String value) {
            addCriterion("paperName >=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThan(String value) {
            addCriterion("paperName <", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThanOrEqualTo(String value) {
            addCriterion("paperName <=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLike(String value) {
            addCriterion("paperName like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotLike(String value) {
            addCriterion("paperName not like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameIn(List<String> values) {
            addCriterion("paperName in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotIn(List<String> values) {
            addCriterion("paperName not in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameBetween(String value1, String value2) {
            addCriterion("paperName between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotBetween(String value1, String value2) {
            addCriterion("paperName not between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andPaperwidthIsNull() {
            addCriterion("paperWidth is null");
            return (Criteria) this;
        }

        public Criteria andPaperwidthIsNotNull() {
            addCriterion("paperWidth is not null");
            return (Criteria) this;
        }

        public Criteria andPaperwidthEqualTo(Integer value) {
            addCriterion("paperWidth =", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthNotEqualTo(Integer value) {
            addCriterion("paperWidth <>", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthGreaterThan(Integer value) {
            addCriterion("paperWidth >", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperWidth >=", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthLessThan(Integer value) {
            addCriterion("paperWidth <", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthLessThanOrEqualTo(Integer value) {
            addCriterion("paperWidth <=", value, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthIn(List<Integer> values) {
            addCriterion("paperWidth in", values, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthNotIn(List<Integer> values) {
            addCriterion("paperWidth not in", values, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthBetween(Integer value1, Integer value2) {
            addCriterion("paperWidth between", value1, value2, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("paperWidth not between", value1, value2, "paperwidth");
            return (Criteria) this;
        }

        public Criteria andPaperheightIsNull() {
            addCriterion("paperHeight is null");
            return (Criteria) this;
        }

        public Criteria andPaperheightIsNotNull() {
            addCriterion("paperHeight is not null");
            return (Criteria) this;
        }

        public Criteria andPaperheightEqualTo(Integer value) {
            addCriterion("paperHeight =", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightNotEqualTo(Integer value) {
            addCriterion("paperHeight <>", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightGreaterThan(Integer value) {
            addCriterion("paperHeight >", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperHeight >=", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightLessThan(Integer value) {
            addCriterion("paperHeight <", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightLessThanOrEqualTo(Integer value) {
            addCriterion("paperHeight <=", value, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightIn(List<Integer> values) {
            addCriterion("paperHeight in", values, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightNotIn(List<Integer> values) {
            addCriterion("paperHeight not in", values, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightBetween(Integer value1, Integer value2) {
            addCriterion("paperHeight between", value1, value2, "paperheight");
            return (Criteria) this;
        }

        public Criteria andPaperheightNotBetween(Integer value1, Integer value2) {
            addCriterion("paperHeight not between", value1, value2, "paperheight");
            return (Criteria) this;
        }

        public Criteria andTopmarginIsNull() {
            addCriterion("topMargin is null");
            return (Criteria) this;
        }

        public Criteria andTopmarginIsNotNull() {
            addCriterion("topMargin is not null");
            return (Criteria) this;
        }

        public Criteria andTopmarginEqualTo(Integer value) {
            addCriterion("topMargin =", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotEqualTo(Integer value) {
            addCriterion("topMargin <>", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginGreaterThan(Integer value) {
            addCriterion("topMargin >", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("topMargin >=", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginLessThan(Integer value) {
            addCriterion("topMargin <", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginLessThanOrEqualTo(Integer value) {
            addCriterion("topMargin <=", value, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginIn(List<Integer> values) {
            addCriterion("topMargin in", values, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotIn(List<Integer> values) {
            addCriterion("topMargin not in", values, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginBetween(Integer value1, Integer value2) {
            addCriterion("topMargin between", value1, value2, "topmargin");
            return (Criteria) this;
        }

        public Criteria andTopmarginNotBetween(Integer value1, Integer value2) {
            addCriterion("topMargin not between", value1, value2, "topmargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginIsNull() {
            addCriterion("bottomMargin is null");
            return (Criteria) this;
        }

        public Criteria andBottommarginIsNotNull() {
            addCriterion("bottomMargin is not null");
            return (Criteria) this;
        }

        public Criteria andBottommarginEqualTo(Integer value) {
            addCriterion("bottomMargin =", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotEqualTo(Integer value) {
            addCriterion("bottomMargin <>", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginGreaterThan(Integer value) {
            addCriterion("bottomMargin >", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("bottomMargin >=", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginLessThan(Integer value) {
            addCriterion("bottomMargin <", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginLessThanOrEqualTo(Integer value) {
            addCriterion("bottomMargin <=", value, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginIn(List<Integer> values) {
            addCriterion("bottomMargin in", values, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotIn(List<Integer> values) {
            addCriterion("bottomMargin not in", values, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginBetween(Integer value1, Integer value2) {
            addCriterion("bottomMargin between", value1, value2, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andBottommarginNotBetween(Integer value1, Integer value2) {
            addCriterion("bottomMargin not between", value1, value2, "bottommargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIsNull() {
            addCriterion("leftMargin is null");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIsNotNull() {
            addCriterion("leftMargin is not null");
            return (Criteria) this;
        }

        public Criteria andLeftmarginEqualTo(Integer value) {
            addCriterion("leftMargin =", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotEqualTo(Integer value) {
            addCriterion("leftMargin <>", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginGreaterThan(Integer value) {
            addCriterion("leftMargin >", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("leftMargin >=", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginLessThan(Integer value) {
            addCriterion("leftMargin <", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginLessThanOrEqualTo(Integer value) {
            addCriterion("leftMargin <=", value, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginIn(List<Integer> values) {
            addCriterion("leftMargin in", values, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotIn(List<Integer> values) {
            addCriterion("leftMargin not in", values, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginBetween(Integer value1, Integer value2) {
            addCriterion("leftMargin between", value1, value2, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andLeftmarginNotBetween(Integer value1, Integer value2) {
            addCriterion("leftMargin not between", value1, value2, "leftmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginIsNull() {
            addCriterion("rightMargin is null");
            return (Criteria) this;
        }

        public Criteria andRightmarginIsNotNull() {
            addCriterion("rightMargin is not null");
            return (Criteria) this;
        }

        public Criteria andRightmarginEqualTo(Integer value) {
            addCriterion("rightMargin =", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotEqualTo(Integer value) {
            addCriterion("rightMargin <>", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginGreaterThan(Integer value) {
            addCriterion("rightMargin >", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("rightMargin >=", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginLessThan(Integer value) {
            addCriterion("rightMargin <", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginLessThanOrEqualTo(Integer value) {
            addCriterion("rightMargin <=", value, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginIn(List<Integer> values) {
            addCriterion("rightMargin in", values, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotIn(List<Integer> values) {
            addCriterion("rightMargin not in", values, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginBetween(Integer value1, Integer value2) {
            addCriterion("rightMargin between", value1, value2, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andRightmarginNotBetween(Integer value1, Integer value2) {
            addCriterion("rightMargin not between", value1, value2, "rightmargin");
            return (Criteria) this;
        }

        public Criteria andPaperorientIsNull() {
            addCriterion("paperOrient is null");
            return (Criteria) this;
        }

        public Criteria andPaperorientIsNotNull() {
            addCriterion("paperOrient is not null");
            return (Criteria) this;
        }

        public Criteria andPaperorientEqualTo(Integer value) {
            addCriterion("paperOrient =", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientNotEqualTo(Integer value) {
            addCriterion("paperOrient <>", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientGreaterThan(Integer value) {
            addCriterion("paperOrient >", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperOrient >=", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientLessThan(Integer value) {
            addCriterion("paperOrient <", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientLessThanOrEqualTo(Integer value) {
            addCriterion("paperOrient <=", value, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientIn(List<Integer> values) {
            addCriterion("paperOrient in", values, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientNotIn(List<Integer> values) {
            addCriterion("paperOrient not in", values, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientBetween(Integer value1, Integer value2) {
            addCriterion("paperOrient between", value1, value2, "paperorient");
            return (Criteria) this;
        }

        public Criteria andPaperorientNotBetween(Integer value1, Integer value2) {
            addCriterion("paperOrient not between", value1, value2, "paperorient");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}