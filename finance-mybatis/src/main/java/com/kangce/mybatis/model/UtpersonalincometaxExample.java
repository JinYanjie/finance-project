package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UtpersonalincometaxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtpersonalincometaxExample() {
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

        public Criteria andLevelmoneylowerIsNull() {
            addCriterion("levelMoneyLower is null");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerIsNotNull() {
            addCriterion("levelMoneyLower is not null");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerEqualTo(Float value) {
            addCriterion("levelMoneyLower =", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerNotEqualTo(Float value) {
            addCriterion("levelMoneyLower <>", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerGreaterThan(Float value) {
            addCriterion("levelMoneyLower >", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerGreaterThanOrEqualTo(Float value) {
            addCriterion("levelMoneyLower >=", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerLessThan(Float value) {
            addCriterion("levelMoneyLower <", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerLessThanOrEqualTo(Float value) {
            addCriterion("levelMoneyLower <=", value, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerIn(List<Float> values) {
            addCriterion("levelMoneyLower in", values, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerNotIn(List<Float> values) {
            addCriterion("levelMoneyLower not in", values, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerBetween(Float value1, Float value2) {
            addCriterion("levelMoneyLower between", value1, value2, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneylowerNotBetween(Float value1, Float value2) {
            addCriterion("levelMoneyLower not between", value1, value2, "levelmoneylower");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperIsNull() {
            addCriterion("levelMoneyUpper is null");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperIsNotNull() {
            addCriterion("levelMoneyUpper is not null");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperEqualTo(Float value) {
            addCriterion("levelMoneyUpper =", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperNotEqualTo(Float value) {
            addCriterion("levelMoneyUpper <>", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperGreaterThan(Float value) {
            addCriterion("levelMoneyUpper >", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperGreaterThanOrEqualTo(Float value) {
            addCriterion("levelMoneyUpper >=", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperLessThan(Float value) {
            addCriterion("levelMoneyUpper <", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperLessThanOrEqualTo(Float value) {
            addCriterion("levelMoneyUpper <=", value, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperIn(List<Float> values) {
            addCriterion("levelMoneyUpper in", values, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperNotIn(List<Float> values) {
            addCriterion("levelMoneyUpper not in", values, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperBetween(Float value1, Float value2) {
            addCriterion("levelMoneyUpper between", value1, value2, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andLevelmoneyupperNotBetween(Float value1, Float value2) {
            addCriterion("levelMoneyUpper not between", value1, value2, "levelmoneyupper");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Float value) {
            addCriterion("taxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Float value) {
            addCriterion("taxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Float value) {
            addCriterion("taxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Float value) {
            addCriterion("taxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Float value) {
            addCriterion("taxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Float value) {
            addCriterion("taxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Float> values) {
            addCriterion("taxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Float> values) {
            addCriterion("taxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Float value1, Float value2) {
            addCriterion("taxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Float value1, Float value2) {
            addCriterion("taxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumIsNull() {
            addCriterion("quickCalNum is null");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumIsNotNull() {
            addCriterion("quickCalNum is not null");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumEqualTo(Float value) {
            addCriterion("quickCalNum =", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumNotEqualTo(Float value) {
            addCriterion("quickCalNum <>", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumGreaterThan(Float value) {
            addCriterion("quickCalNum >", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumGreaterThanOrEqualTo(Float value) {
            addCriterion("quickCalNum >=", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumLessThan(Float value) {
            addCriterion("quickCalNum <", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumLessThanOrEqualTo(Float value) {
            addCriterion("quickCalNum <=", value, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumIn(List<Float> values) {
            addCriterion("quickCalNum in", values, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumNotIn(List<Float> values) {
            addCriterion("quickCalNum not in", values, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumBetween(Float value1, Float value2) {
            addCriterion("quickCalNum between", value1, value2, "quickcalnum");
            return (Criteria) this;
        }

        public Criteria andQuickcalnumNotBetween(Float value1, Float value2) {
            addCriterion("quickCalNum not between", value1, value2, "quickcalnum");
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