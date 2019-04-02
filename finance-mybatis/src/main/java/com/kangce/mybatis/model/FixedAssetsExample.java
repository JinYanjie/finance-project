package com.kangce.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FixedAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FixedAssetsExample() {
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

        public Criteria andAssetsNameIsNull() {
            addCriterion("assets_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetsNameIsNotNull() {
            addCriterion("assets_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsNameEqualTo(String value) {
            addCriterion("assets_name =", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotEqualTo(String value) {
            addCriterion("assets_name <>", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameGreaterThan(String value) {
            addCriterion("assets_name >", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameGreaterThanOrEqualTo(String value) {
            addCriterion("assets_name >=", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLessThan(String value) {
            addCriterion("assets_name <", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLessThanOrEqualTo(String value) {
            addCriterion("assets_name <=", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLike(String value) {
            addCriterion("assets_name like", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotLike(String value) {
            addCriterion("assets_name not like", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameIn(List<String> values) {
            addCriterion("assets_name in", values, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotIn(List<String> values) {
            addCriterion("assets_name not in", values, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameBetween(String value1, String value2) {
            addCriterion("assets_name between", value1, value2, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotBetween(String value1, String value2) {
            addCriterion("assets_name not between", value1, value2, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNull() {
            addCriterion("assets_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNotNull() {
            addCriterion("assets_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeEqualTo(Integer value) {
            addCriterion("assets_type =", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotEqualTo(Integer value) {
            addCriterion("assets_type <>", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThan(Integer value) {
            addCriterion("assets_type >", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("assets_type >=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThan(Integer value) {
            addCriterion("assets_type <", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("assets_type <=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIn(List<Integer> values) {
            addCriterion("assets_type in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotIn(List<Integer> values) {
            addCriterion("assets_type not in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeBetween(Integer value1, Integer value2) {
            addCriterion("assets_type between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("assets_type not between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeIsNull() {
            addCriterion("assets_code is null");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeIsNotNull() {
            addCriterion("assets_code is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeEqualTo(String value) {
            addCriterion("assets_code =", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeNotEqualTo(String value) {
            addCriterion("assets_code <>", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeGreaterThan(String value) {
            addCriterion("assets_code >", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("assets_code >=", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeLessThan(String value) {
            addCriterion("assets_code <", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeLessThanOrEqualTo(String value) {
            addCriterion("assets_code <=", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeLike(String value) {
            addCriterion("assets_code like", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeNotLike(String value) {
            addCriterion("assets_code not like", value, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeIn(List<String> values) {
            addCriterion("assets_code in", values, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeNotIn(List<String> values) {
            addCriterion("assets_code not in", values, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeBetween(String value1, String value2) {
            addCriterion("assets_code between", value1, value2, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andAssetsCodeNotBetween(String value1, String value2) {
            addCriterion("assets_code not between", value1, value2, "assetsCode");
            return (Criteria) this;
        }

        public Criteria andCountUnitIsNull() {
            addCriterion("count_unit is null");
            return (Criteria) this;
        }

        public Criteria andCountUnitIsNotNull() {
            addCriterion("count_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCountUnitEqualTo(String value) {
            addCriterion("count_unit =", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitNotEqualTo(String value) {
            addCriterion("count_unit <>", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitGreaterThan(String value) {
            addCriterion("count_unit >", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitGreaterThanOrEqualTo(String value) {
            addCriterion("count_unit >=", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitLessThan(String value) {
            addCriterion("count_unit <", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitLessThanOrEqualTo(String value) {
            addCriterion("count_unit <=", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitLike(String value) {
            addCriterion("count_unit like", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitNotLike(String value) {
            addCriterion("count_unit not like", value, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitIn(List<String> values) {
            addCriterion("count_unit in", values, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitNotIn(List<String> values) {
            addCriterion("count_unit not in", values, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitBetween(String value1, String value2) {
            addCriterion("count_unit between", value1, value2, "countUnit");
            return (Criteria) this;
        }

        public Criteria andCountUnitNotBetween(String value1, String value2) {
            addCriterion("count_unit not between", value1, value2, "countUnit");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("input_time is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("input_time is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(Date value) {
            addCriterion("input_time =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(Date value) {
            addCriterion("input_time <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(Date value) {
            addCriterion("input_time >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("input_time >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(Date value) {
            addCriterion("input_time <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(Date value) {
            addCriterion("input_time <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<Date> values) {
            addCriterion("input_time in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<Date> values) {
            addCriterion("input_time not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(Date value1, Date value2) {
            addCriterion("input_time between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(Date value1, Date value2) {
            addCriterion("input_time not between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNull() {
            addCriterion("use_status is null");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNotNull() {
            addCriterion("use_status is not null");
            return (Criteria) this;
        }

        public Criteria andUseStatusEqualTo(Integer value) {
            addCriterion("use_status =", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotEqualTo(Integer value) {
            addCriterion("use_status <>", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThan(Integer value) {
            addCriterion("use_status >", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_status >=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThan(Integer value) {
            addCriterion("use_status <", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("use_status <=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusIn(List<Integer> values) {
            addCriterion("use_status in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotIn(List<Integer> values) {
            addCriterion("use_status not in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusBetween(Integer value1, Integer value2) {
            addCriterion("use_status between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("use_status not between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andStorageAreaIsNull() {
            addCriterion("storage_area is null");
            return (Criteria) this;
        }

        public Criteria andStorageAreaIsNotNull() {
            addCriterion("storage_area is not null");
            return (Criteria) this;
        }

        public Criteria andStorageAreaEqualTo(String value) {
            addCriterion("storage_area =", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaNotEqualTo(String value) {
            addCriterion("storage_area <>", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaGreaterThan(String value) {
            addCriterion("storage_area >", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaGreaterThanOrEqualTo(String value) {
            addCriterion("storage_area >=", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaLessThan(String value) {
            addCriterion("storage_area <", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaLessThanOrEqualTo(String value) {
            addCriterion("storage_area <=", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaLike(String value) {
            addCriterion("storage_area like", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaNotLike(String value) {
            addCriterion("storage_area not like", value, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaIn(List<String> values) {
            addCriterion("storage_area in", values, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaNotIn(List<String> values) {
            addCriterion("storage_area not in", values, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaBetween(String value1, String value2) {
            addCriterion("storage_area between", value1, value2, "storageArea");
            return (Criteria) this;
        }

        public Criteria andStorageAreaNotBetween(String value1, String value2) {
            addCriterion("storage_area not between", value1, value2, "storageArea");
            return (Criteria) this;
        }

        public Criteria andChangeWayIsNull() {
            addCriterion("change_way is null");
            return (Criteria) this;
        }

        public Criteria andChangeWayIsNotNull() {
            addCriterion("change_way is not null");
            return (Criteria) this;
        }

        public Criteria andChangeWayEqualTo(Integer value) {
            addCriterion("change_way =", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayNotEqualTo(Integer value) {
            addCriterion("change_way <>", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayGreaterThan(Integer value) {
            addCriterion("change_way >", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_way >=", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayLessThan(Integer value) {
            addCriterion("change_way <", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayLessThanOrEqualTo(Integer value) {
            addCriterion("change_way <=", value, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayIn(List<Integer> values) {
            addCriterion("change_way in", values, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayNotIn(List<Integer> values) {
            addCriterion("change_way not in", values, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayBetween(Integer value1, Integer value2) {
            addCriterion("change_way between", value1, value2, "changeWay");
            return (Criteria) this;
        }

        public Criteria andChangeWayNotBetween(Integer value1, Integer value2) {
            addCriterion("change_way not between", value1, value2, "changeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayIsNull() {
            addCriterion("purpose_way is null");
            return (Criteria) this;
        }

        public Criteria andPurposeWayIsNotNull() {
            addCriterion("purpose_way is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeWayEqualTo(String value) {
            addCriterion("purpose_way =", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayNotEqualTo(String value) {
            addCriterion("purpose_way <>", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayGreaterThan(String value) {
            addCriterion("purpose_way >", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_way >=", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayLessThan(String value) {
            addCriterion("purpose_way <", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayLessThanOrEqualTo(String value) {
            addCriterion("purpose_way <=", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayLike(String value) {
            addCriterion("purpose_way like", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayNotLike(String value) {
            addCriterion("purpose_way not like", value, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayIn(List<String> values) {
            addCriterion("purpose_way in", values, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayNotIn(List<String> values) {
            addCriterion("purpose_way not in", values, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayBetween(String value1, String value2) {
            addCriterion("purpose_way between", value1, value2, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andPurposeWayNotBetween(String value1, String value2) {
            addCriterion("purpose_way not between", value1, value2, "purposeWay");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseIsNull() {
            addCriterion("department_use is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseIsNotNull() {
            addCriterion("department_use is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseEqualTo(Integer value) {
            addCriterion("department_use =", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseNotEqualTo(Integer value) {
            addCriterion("department_use <>", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseGreaterThan(Integer value) {
            addCriterion("department_use >", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_use >=", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseLessThan(Integer value) {
            addCriterion("department_use <", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseLessThanOrEqualTo(Integer value) {
            addCriterion("department_use <=", value, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseIn(List<Integer> values) {
            addCriterion("department_use in", values, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseNotIn(List<Integer> values) {
            addCriterion("department_use not in", values, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseBetween(Integer value1, Integer value2) {
            addCriterion("department_use between", value1, value2, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentUseNotBetween(Integer value1, Integer value2) {
            addCriterion("department_use not between", value1, value2, "departmentUse");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayIsNull() {
            addCriterion("depreciation_way is null");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayIsNotNull() {
            addCriterion("depreciation_way is not null");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayEqualTo(Integer value) {
            addCriterion("depreciation_way =", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayNotEqualTo(Integer value) {
            addCriterion("depreciation_way <>", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayGreaterThan(Integer value) {
            addCriterion("depreciation_way >", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("depreciation_way >=", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayLessThan(Integer value) {
            addCriterion("depreciation_way <", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayLessThanOrEqualTo(Integer value) {
            addCriterion("depreciation_way <=", value, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayIn(List<Integer> values) {
            addCriterion("depreciation_way in", values, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayNotIn(List<Integer> values) {
            addCriterion("depreciation_way not in", values, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayBetween(Integer value1, Integer value2) {
            addCriterion("depreciation_way between", value1, value2, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andDepreciationWayNotBetween(Integer value1, Integer value2) {
            addCriterion("depreciation_way not between", value1, value2, "depreciationWay");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueIsNull() {
            addCriterion("initial_asset_value is null");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueIsNotNull() {
            addCriterion("initial_asset_value is not null");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueEqualTo(BigDecimal value) {
            addCriterion("initial_asset_value =", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueNotEqualTo(BigDecimal value) {
            addCriterion("initial_asset_value <>", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueGreaterThan(BigDecimal value) {
            addCriterion("initial_asset_value >", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("initial_asset_value >=", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueLessThan(BigDecimal value) {
            addCriterion("initial_asset_value <", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("initial_asset_value <=", value, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueIn(List<BigDecimal> values) {
            addCriterion("initial_asset_value in", values, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueNotIn(List<BigDecimal> values) {
            addCriterion("initial_asset_value not in", values, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initial_asset_value between", value1, value2, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andInitialAssetValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("initial_asset_value not between", value1, value2, "initialAssetValue");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeIsNull() {
            addCriterion("estimated_use_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeIsNotNull() {
            addCriterion("estimated_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeEqualTo(Integer value) {
            addCriterion("estimated_use_time =", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeNotEqualTo(Integer value) {
            addCriterion("estimated_use_time <>", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeGreaterThan(Integer value) {
            addCriterion("estimated_use_time >", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("estimated_use_time >=", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeLessThan(Integer value) {
            addCriterion("estimated_use_time <", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("estimated_use_time <=", value, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeIn(List<Integer> values) {
            addCriterion("estimated_use_time in", values, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeNotIn(List<Integer> values) {
            addCriterion("estimated_use_time not in", values, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeBetween(Integer value1, Integer value2) {
            addCriterion("estimated_use_time between", value1, value2, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedUseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("estimated_use_time not between", value1, value2, "estimatedUseTime");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationIsNull() {
            addCriterion("month_depreciation is null");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationIsNotNull() {
            addCriterion("month_depreciation is not null");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationEqualTo(Float value) {
            addCriterion("month_depreciation =", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationNotEqualTo(Float value) {
            addCriterion("month_depreciation <>", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationGreaterThan(Float value) {
            addCriterion("month_depreciation >", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationGreaterThanOrEqualTo(Float value) {
            addCriterion("month_depreciation >=", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationLessThan(Float value) {
            addCriterion("month_depreciation <", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationLessThanOrEqualTo(Float value) {
            addCriterion("month_depreciation <=", value, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationIn(List<Float> values) {
            addCriterion("month_depreciation in", values, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationNotIn(List<Float> values) {
            addCriterion("month_depreciation not in", values, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationBetween(Float value1, Float value2) {
            addCriterion("month_depreciation between", value1, value2, "monthDepreciation");
            return (Criteria) this;
        }

        public Criteria andMonthDepreciationNotBetween(Float value1, Float value2) {
            addCriterion("month_depreciation not between", value1, value2, "monthDepreciation");
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