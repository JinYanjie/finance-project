package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UtassettypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtassettypeExample() {
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

        public Criteria andAnumIsNull() {
            addCriterion("aNum is null");
            return (Criteria) this;
        }

        public Criteria andAnumIsNotNull() {
            addCriterion("aNum is not null");
            return (Criteria) this;
        }

        public Criteria andAnumEqualTo(String value) {
            addCriterion("aNum =", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotEqualTo(String value) {
            addCriterion("aNum <>", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumGreaterThan(String value) {
            addCriterion("aNum >", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumGreaterThanOrEqualTo(String value) {
            addCriterion("aNum >=", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumLessThan(String value) {
            addCriterion("aNum <", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumLessThanOrEqualTo(String value) {
            addCriterion("aNum <=", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumLike(String value) {
            addCriterion("aNum like", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotLike(String value) {
            addCriterion("aNum not like", value, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumIn(List<String> values) {
            addCriterion("aNum in", values, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotIn(List<String> values) {
            addCriterion("aNum not in", values, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumBetween(String value1, String value2) {
            addCriterion("aNum between", value1, value2, "anum");
            return (Criteria) this;
        }

        public Criteria andAnumNotBetween(String value1, String value2) {
            addCriterion("aNum not between", value1, value2, "anum");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aName is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aName is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aName =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aName <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aName >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aName >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aName <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aName <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aName like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aName not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aName in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aName not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aName between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aName not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andUseyearIsNull() {
            addCriterion("useYear is null");
            return (Criteria) this;
        }

        public Criteria andUseyearIsNotNull() {
            addCriterion("useYear is not null");
            return (Criteria) this;
        }

        public Criteria andUseyearEqualTo(Integer value) {
            addCriterion("useYear =", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearNotEqualTo(Integer value) {
            addCriterion("useYear <>", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearGreaterThan(Integer value) {
            addCriterion("useYear >", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("useYear >=", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearLessThan(Integer value) {
            addCriterion("useYear <", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearLessThanOrEqualTo(Integer value) {
            addCriterion("useYear <=", value, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearIn(List<Integer> values) {
            addCriterion("useYear in", values, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearNotIn(List<Integer> values) {
            addCriterion("useYear not in", values, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearBetween(Integer value1, Integer value2) {
            addCriterion("useYear between", value1, value2, "useyear");
            return (Criteria) this;
        }

        public Criteria andUseyearNotBetween(Integer value1, Integer value2) {
            addCriterion("useYear not between", value1, value2, "useyear");
            return (Criteria) this;
        }

        public Criteria andNetsalvageIsNull() {
            addCriterion("netSalvage is null");
            return (Criteria) this;
        }

        public Criteria andNetsalvageIsNotNull() {
            addCriterion("netSalvage is not null");
            return (Criteria) this;
        }

        public Criteria andNetsalvageEqualTo(Integer value) {
            addCriterion("netSalvage =", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageNotEqualTo(Integer value) {
            addCriterion("netSalvage <>", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageGreaterThan(Integer value) {
            addCriterion("netSalvage >", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageGreaterThanOrEqualTo(Integer value) {
            addCriterion("netSalvage >=", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageLessThan(Integer value) {
            addCriterion("netSalvage <", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageLessThanOrEqualTo(Integer value) {
            addCriterion("netSalvage <=", value, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageIn(List<Integer> values) {
            addCriterion("netSalvage in", values, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageNotIn(List<Integer> values) {
            addCriterion("netSalvage not in", values, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageBetween(Integer value1, Integer value2) {
            addCriterion("netSalvage between", value1, value2, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andNetsalvageNotBetween(Integer value1, Integer value2) {
            addCriterion("netSalvage not between", value1, value2, "netsalvage");
            return (Criteria) this;
        }

        public Criteria andDepreciationIsNull() {
            addCriterion("depreciation is null");
            return (Criteria) this;
        }

        public Criteria andDepreciationIsNotNull() {
            addCriterion("depreciation is not null");
            return (Criteria) this;
        }

        public Criteria andDepreciationEqualTo(Integer value) {
            addCriterion("depreciation =", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationNotEqualTo(Integer value) {
            addCriterion("depreciation <>", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationGreaterThan(Integer value) {
            addCriterion("depreciation >", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationGreaterThanOrEqualTo(Integer value) {
            addCriterion("depreciation >=", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationLessThan(Integer value) {
            addCriterion("depreciation <", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationLessThanOrEqualTo(Integer value) {
            addCriterion("depreciation <=", value, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationIn(List<Integer> values) {
            addCriterion("depreciation in", values, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationNotIn(List<Integer> values) {
            addCriterion("depreciation not in", values, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationBetween(Integer value1, Integer value2) {
            addCriterion("depreciation between", value1, value2, "depreciation");
            return (Criteria) this;
        }

        public Criteria andDepreciationNotBetween(Integer value1, Integer value2) {
            addCriterion("depreciation not between", value1, value2, "depreciation");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeIsNull() {
            addCriterion("encodingType is null");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeIsNotNull() {
            addCriterion("encodingType is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeEqualTo(String value) {
            addCriterion("encodingType =", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeNotEqualTo(String value) {
            addCriterion("encodingType <>", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeGreaterThan(String value) {
            addCriterion("encodingType >", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("encodingType >=", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeLessThan(String value) {
            addCriterion("encodingType <", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeLessThanOrEqualTo(String value) {
            addCriterion("encodingType <=", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeLike(String value) {
            addCriterion("encodingType like", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeNotLike(String value) {
            addCriterion("encodingType not like", value, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeIn(List<String> values) {
            addCriterion("encodingType in", values, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeNotIn(List<String> values) {
            addCriterion("encodingType not in", values, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeBetween(String value1, String value2) {
            addCriterion("encodingType between", value1, value2, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andEncodingtypeNotBetween(String value1, String value2) {
            addCriterion("encodingType not between", value1, value2, "encodingtype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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