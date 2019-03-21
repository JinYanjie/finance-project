package com.kangce.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalaryItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryItemExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSBaseIsNull() {
            addCriterion("s_base is null");
            return (Criteria) this;
        }

        public Criteria andSBaseIsNotNull() {
            addCriterion("s_base is not null");
            return (Criteria) this;
        }

        public Criteria andSBaseEqualTo(Float value) {
            addCriterion("s_base =", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseNotEqualTo(Float value) {
            addCriterion("s_base <>", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseGreaterThan(Float value) {
            addCriterion("s_base >", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseGreaterThanOrEqualTo(Float value) {
            addCriterion("s_base >=", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseLessThan(Float value) {
            addCriterion("s_base <", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseLessThanOrEqualTo(Float value) {
            addCriterion("s_base <=", value, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseIn(List<Float> values) {
            addCriterion("s_base in", values, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseNotIn(List<Float> values) {
            addCriterion("s_base not in", values, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseBetween(Float value1, Float value2) {
            addCriterion("s_base between", value1, value2, "sBase");
            return (Criteria) this;
        }

        public Criteria andSBaseNotBetween(Float value1, Float value2) {
            addCriterion("s_base not between", value1, value2, "sBase");
            return (Criteria) this;
        }

        public Criteria andSJobIsNull() {
            addCriterion("s_job is null");
            return (Criteria) this;
        }

        public Criteria andSJobIsNotNull() {
            addCriterion("s_job is not null");
            return (Criteria) this;
        }

        public Criteria andSJobEqualTo(Float value) {
            addCriterion("s_job =", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotEqualTo(Float value) {
            addCriterion("s_job <>", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobGreaterThan(Float value) {
            addCriterion("s_job >", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobGreaterThanOrEqualTo(Float value) {
            addCriterion("s_job >=", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobLessThan(Float value) {
            addCriterion("s_job <", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobLessThanOrEqualTo(Float value) {
            addCriterion("s_job <=", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobIn(List<Float> values) {
            addCriterion("s_job in", values, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotIn(List<Float> values) {
            addCriterion("s_job not in", values, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobBetween(Float value1, Float value2) {
            addCriterion("s_job between", value1, value2, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotBetween(Float value1, Float value2) {
            addCriterion("s_job not between", value1, value2, "sJob");
            return (Criteria) this;
        }

        public Criteria andSAwardIsNull() {
            addCriterion("s_award is null");
            return (Criteria) this;
        }

        public Criteria andSAwardIsNotNull() {
            addCriterion("s_award is not null");
            return (Criteria) this;
        }

        public Criteria andSAwardEqualTo(Float value) {
            addCriterion("s_award =", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardNotEqualTo(Float value) {
            addCriterion("s_award <>", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardGreaterThan(Float value) {
            addCriterion("s_award >", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardGreaterThanOrEqualTo(Float value) {
            addCriterion("s_award >=", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardLessThan(Float value) {
            addCriterion("s_award <", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardLessThanOrEqualTo(Float value) {
            addCriterion("s_award <=", value, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardIn(List<Float> values) {
            addCriterion("s_award in", values, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardNotIn(List<Float> values) {
            addCriterion("s_award not in", values, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardBetween(Float value1, Float value2) {
            addCriterion("s_award between", value1, value2, "sAward");
            return (Criteria) this;
        }

        public Criteria andSAwardNotBetween(Float value1, Float value2) {
            addCriterion("s_award not between", value1, value2, "sAward");
            return (Criteria) this;
        }

        public Criteria andSExreaIsNull() {
            addCriterion("s_exrea is null");
            return (Criteria) this;
        }

        public Criteria andSExreaIsNotNull() {
            addCriterion("s_exrea is not null");
            return (Criteria) this;
        }

        public Criteria andSExreaEqualTo(Float value) {
            addCriterion("s_exrea =", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaNotEqualTo(Float value) {
            addCriterion("s_exrea <>", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaGreaterThan(Float value) {
            addCriterion("s_exrea >", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaGreaterThanOrEqualTo(Float value) {
            addCriterion("s_exrea >=", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaLessThan(Float value) {
            addCriterion("s_exrea <", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaLessThanOrEqualTo(Float value) {
            addCriterion("s_exrea <=", value, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaIn(List<Float> values) {
            addCriterion("s_exrea in", values, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaNotIn(List<Float> values) {
            addCriterion("s_exrea not in", values, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaBetween(Float value1, Float value2) {
            addCriterion("s_exrea between", value1, value2, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSExreaNotBetween(Float value1, Float value2) {
            addCriterion("s_exrea not between", value1, value2, "sExrea");
            return (Criteria) this;
        }

        public Criteria andSPerformIsNull() {
            addCriterion("s_perform is null");
            return (Criteria) this;
        }

        public Criteria andSPerformIsNotNull() {
            addCriterion("s_perform is not null");
            return (Criteria) this;
        }

        public Criteria andSPerformEqualTo(Float value) {
            addCriterion("s_perform =", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformNotEqualTo(Float value) {
            addCriterion("s_perform <>", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformGreaterThan(Float value) {
            addCriterion("s_perform >", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformGreaterThanOrEqualTo(Float value) {
            addCriterion("s_perform >=", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformLessThan(Float value) {
            addCriterion("s_perform <", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformLessThanOrEqualTo(Float value) {
            addCriterion("s_perform <=", value, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformIn(List<Float> values) {
            addCriterion("s_perform in", values, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformNotIn(List<Float> values) {
            addCriterion("s_perform not in", values, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformBetween(Float value1, Float value2) {
            addCriterion("s_perform between", value1, value2, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSPerformNotBetween(Float value1, Float value2) {
            addCriterion("s_perform not between", value1, value2, "sPerform");
            return (Criteria) this;
        }

        public Criteria andSWelfareIsNull() {
            addCriterion("s_welfare is null");
            return (Criteria) this;
        }

        public Criteria andSWelfareIsNotNull() {
            addCriterion("s_welfare is not null");
            return (Criteria) this;
        }

        public Criteria andSWelfareEqualTo(Float value) {
            addCriterion("s_welfare =", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareNotEqualTo(Float value) {
            addCriterion("s_welfare <>", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareGreaterThan(Float value) {
            addCriterion("s_welfare >", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareGreaterThanOrEqualTo(Float value) {
            addCriterion("s_welfare >=", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareLessThan(Float value) {
            addCriterion("s_welfare <", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareLessThanOrEqualTo(Float value) {
            addCriterion("s_welfare <=", value, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareIn(List<Float> values) {
            addCriterion("s_welfare in", values, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareNotIn(List<Float> values) {
            addCriterion("s_welfare not in", values, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareBetween(Float value1, Float value2) {
            addCriterion("s_welfare between", value1, value2, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andSWelfareNotBetween(Float value1, Float value2) {
            addCriterion("s_welfare not between", value1, value2, "sWelfare");
            return (Criteria) this;
        }

        public Criteria andBAccumulationIsNull() {
            addCriterion("b_accumulation is null");
            return (Criteria) this;
        }

        public Criteria andBAccumulationIsNotNull() {
            addCriterion("b_accumulation is not null");
            return (Criteria) this;
        }

        public Criteria andBAccumulationEqualTo(Float value) {
            addCriterion("b_accumulation =", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationNotEqualTo(Float value) {
            addCriterion("b_accumulation <>", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationGreaterThan(Float value) {
            addCriterion("b_accumulation >", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationGreaterThanOrEqualTo(Float value) {
            addCriterion("b_accumulation >=", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationLessThan(Float value) {
            addCriterion("b_accumulation <", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationLessThanOrEqualTo(Float value) {
            addCriterion("b_accumulation <=", value, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationIn(List<Float> values) {
            addCriterion("b_accumulation in", values, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationNotIn(List<Float> values) {
            addCriterion("b_accumulation not in", values, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationBetween(Float value1, Float value2) {
            addCriterion("b_accumulation between", value1, value2, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andBAccumulationNotBetween(Float value1, Float value2) {
            addCriterion("b_accumulation not between", value1, value2, "bAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationIsNull() {
            addCriterion("r_accumulation is null");
            return (Criteria) this;
        }

        public Criteria andRAccumulationIsNotNull() {
            addCriterion("r_accumulation is not null");
            return (Criteria) this;
        }

        public Criteria andRAccumulationEqualTo(Float value) {
            addCriterion("r_accumulation =", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationNotEqualTo(Float value) {
            addCriterion("r_accumulation <>", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationGreaterThan(Float value) {
            addCriterion("r_accumulation >", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationGreaterThanOrEqualTo(Float value) {
            addCriterion("r_accumulation >=", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationLessThan(Float value) {
            addCriterion("r_accumulation <", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationLessThanOrEqualTo(Float value) {
            addCriterion("r_accumulation <=", value, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationIn(List<Float> values) {
            addCriterion("r_accumulation in", values, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationNotIn(List<Float> values) {
            addCriterion("r_accumulation not in", values, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationBetween(Float value1, Float value2) {
            addCriterion("r_accumulation between", value1, value2, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andRAccumulationNotBetween(Float value1, Float value2) {
            addCriterion("r_accumulation not between", value1, value2, "rAccumulation");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineIsNull() {
            addCriterion("b_insure_medicine is null");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineIsNotNull() {
            addCriterion("b_insure_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineEqualTo(Float value) {
            addCriterion("b_insure_medicine =", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineNotEqualTo(Float value) {
            addCriterion("b_insure_medicine <>", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineGreaterThan(Float value) {
            addCriterion("b_insure_medicine >", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineGreaterThanOrEqualTo(Float value) {
            addCriterion("b_insure_medicine >=", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineLessThan(Float value) {
            addCriterion("b_insure_medicine <", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineLessThanOrEqualTo(Float value) {
            addCriterion("b_insure_medicine <=", value, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineIn(List<Float> values) {
            addCriterion("b_insure_medicine in", values, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineNotIn(List<Float> values) {
            addCriterion("b_insure_medicine not in", values, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineBetween(Float value1, Float value2) {
            addCriterion("b_insure_medicine between", value1, value2, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsureMedicineNotBetween(Float value1, Float value2) {
            addCriterion("b_insure_medicine not between", value1, value2, "bInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineIsNull() {
            addCriterion("r_insure_medicine is null");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineIsNotNull() {
            addCriterion("r_insure_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineEqualTo(Float value) {
            addCriterion("r_insure_medicine =", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineNotEqualTo(Float value) {
            addCriterion("r_insure_medicine <>", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineGreaterThan(Float value) {
            addCriterion("r_insure_medicine >", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineGreaterThanOrEqualTo(Float value) {
            addCriterion("r_insure_medicine >=", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineLessThan(Float value) {
            addCriterion("r_insure_medicine <", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineLessThanOrEqualTo(Float value) {
            addCriterion("r_insure_medicine <=", value, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineIn(List<Float> values) {
            addCriterion("r_insure_medicine in", values, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineNotIn(List<Float> values) {
            addCriterion("r_insure_medicine not in", values, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineBetween(Float value1, Float value2) {
            addCriterion("r_insure_medicine between", value1, value2, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andRInsureMedicineNotBetween(Float value1, Float value2) {
            addCriterion("r_insure_medicine not between", value1, value2, "rInsureMedicine");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionIsNull() {
            addCriterion("b_insure_pension is null");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionIsNotNull() {
            addCriterion("b_insure_pension is not null");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionEqualTo(Float value) {
            addCriterion("b_insure_pension =", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionNotEqualTo(Float value) {
            addCriterion("b_insure_pension <>", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionGreaterThan(Float value) {
            addCriterion("b_insure_pension >", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionGreaterThanOrEqualTo(Float value) {
            addCriterion("b_insure_pension >=", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionLessThan(Float value) {
            addCriterion("b_insure_pension <", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionLessThanOrEqualTo(Float value) {
            addCriterion("b_insure_pension <=", value, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionIn(List<Float> values) {
            addCriterion("b_insure_pension in", values, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionNotIn(List<Float> values) {
            addCriterion("b_insure_pension not in", values, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionBetween(Float value1, Float value2) {
            addCriterion("b_insure_pension between", value1, value2, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsurePensionNotBetween(Float value1, Float value2) {
            addCriterion("b_insure_pension not between", value1, value2, "bInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionIsNull() {
            addCriterion("r_insure_pension is null");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionIsNotNull() {
            addCriterion("r_insure_pension is not null");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionEqualTo(Float value) {
            addCriterion("r_insure_pension =", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionNotEqualTo(Float value) {
            addCriterion("r_insure_pension <>", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionGreaterThan(Float value) {
            addCriterion("r_insure_pension >", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionGreaterThanOrEqualTo(Float value) {
            addCriterion("r_insure_pension >=", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionLessThan(Float value) {
            addCriterion("r_insure_pension <", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionLessThanOrEqualTo(Float value) {
            addCriterion("r_insure_pension <=", value, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionIn(List<Float> values) {
            addCriterion("r_insure_pension in", values, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionNotIn(List<Float> values) {
            addCriterion("r_insure_pension not in", values, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionBetween(Float value1, Float value2) {
            addCriterion("r_insure_pension between", value1, value2, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andRInsurePensionNotBetween(Float value1, Float value2) {
            addCriterion("r_insure_pension not between", value1, value2, "rInsurePension");
            return (Criteria) this;
        }

        public Criteria andBInsureJobIsNull() {
            addCriterion("b_insure_job is null");
            return (Criteria) this;
        }

        public Criteria andBInsureJobIsNotNull() {
            addCriterion("b_insure_job is not null");
            return (Criteria) this;
        }

        public Criteria andBInsureJobEqualTo(Float value) {
            addCriterion("b_insure_job =", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobNotEqualTo(Float value) {
            addCriterion("b_insure_job <>", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobGreaterThan(Float value) {
            addCriterion("b_insure_job >", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobGreaterThanOrEqualTo(Float value) {
            addCriterion("b_insure_job >=", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobLessThan(Float value) {
            addCriterion("b_insure_job <", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobLessThanOrEqualTo(Float value) {
            addCriterion("b_insure_job <=", value, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobIn(List<Float> values) {
            addCriterion("b_insure_job in", values, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobNotIn(List<Float> values) {
            addCriterion("b_insure_job not in", values, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobBetween(Float value1, Float value2) {
            addCriterion("b_insure_job between", value1, value2, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andBInsureJobNotBetween(Float value1, Float value2) {
            addCriterion("b_insure_job not between", value1, value2, "bInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobIsNull() {
            addCriterion("r_insure_job is null");
            return (Criteria) this;
        }

        public Criteria andRInsureJobIsNotNull() {
            addCriterion("r_insure_job is not null");
            return (Criteria) this;
        }

        public Criteria andRInsureJobEqualTo(Float value) {
            addCriterion("r_insure_job =", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobNotEqualTo(Float value) {
            addCriterion("r_insure_job <>", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobGreaterThan(Float value) {
            addCriterion("r_insure_job >", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobGreaterThanOrEqualTo(Float value) {
            addCriterion("r_insure_job >=", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobLessThan(Float value) {
            addCriterion("r_insure_job <", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobLessThanOrEqualTo(Float value) {
            addCriterion("r_insure_job <=", value, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobIn(List<Float> values) {
            addCriterion("r_insure_job in", values, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobNotIn(List<Float> values) {
            addCriterion("r_insure_job not in", values, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobBetween(Float value1, Float value2) {
            addCriterion("r_insure_job between", value1, value2, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andRInsureJobNotBetween(Float value1, Float value2) {
            addCriterion("r_insure_job not between", value1, value2, "rInsureJob");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeIsNull() {
            addCriterion("check_in_free is null");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeIsNotNull() {
            addCriterion("check_in_free is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeEqualTo(Float value) {
            addCriterion("check_in_free =", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeNotEqualTo(Float value) {
            addCriterion("check_in_free <>", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeGreaterThan(Float value) {
            addCriterion("check_in_free >", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeGreaterThanOrEqualTo(Float value) {
            addCriterion("check_in_free >=", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeLessThan(Float value) {
            addCriterion("check_in_free <", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeLessThanOrEqualTo(Float value) {
            addCriterion("check_in_free <=", value, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeIn(List<Float> values) {
            addCriterion("check_in_free in", values, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeNotIn(List<Float> values) {
            addCriterion("check_in_free not in", values, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeBetween(Float value1, Float value2) {
            addCriterion("check_in_free between", value1, value2, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andCheckInFreeNotBetween(Float value1, Float value2) {
            addCriterion("check_in_free not between", value1, value2, "checkInFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeIsNull() {
            addCriterion("other_free is null");
            return (Criteria) this;
        }

        public Criteria andOtherFreeIsNotNull() {
            addCriterion("other_free is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFreeEqualTo(Float value) {
            addCriterion("other_free =", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeNotEqualTo(Float value) {
            addCriterion("other_free <>", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeGreaterThan(Float value) {
            addCriterion("other_free >", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeGreaterThanOrEqualTo(Float value) {
            addCriterion("other_free >=", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeLessThan(Float value) {
            addCriterion("other_free <", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeLessThanOrEqualTo(Float value) {
            addCriterion("other_free <=", value, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeIn(List<Float> values) {
            addCriterion("other_free in", values, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeNotIn(List<Float> values) {
            addCriterion("other_free not in", values, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeBetween(Float value1, Float value2) {
            addCriterion("other_free between", value1, value2, "otherFree");
            return (Criteria) this;
        }

        public Criteria andOtherFreeNotBetween(Float value1, Float value2) {
            addCriterion("other_free not between", value1, value2, "otherFree");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andPTaxIsNull() {
            addCriterion("p_tax is null");
            return (Criteria) this;
        }

        public Criteria andPTaxIsNotNull() {
            addCriterion("p_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPTaxEqualTo(Float value) {
            addCriterion("p_tax =", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotEqualTo(Float value) {
            addCriterion("p_tax <>", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThan(Float value) {
            addCriterion("p_tax >", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("p_tax >=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThan(Float value) {
            addCriterion("p_tax <", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThanOrEqualTo(Float value) {
            addCriterion("p_tax <=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxIn(List<Float> values) {
            addCriterion("p_tax in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotIn(List<Float> values) {
            addCriterion("p_tax not in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxBetween(Float value1, Float value2) {
            addCriterion("p_tax between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotBetween(Float value1, Float value2) {
            addCriterion("p_tax not between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(Float value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(Float value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(Float value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(Float value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<Float> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<Float> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(Float value1, Float value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
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