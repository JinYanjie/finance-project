package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UtdictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtdictionaryExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andDmemoIsNull() {
            addCriterion("dMemo is null");
            return (Criteria) this;
        }

        public Criteria andDmemoIsNotNull() {
            addCriterion("dMemo is not null");
            return (Criteria) this;
        }

        public Criteria andDmemoEqualTo(String value) {
            addCriterion("dMemo =", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoNotEqualTo(String value) {
            addCriterion("dMemo <>", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoGreaterThan(String value) {
            addCriterion("dMemo >", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoGreaterThanOrEqualTo(String value) {
            addCriterion("dMemo >=", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoLessThan(String value) {
            addCriterion("dMemo <", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoLessThanOrEqualTo(String value) {
            addCriterion("dMemo <=", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoLike(String value) {
            addCriterion("dMemo like", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoNotLike(String value) {
            addCriterion("dMemo not like", value, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoIn(List<String> values) {
            addCriterion("dMemo in", values, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoNotIn(List<String> values) {
            addCriterion("dMemo not in", values, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoBetween(String value1, String value2) {
            addCriterion("dMemo between", value1, value2, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDmemoNotBetween(String value1, String value2) {
            addCriterion("dMemo not between", value1, value2, "dmemo");
            return (Criteria) this;
        }

        public Criteria andDtypeIsNull() {
            addCriterion("dType is null");
            return (Criteria) this;
        }

        public Criteria andDtypeIsNotNull() {
            addCriterion("dType is not null");
            return (Criteria) this;
        }

        public Criteria andDtypeEqualTo(Integer value) {
            addCriterion("dType =", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotEqualTo(Integer value) {
            addCriterion("dType <>", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeGreaterThan(Integer value) {
            addCriterion("dType >", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dType >=", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeLessThan(Integer value) {
            addCriterion("dType <", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeLessThanOrEqualTo(Integer value) {
            addCriterion("dType <=", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeIn(List<Integer> values) {
            addCriterion("dType in", values, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotIn(List<Integer> values) {
            addCriterion("dType not in", values, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeBetween(Integer value1, Integer value2) {
            addCriterion("dType between", value1, value2, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dType not between", value1, value2, "dtype");
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