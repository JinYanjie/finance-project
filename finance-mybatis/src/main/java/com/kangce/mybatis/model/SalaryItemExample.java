package com.kangce.mybatis.model;

import java.math.BigDecimal;
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

        public Criteria andBaseSalaryIsNull() {
            addCriterion("base_salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("base_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(BigDecimal value) {
            addCriterion("base_salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(BigDecimal value) {
            addCriterion("base_salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(BigDecimal value) {
            addCriterion("base_salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(BigDecimal value) {
            addCriterion("base_salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<BigDecimal> values) {
            addCriterion("base_salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<BigDecimal> values) {
            addCriterion("base_salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIsNull() {
            addCriterion("job_salary is null");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIsNotNull() {
            addCriterion("job_salary is not null");
            return (Criteria) this;
        }

        public Criteria andJobSalaryEqualTo(BigDecimal value) {
            addCriterion("job_salary =", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotEqualTo(BigDecimal value) {
            addCriterion("job_salary <>", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryGreaterThan(BigDecimal value) {
            addCriterion("job_salary >", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("job_salary >=", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryLessThan(BigDecimal value) {
            addCriterion("job_salary <", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("job_salary <=", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIn(List<BigDecimal> values) {
            addCriterion("job_salary in", values, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotIn(List<BigDecimal> values) {
            addCriterion("job_salary not in", values, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("job_salary between", value1, value2, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("job_salary not between", value1, value2, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andAddSalaryIsNull() {
            addCriterion("add_salary is null");
            return (Criteria) this;
        }

        public Criteria andAddSalaryIsNotNull() {
            addCriterion("add_salary is not null");
            return (Criteria) this;
        }

        public Criteria andAddSalaryEqualTo(BigDecimal value) {
            addCriterion("add_salary =", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryNotEqualTo(BigDecimal value) {
            addCriterion("add_salary <>", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryGreaterThan(BigDecimal value) {
            addCriterion("add_salary >", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("add_salary >=", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryLessThan(BigDecimal value) {
            addCriterion("add_salary <", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("add_salary <=", value, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryIn(List<BigDecimal> values) {
            addCriterion("add_salary in", values, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryNotIn(List<BigDecimal> values) {
            addCriterion("add_salary not in", values, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_salary between", value1, value2, "addSalary");
            return (Criteria) this;
        }

        public Criteria andAddSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_salary not between", value1, value2, "addSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryIsNull() {
            addCriterion("perform_salary is null");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryIsNotNull() {
            addCriterion("perform_salary is not null");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryEqualTo(BigDecimal value) {
            addCriterion("perform_salary =", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryNotEqualTo(BigDecimal value) {
            addCriterion("perform_salary <>", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryGreaterThan(BigDecimal value) {
            addCriterion("perform_salary >", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("perform_salary >=", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryLessThan(BigDecimal value) {
            addCriterion("perform_salary <", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("perform_salary <=", value, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryIn(List<BigDecimal> values) {
            addCriterion("perform_salary in", values, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryNotIn(List<BigDecimal> values) {
            addCriterion("perform_salary not in", values, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perform_salary between", value1, value2, "performSalary");
            return (Criteria) this;
        }

        public Criteria andPerformSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("perform_salary not between", value1, value2, "performSalary");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNull() {
            addCriterion("welfare is null");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNotNull() {
            addCriterion("welfare is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareEqualTo(BigDecimal value) {
            addCriterion("welfare =", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotEqualTo(BigDecimal value) {
            addCriterion("welfare <>", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThan(BigDecimal value) {
            addCriterion("welfare >", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("welfare >=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThan(BigDecimal value) {
            addCriterion("welfare <", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("welfare <=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareIn(List<BigDecimal> values) {
            addCriterion("welfare in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotIn(List<BigDecimal> values) {
            addCriterion("welfare not in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("welfare between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("welfare not between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseIsNull() {
            addCriterion("reserved_funds_base is null");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseIsNotNull() {
            addCriterion("reserved_funds_base is not null");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseEqualTo(BigDecimal value) {
            addCriterion("reserved_funds_base =", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseNotEqualTo(BigDecimal value) {
            addCriterion("reserved_funds_base <>", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseGreaterThan(BigDecimal value) {
            addCriterion("reserved_funds_base >", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reserved_funds_base >=", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseLessThan(BigDecimal value) {
            addCriterion("reserved_funds_base <", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reserved_funds_base <=", value, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseIn(List<BigDecimal> values) {
            addCriterion("reserved_funds_base in", values, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseNotIn(List<BigDecimal> values) {
            addCriterion("reserved_funds_base not in", values, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserved_funds_base between", value1, value2, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserved_funds_base not between", value1, value2, "reservedFundsBase");
            return (Criteria) this;
        }

        public Criteria andReservedFundsIsNull() {
            addCriterion("reserved_funds is null");
            return (Criteria) this;
        }

        public Criteria andReservedFundsIsNotNull() {
            addCriterion("reserved_funds is not null");
            return (Criteria) this;
        }

        public Criteria andReservedFundsEqualTo(BigDecimal value) {
            addCriterion("reserved_funds =", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsNotEqualTo(BigDecimal value) {
            addCriterion("reserved_funds <>", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsGreaterThan(BigDecimal value) {
            addCriterion("reserved_funds >", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reserved_funds >=", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsLessThan(BigDecimal value) {
            addCriterion("reserved_funds <", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reserved_funds <=", value, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsIn(List<BigDecimal> values) {
            addCriterion("reserved_funds in", values, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsNotIn(List<BigDecimal> values) {
            addCriterion("reserved_funds not in", values, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserved_funds between", value1, value2, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andReservedFundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserved_funds not between", value1, value2, "reservedFunds");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseIsNull() {
            addCriterion("insure_medicine_base is null");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseIsNotNull() {
            addCriterion("insure_medicine_base is not null");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseEqualTo(BigDecimal value) {
            addCriterion("insure_medicine_base =", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseNotEqualTo(BigDecimal value) {
            addCriterion("insure_medicine_base <>", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseGreaterThan(BigDecimal value) {
            addCriterion("insure_medicine_base >", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_medicine_base >=", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseLessThan(BigDecimal value) {
            addCriterion("insure_medicine_base <", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_medicine_base <=", value, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseIn(List<BigDecimal> values) {
            addCriterion("insure_medicine_base in", values, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseNotIn(List<BigDecimal> values) {
            addCriterion("insure_medicine_base not in", values, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_medicine_base between", value1, value2, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_medicine_base not between", value1, value2, "insureMedicineBase");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineIsNull() {
            addCriterion("insure_medicine is null");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineIsNotNull() {
            addCriterion("insure_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineEqualTo(BigDecimal value) {
            addCriterion("insure_medicine =", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineNotEqualTo(BigDecimal value) {
            addCriterion("insure_medicine <>", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineGreaterThan(BigDecimal value) {
            addCriterion("insure_medicine >", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_medicine >=", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineLessThan(BigDecimal value) {
            addCriterion("insure_medicine <", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_medicine <=", value, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineIn(List<BigDecimal> values) {
            addCriterion("insure_medicine in", values, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineNotIn(List<BigDecimal> values) {
            addCriterion("insure_medicine not in", values, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_medicine between", value1, value2, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsureMedicineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_medicine not between", value1, value2, "insureMedicine");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseIsNull() {
            addCriterion("insure_pension_base is null");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseIsNotNull() {
            addCriterion("insure_pension_base is not null");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseEqualTo(BigDecimal value) {
            addCriterion("insure_pension_base =", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseNotEqualTo(BigDecimal value) {
            addCriterion("insure_pension_base <>", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseGreaterThan(BigDecimal value) {
            addCriterion("insure_pension_base >", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_pension_base >=", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseLessThan(BigDecimal value) {
            addCriterion("insure_pension_base <", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_pension_base <=", value, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseIn(List<BigDecimal> values) {
            addCriterion("insure_pension_base in", values, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseNotIn(List<BigDecimal> values) {
            addCriterion("insure_pension_base not in", values, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_pension_base between", value1, value2, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_pension_base not between", value1, value2, "insurePensionBase");
            return (Criteria) this;
        }

        public Criteria andInsurePensionIsNull() {
            addCriterion("insure_pension is null");
            return (Criteria) this;
        }

        public Criteria andInsurePensionIsNotNull() {
            addCriterion("insure_pension is not null");
            return (Criteria) this;
        }

        public Criteria andInsurePensionEqualTo(BigDecimal value) {
            addCriterion("insure_pension =", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionNotEqualTo(BigDecimal value) {
            addCriterion("insure_pension <>", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionGreaterThan(BigDecimal value) {
            addCriterion("insure_pension >", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_pension >=", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionLessThan(BigDecimal value) {
            addCriterion("insure_pension <", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_pension <=", value, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionIn(List<BigDecimal> values) {
            addCriterion("insure_pension in", values, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionNotIn(List<BigDecimal> values) {
            addCriterion("insure_pension not in", values, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_pension between", value1, value2, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsurePensionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_pension not between", value1, value2, "insurePension");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseIsNull() {
            addCriterion("insure_job_base is null");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseIsNotNull() {
            addCriterion("insure_job_base is not null");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseEqualTo(BigDecimal value) {
            addCriterion("insure_job_base =", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseNotEqualTo(BigDecimal value) {
            addCriterion("insure_job_base <>", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseGreaterThan(BigDecimal value) {
            addCriterion("insure_job_base >", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_job_base >=", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseLessThan(BigDecimal value) {
            addCriterion("insure_job_base <", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_job_base <=", value, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseIn(List<BigDecimal> values) {
            addCriterion("insure_job_base in", values, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseNotIn(List<BigDecimal> values) {
            addCriterion("insure_job_base not in", values, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_job_base between", value1, value2, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_job_base not between", value1, value2, "insureJobBase");
            return (Criteria) this;
        }

        public Criteria andInsureJobIsNull() {
            addCriterion("insure_job is null");
            return (Criteria) this;
        }

        public Criteria andInsureJobIsNotNull() {
            addCriterion("insure_job is not null");
            return (Criteria) this;
        }

        public Criteria andInsureJobEqualTo(BigDecimal value) {
            addCriterion("insure_job =", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobNotEqualTo(BigDecimal value) {
            addCriterion("insure_job <>", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobGreaterThan(BigDecimal value) {
            addCriterion("insure_job >", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_job >=", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobLessThan(BigDecimal value) {
            addCriterion("insure_job <", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_job <=", value, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobIn(List<BigDecimal> values) {
            addCriterion("insure_job in", values, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobNotIn(List<BigDecimal> values) {
            addCriterion("insure_job not in", values, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_job between", value1, value2, "insureJob");
            return (Criteria) this;
        }

        public Criteria andInsureJobNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_job not between", value1, value2, "insureJob");
            return (Criteria) this;
        }

        public Criteria andAttandanceIsNull() {
            addCriterion("attandance is null");
            return (Criteria) this;
        }

        public Criteria andAttandanceIsNotNull() {
            addCriterion("attandance is not null");
            return (Criteria) this;
        }

        public Criteria andAttandanceEqualTo(BigDecimal value) {
            addCriterion("attandance =", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceNotEqualTo(BigDecimal value) {
            addCriterion("attandance <>", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceGreaterThan(BigDecimal value) {
            addCriterion("attandance >", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attandance >=", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceLessThan(BigDecimal value) {
            addCriterion("attandance <", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attandance <=", value, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceIn(List<BigDecimal> values) {
            addCriterion("attandance in", values, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceNotIn(List<BigDecimal> values) {
            addCriterion("attandance not in", values, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attandance between", value1, value2, "attandance");
            return (Criteria) this;
        }

        public Criteria andAttandanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attandance not between", value1, value2, "attandance");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("other_fee is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("other_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(BigDecimal value) {
            addCriterion("other_fee =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(BigDecimal value) {
            addCriterion("other_fee <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(BigDecimal value) {
            addCriterion("other_fee >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other_fee >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(BigDecimal value) {
            addCriterion("other_fee <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other_fee <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<BigDecimal> values) {
            addCriterion("other_fee in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<BigDecimal> values) {
            addCriterion("other_fee not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_fee between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other_fee not between", value1, value2, "otherFee");
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

        public Criteria andPTaxEqualTo(BigDecimal value) {
            addCriterion("p_tax =", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotEqualTo(BigDecimal value) {
            addCriterion("p_tax <>", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThan(BigDecimal value) {
            addCriterion("p_tax >", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_tax >=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThan(BigDecimal value) {
            addCriterion("p_tax <", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_tax <=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxIn(List<BigDecimal> values) {
            addCriterion("p_tax in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotIn(List<BigDecimal> values) {
            addCriterion("p_tax not in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_tax between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_tax not between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andChildEduIsNull() {
            addCriterion("child_edu is null");
            return (Criteria) this;
        }

        public Criteria andChildEduIsNotNull() {
            addCriterion("child_edu is not null");
            return (Criteria) this;
        }

        public Criteria andChildEduEqualTo(BigDecimal value) {
            addCriterion("child_edu =", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduNotEqualTo(BigDecimal value) {
            addCriterion("child_edu <>", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduGreaterThan(BigDecimal value) {
            addCriterion("child_edu >", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("child_edu >=", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduLessThan(BigDecimal value) {
            addCriterion("child_edu <", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduLessThanOrEqualTo(BigDecimal value) {
            addCriterion("child_edu <=", value, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduIn(List<BigDecimal> values) {
            addCriterion("child_edu in", values, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduNotIn(List<BigDecimal> values) {
            addCriterion("child_edu not in", values, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("child_edu between", value1, value2, "childEdu");
            return (Criteria) this;
        }

        public Criteria andChildEduNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("child_edu not between", value1, value2, "childEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduIsNull() {
            addCriterion("continue_edu is null");
            return (Criteria) this;
        }

        public Criteria andContinueEduIsNotNull() {
            addCriterion("continue_edu is not null");
            return (Criteria) this;
        }

        public Criteria andContinueEduEqualTo(BigDecimal value) {
            addCriterion("continue_edu =", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduNotEqualTo(BigDecimal value) {
            addCriterion("continue_edu <>", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduGreaterThan(BigDecimal value) {
            addCriterion("continue_edu >", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_edu >=", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduLessThan(BigDecimal value) {
            addCriterion("continue_edu <", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_edu <=", value, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduIn(List<BigDecimal> values) {
            addCriterion("continue_edu in", values, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduNotIn(List<BigDecimal> values) {
            addCriterion("continue_edu not in", values, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_edu between", value1, value2, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andContinueEduNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_edu not between", value1, value2, "continueEdu");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseIsNull() {
            addCriterion("big_disease is null");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseIsNotNull() {
            addCriterion("big_disease is not null");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseEqualTo(BigDecimal value) {
            addCriterion("big_disease =", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseNotEqualTo(BigDecimal value) {
            addCriterion("big_disease <>", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseGreaterThan(BigDecimal value) {
            addCriterion("big_disease >", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("big_disease >=", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseLessThan(BigDecimal value) {
            addCriterion("big_disease <", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("big_disease <=", value, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseIn(List<BigDecimal> values) {
            addCriterion("big_disease in", values, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseNotIn(List<BigDecimal> values) {
            addCriterion("big_disease not in", values, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_disease between", value1, value2, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andBigDiseaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("big_disease not between", value1, value2, "bigDisease");
            return (Criteria) this;
        }

        public Criteria andHomeLoanIsNull() {
            addCriterion("home_loan is null");
            return (Criteria) this;
        }

        public Criteria andHomeLoanIsNotNull() {
            addCriterion("home_loan is not null");
            return (Criteria) this;
        }

        public Criteria andHomeLoanEqualTo(BigDecimal value) {
            addCriterion("home_loan =", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanNotEqualTo(BigDecimal value) {
            addCriterion("home_loan <>", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanGreaterThan(BigDecimal value) {
            addCriterion("home_loan >", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("home_loan >=", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanLessThan(BigDecimal value) {
            addCriterion("home_loan <", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("home_loan <=", value, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanIn(List<BigDecimal> values) {
            addCriterion("home_loan in", values, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanNotIn(List<BigDecimal> values) {
            addCriterion("home_loan not in", values, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("home_loan between", value1, value2, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeLoanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("home_loan not between", value1, value2, "homeLoan");
            return (Criteria) this;
        }

        public Criteria andHomeRentIsNull() {
            addCriterion("home_rent is null");
            return (Criteria) this;
        }

        public Criteria andHomeRentIsNotNull() {
            addCriterion("home_rent is not null");
            return (Criteria) this;
        }

        public Criteria andHomeRentEqualTo(BigDecimal value) {
            addCriterion("home_rent =", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentNotEqualTo(BigDecimal value) {
            addCriterion("home_rent <>", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentGreaterThan(BigDecimal value) {
            addCriterion("home_rent >", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("home_rent >=", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentLessThan(BigDecimal value) {
            addCriterion("home_rent <", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("home_rent <=", value, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentIn(List<BigDecimal> values) {
            addCriterion("home_rent in", values, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentNotIn(List<BigDecimal> values) {
            addCriterion("home_rent not in", values, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("home_rent between", value1, value2, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHomeRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("home_rent not between", value1, value2, "homeRent");
            return (Criteria) this;
        }

        public Criteria andHelpOldIsNull() {
            addCriterion("help_old is null");
            return (Criteria) this;
        }

        public Criteria andHelpOldIsNotNull() {
            addCriterion("help_old is not null");
            return (Criteria) this;
        }

        public Criteria andHelpOldEqualTo(BigDecimal value) {
            addCriterion("help_old =", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldNotEqualTo(BigDecimal value) {
            addCriterion("help_old <>", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldGreaterThan(BigDecimal value) {
            addCriterion("help_old >", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("help_old >=", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldLessThan(BigDecimal value) {
            addCriterion("help_old <", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("help_old <=", value, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldIn(List<BigDecimal> values) {
            addCriterion("help_old in", values, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldNotIn(List<BigDecimal> values) {
            addCriterion("help_old not in", values, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_old between", value1, value2, "helpOld");
            return (Criteria) this;
        }

        public Criteria andHelpOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("help_old not between", value1, value2, "helpOld");
            return (Criteria) this;
        }

        public Criteria andReallySalaryIsNull() {
            addCriterion("really_salary is null");
            return (Criteria) this;
        }

        public Criteria andReallySalaryIsNotNull() {
            addCriterion("really_salary is not null");
            return (Criteria) this;
        }

        public Criteria andReallySalaryEqualTo(BigDecimal value) {
            addCriterion("really_salary =", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryNotEqualTo(BigDecimal value) {
            addCriterion("really_salary <>", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryGreaterThan(BigDecimal value) {
            addCriterion("really_salary >", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("really_salary >=", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryLessThan(BigDecimal value) {
            addCriterion("really_salary <", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("really_salary <=", value, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryIn(List<BigDecimal> values) {
            addCriterion("really_salary in", values, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryNotIn(List<BigDecimal> values) {
            addCriterion("really_salary not in", values, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("really_salary between", value1, value2, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andReallySalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("really_salary not between", value1, value2, "reallySalary");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
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