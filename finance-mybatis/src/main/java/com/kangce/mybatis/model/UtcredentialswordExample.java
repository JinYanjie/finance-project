package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UtcredentialswordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtcredentialswordExample() {
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

        public Criteria andCredentcontentIsNull() {
            addCriterion("CredentContent is null");
            return (Criteria) this;
        }

        public Criteria andCredentcontentIsNotNull() {
            addCriterion("CredentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCredentcontentEqualTo(String value) {
            addCriterion("CredentContent =", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentNotEqualTo(String value) {
            addCriterion("CredentContent <>", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentGreaterThan(String value) {
            addCriterion("CredentContent >", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CredentContent >=", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentLessThan(String value) {
            addCriterion("CredentContent <", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentLessThanOrEqualTo(String value) {
            addCriterion("CredentContent <=", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentLike(String value) {
            addCriterion("CredentContent like", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentNotLike(String value) {
            addCriterion("CredentContent not like", value, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentIn(List<String> values) {
            addCriterion("CredentContent in", values, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentNotIn(List<String> values) {
            addCriterion("CredentContent not in", values, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentBetween(String value1, String value2) {
            addCriterion("CredentContent between", value1, value2, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andCredentcontentNotBetween(String value1, String value2) {
            addCriterion("CredentContent not between", value1, value2, "credentcontent");
            return (Criteria) this;
        }

        public Criteria andPrinttitleIsNull() {
            addCriterion("PrintTitle is null");
            return (Criteria) this;
        }

        public Criteria andPrinttitleIsNotNull() {
            addCriterion("PrintTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttitleEqualTo(String value) {
            addCriterion("PrintTitle =", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleNotEqualTo(String value) {
            addCriterion("PrintTitle <>", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleGreaterThan(String value) {
            addCriterion("PrintTitle >", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleGreaterThanOrEqualTo(String value) {
            addCriterion("PrintTitle >=", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleLessThan(String value) {
            addCriterion("PrintTitle <", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleLessThanOrEqualTo(String value) {
            addCriterion("PrintTitle <=", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleLike(String value) {
            addCriterion("PrintTitle like", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleNotLike(String value) {
            addCriterion("PrintTitle not like", value, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleIn(List<String> values) {
            addCriterion("PrintTitle in", values, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleNotIn(List<String> values) {
            addCriterion("PrintTitle not in", values, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleBetween(String value1, String value2) {
            addCriterion("PrintTitle between", value1, value2, "printtitle");
            return (Criteria) this;
        }

        public Criteria andPrinttitleNotBetween(String value1, String value2) {
            addCriterion("PrintTitle not between", value1, value2, "printtitle");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultIsNull() {
            addCriterion("WhetherDefault is null");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultIsNotNull() {
            addCriterion("WhetherDefault is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultEqualTo(Integer value) {
            addCriterion("WhetherDefault =", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultNotEqualTo(Integer value) {
            addCriterion("WhetherDefault <>", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultGreaterThan(Integer value) {
            addCriterion("WhetherDefault >", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("WhetherDefault >=", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultLessThan(Integer value) {
            addCriterion("WhetherDefault <", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("WhetherDefault <=", value, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultIn(List<Integer> values) {
            addCriterion("WhetherDefault in", values, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultNotIn(List<Integer> values) {
            addCriterion("WhetherDefault not in", values, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultBetween(Integer value1, Integer value2) {
            addCriterion("WhetherDefault between", value1, value2, "whetherdefault");
            return (Criteria) this;
        }

        public Criteria andWhetherdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("WhetherDefault not between", value1, value2, "whetherdefault");
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