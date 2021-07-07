package com.gatz.discovery.modules.cidm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TOfficeBuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOfficeBuildingExample() {
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

        public Criteria andOfficeBldIdIsNull() {
            addCriterion("office_bld_id is null");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdIsNotNull() {
            addCriterion("office_bld_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdEqualTo(Long value) {
            addCriterion("office_bld_id =", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdNotEqualTo(Long value) {
            addCriterion("office_bld_id <>", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdGreaterThan(Long value) {
            addCriterion("office_bld_id >", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("office_bld_id >=", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdLessThan(Long value) {
            addCriterion("office_bld_id <", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdLessThanOrEqualTo(Long value) {
            addCriterion("office_bld_id <=", value, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdIn(List<Long> values) {
            addCriterion("office_bld_id in", values, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdNotIn(List<Long> values) {
            addCriterion("office_bld_id not in", values, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdBetween(Long value1, Long value2) {
            addCriterion("office_bld_id between", value1, value2, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andOfficeBldIdNotBetween(Long value1, Long value2) {
            addCriterion("office_bld_id not between", value1, value2, "officeBldId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdIsNull() {
            addCriterion("tinyvillage_id is null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdIsNotNull() {
            addCriterion("tinyvillage_id is not null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdEqualTo(Long value) {
            addCriterion("tinyvillage_id =", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotEqualTo(Long value) {
            addCriterion("tinyvillage_id <>", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdGreaterThan(Long value) {
            addCriterion("tinyvillage_id >", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tinyvillage_id >=", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdLessThan(Long value) {
            addCriterion("tinyvillage_id <", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdLessThanOrEqualTo(Long value) {
            addCriterion("tinyvillage_id <=", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdIn(List<Long> values) {
            addCriterion("tinyvillage_id in", values, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotIn(List<Long> values) {
            addCriterion("tinyvillage_id not in", values, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdBetween(Long value1, Long value2) {
            addCriterion("tinyvillage_id between", value1, value2, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotBetween(Long value1, Long value2) {
            addCriterion("tinyvillage_id not between", value1, value2, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBldGradeIsNull() {
            addCriterion("bld_grade is null");
            return (Criteria) this;
        }

        public Criteria andBldGradeIsNotNull() {
            addCriterion("bld_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBldGradeEqualTo(String value) {
            addCriterion("bld_grade =", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeNotEqualTo(String value) {
            addCriterion("bld_grade <>", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeGreaterThan(String value) {
            addCriterion("bld_grade >", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeGreaterThanOrEqualTo(String value) {
            addCriterion("bld_grade >=", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeLessThan(String value) {
            addCriterion("bld_grade <", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeLessThanOrEqualTo(String value) {
            addCriterion("bld_grade <=", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeLike(String value) {
            addCriterion("bld_grade like", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeNotLike(String value) {
            addCriterion("bld_grade not like", value, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeIn(List<String> values) {
            addCriterion("bld_grade in", values, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeNotIn(List<String> values) {
            addCriterion("bld_grade not in", values, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeBetween(String value1, String value2) {
            addCriterion("bld_grade between", value1, value2, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andBldGradeNotBetween(String value1, String value2) {
            addCriterion("bld_grade not between", value1, value2, "bldGrade");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIsNull() {
            addCriterion("management_type is null");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIsNotNull() {
            addCriterion("management_type is not null");
            return (Criteria) this;
        }

        public Criteria andManagementTypeEqualTo(String value) {
            addCriterion("management_type =", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotEqualTo(String value) {
            addCriterion("management_type <>", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeGreaterThan(String value) {
            addCriterion("management_type >", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("management_type >=", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeLessThan(String value) {
            addCriterion("management_type <", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeLessThanOrEqualTo(String value) {
            addCriterion("management_type <=", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeLike(String value) {
            addCriterion("management_type like", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotLike(String value) {
            addCriterion("management_type not like", value, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeIn(List<String> values) {
            addCriterion("management_type in", values, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotIn(List<String> values) {
            addCriterion("management_type not in", values, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeBetween(String value1, String value2) {
            addCriterion("management_type between", value1, value2, "managementType");
            return (Criteria) this;
        }

        public Criteria andManagementTypeNotBetween(String value1, String value2) {
            addCriterion("management_type not between", value1, value2, "managementType");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaIsNull() {
            addCriterion("buildup_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaIsNotNull() {
            addCriterion("buildup_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaEqualTo(Long value) {
            addCriterion("buildup_area =", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotEqualTo(Long value) {
            addCriterion("buildup_area <>", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaGreaterThan(Long value) {
            addCriterion("buildup_area >", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("buildup_area >=", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaLessThan(Long value) {
            addCriterion("buildup_area <", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaLessThanOrEqualTo(Long value) {
            addCriterion("buildup_area <=", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaIn(List<Long> values) {
            addCriterion("buildup_area in", values, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotIn(List<Long> values) {
            addCriterion("buildup_area not in", values, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaBetween(Long value1, Long value2) {
            addCriterion("buildup_area between", value1, value2, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotBetween(Long value1, Long value2) {
            addCriterion("buildup_area not between", value1, value2, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaIsNull() {
            addCriterion("sit_area is null");
            return (Criteria) this;
        }

        public Criteria andSitAreaIsNotNull() {
            addCriterion("sit_area is not null");
            return (Criteria) this;
        }

        public Criteria andSitAreaEqualTo(Long value) {
            addCriterion("sit_area =", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaNotEqualTo(Long value) {
            addCriterion("sit_area <>", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaGreaterThan(Long value) {
            addCriterion("sit_area >", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("sit_area >=", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaLessThan(Long value) {
            addCriterion("sit_area <", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaLessThanOrEqualTo(Long value) {
            addCriterion("sit_area <=", value, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaIn(List<Long> values) {
            addCriterion("sit_area in", values, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaNotIn(List<Long> values) {
            addCriterion("sit_area not in", values, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaBetween(Long value1, Long value2) {
            addCriterion("sit_area between", value1, value2, "sitArea");
            return (Criteria) this;
        }

        public Criteria andSitAreaNotBetween(Long value1, Long value2) {
            addCriterion("sit_area not between", value1, value2, "sitArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaIsNull() {
            addCriterion("bay_area is null");
            return (Criteria) this;
        }

        public Criteria andBayAreaIsNotNull() {
            addCriterion("bay_area is not null");
            return (Criteria) this;
        }

        public Criteria andBayAreaEqualTo(Long value) {
            addCriterion("bay_area =", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaNotEqualTo(Long value) {
            addCriterion("bay_area <>", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaGreaterThan(Long value) {
            addCriterion("bay_area >", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("bay_area >=", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaLessThan(Long value) {
            addCriterion("bay_area <", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaLessThanOrEqualTo(Long value) {
            addCriterion("bay_area <=", value, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaIn(List<Long> values) {
            addCriterion("bay_area in", values, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaNotIn(List<Long> values) {
            addCriterion("bay_area not in", values, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaBetween(Long value1, Long value2) {
            addCriterion("bay_area between", value1, value2, "bayArea");
            return (Criteria) this;
        }

        public Criteria andBayAreaNotBetween(Long value1, Long value2) {
            addCriterion("bay_area not between", value1, value2, "bayArea");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIsNull() {
            addCriterion("households is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIsNotNull() {
            addCriterion("households is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsEqualTo(Long value) {
            addCriterion("households =", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotEqualTo(Long value) {
            addCriterion("households <>", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsGreaterThan(Long value) {
            addCriterion("households >", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsGreaterThanOrEqualTo(Long value) {
            addCriterion("households >=", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsLessThan(Long value) {
            addCriterion("households <", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsLessThanOrEqualTo(Long value) {
            addCriterion("households <=", value, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIn(List<Long> values) {
            addCriterion("households in", values, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotIn(List<Long> values) {
            addCriterion("households not in", values, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsBetween(Long value1, Long value2) {
            addCriterion("households between", value1, value2, "households");
            return (Criteria) this;
        }

        public Criteria andHouseholdsNotBetween(Long value1, Long value2) {
            addCriterion("households not between", value1, value2, "households");
            return (Criteria) this;
        }

        public Criteria andFarIsNull() {
            addCriterion("FAR is null");
            return (Criteria) this;
        }

        public Criteria andFarIsNotNull() {
            addCriterion("FAR is not null");
            return (Criteria) this;
        }

        public Criteria andFarEqualTo(BigDecimal value) {
            addCriterion("FAR =", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarNotEqualTo(BigDecimal value) {
            addCriterion("FAR <>", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarGreaterThan(BigDecimal value) {
            addCriterion("FAR >", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAR >=", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarLessThan(BigDecimal value) {
            addCriterion("FAR <", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAR <=", value, "far");
            return (Criteria) this;
        }

        public Criteria andFarIn(List<BigDecimal> values) {
            addCriterion("FAR in", values, "far");
            return (Criteria) this;
        }

        public Criteria andFarNotIn(List<BigDecimal> values) {
            addCriterion("FAR not in", values, "far");
            return (Criteria) this;
        }

        public Criteria andFarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAR between", value1, value2, "far");
            return (Criteria) this;
        }

        public Criteria andFarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAR not between", value1, value2, "far");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIsNull() {
            addCriterion("elevator_num is null");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIsNotNull() {
            addCriterion("elevator_num is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorNumEqualTo(Byte value) {
            addCriterion("elevator_num =", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotEqualTo(Byte value) {
            addCriterion("elevator_num <>", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumGreaterThan(Byte value) {
            addCriterion("elevator_num >", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("elevator_num >=", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumLessThan(Byte value) {
            addCriterion("elevator_num <", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumLessThanOrEqualTo(Byte value) {
            addCriterion("elevator_num <=", value, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumIn(List<Byte> values) {
            addCriterion("elevator_num in", values, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotIn(List<Byte> values) {
            addCriterion("elevator_num not in", values, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumBetween(Byte value1, Byte value2) {
            addCriterion("elevator_num between", value1, value2, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andElevatorNumNotBetween(Byte value1, Byte value2) {
            addCriterion("elevator_num not between", value1, value2, "elevatorNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumIsNull() {
            addCriterion("cargo_num is null");
            return (Criteria) this;
        }

        public Criteria andCargoNumIsNotNull() {
            addCriterion("cargo_num is not null");
            return (Criteria) this;
        }

        public Criteria andCargoNumEqualTo(Byte value) {
            addCriterion("cargo_num =", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotEqualTo(Byte value) {
            addCriterion("cargo_num <>", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumGreaterThan(Byte value) {
            addCriterion("cargo_num >", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("cargo_num >=", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumLessThan(Byte value) {
            addCriterion("cargo_num <", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumLessThanOrEqualTo(Byte value) {
            addCriterion("cargo_num <=", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumIn(List<Byte> values) {
            addCriterion("cargo_num in", values, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotIn(List<Byte> values) {
            addCriterion("cargo_num not in", values, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumBetween(Byte value1, Byte value2) {
            addCriterion("cargo_num between", value1, value2, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotBetween(Byte value1, Byte value2) {
            addCriterion("cargo_num not between", value1, value2, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumIsNull() {
            addCriterion("ground_floor_num is null");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumIsNotNull() {
            addCriterion("ground_floor_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumEqualTo(Integer value) {
            addCriterion("ground_floor_num =", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumNotEqualTo(Integer value) {
            addCriterion("ground_floor_num <>", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumGreaterThan(Integer value) {
            addCriterion("ground_floor_num >", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ground_floor_num >=", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumLessThan(Integer value) {
            addCriterion("ground_floor_num <", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumLessThanOrEqualTo(Integer value) {
            addCriterion("ground_floor_num <=", value, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumIn(List<Integer> values) {
            addCriterion("ground_floor_num in", values, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumNotIn(List<Integer> values) {
            addCriterion("ground_floor_num not in", values, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumBetween(Integer value1, Integer value2) {
            addCriterion("ground_floor_num between", value1, value2, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andGroundFloorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ground_floor_num not between", value1, value2, "groundFloorNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumIsNull() {
            addCriterion("layer_num is null");
            return (Criteria) this;
        }

        public Criteria andLayerNumIsNotNull() {
            addCriterion("layer_num is not null");
            return (Criteria) this;
        }

        public Criteria andLayerNumEqualTo(Integer value) {
            addCriterion("layer_num =", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumNotEqualTo(Integer value) {
            addCriterion("layer_num <>", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumGreaterThan(Integer value) {
            addCriterion("layer_num >", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer_num >=", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumLessThan(Integer value) {
            addCriterion("layer_num <", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumLessThanOrEqualTo(Integer value) {
            addCriterion("layer_num <=", value, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumIn(List<Integer> values) {
            addCriterion("layer_num in", values, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumNotIn(List<Integer> values) {
            addCriterion("layer_num not in", values, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumBetween(Integer value1, Integer value2) {
            addCriterion("layer_num between", value1, value2, "layerNum");
            return (Criteria) this;
        }

        public Criteria andLayerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("layer_num not between", value1, value2, "layerNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumIsNull() {
            addCriterion("ground_park_num is null");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumIsNotNull() {
            addCriterion("ground_park_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumEqualTo(Long value) {
            addCriterion("ground_park_num =", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumNotEqualTo(Long value) {
            addCriterion("ground_park_num <>", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumGreaterThan(Long value) {
            addCriterion("ground_park_num >", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ground_park_num >=", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumLessThan(Long value) {
            addCriterion("ground_park_num <", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumLessThanOrEqualTo(Long value) {
            addCriterion("ground_park_num <=", value, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumIn(List<Long> values) {
            addCriterion("ground_park_num in", values, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumNotIn(List<Long> values) {
            addCriterion("ground_park_num not in", values, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumBetween(Long value1, Long value2) {
            addCriterion("ground_park_num between", value1, value2, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andGroundParkNumNotBetween(Long value1, Long value2) {
            addCriterion("ground_park_num not between", value1, value2, "groundParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumIsNull() {
            addCriterion("layer_park_num is null");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumIsNotNull() {
            addCriterion("layer_park_num is not null");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumEqualTo(Long value) {
            addCriterion("layer_park_num =", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumNotEqualTo(Long value) {
            addCriterion("layer_park_num <>", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumGreaterThan(Long value) {
            addCriterion("layer_park_num >", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("layer_park_num >=", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumLessThan(Long value) {
            addCriterion("layer_park_num <", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumLessThanOrEqualTo(Long value) {
            addCriterion("layer_park_num <=", value, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumIn(List<Long> values) {
            addCriterion("layer_park_num in", values, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumNotIn(List<Long> values) {
            addCriterion("layer_park_num not in", values, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumBetween(Long value1, Long value2) {
            addCriterion("layer_park_num between", value1, value2, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andLayerParkNumNotBetween(Long value1, Long value2) {
            addCriterion("layer_park_num not between", value1, value2, "layerParkNum");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyIsNull() {
            addCriterion("property_company is null");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyIsNotNull() {
            addCriterion("property_company is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyEqualTo(String value) {
            addCriterion("property_company =", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyNotEqualTo(String value) {
            addCriterion("property_company <>", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyGreaterThan(String value) {
            addCriterion("property_company >", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("property_company >=", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyLessThan(String value) {
            addCriterion("property_company <", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyLessThanOrEqualTo(String value) {
            addCriterion("property_company <=", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyLike(String value) {
            addCriterion("property_company like", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyNotLike(String value) {
            addCriterion("property_company not like", value, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyIn(List<String> values) {
            addCriterion("property_company in", values, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyNotIn(List<String> values) {
            addCriterion("property_company not in", values, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyBetween(String value1, String value2) {
            addCriterion("property_company between", value1, value2, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andPropertyCompanyNotBetween(String value1, String value2) {
            addCriterion("property_company not between", value1, value2, "propertyCompany");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNull() {
            addCriterion("management_fee is null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNotNull() {
            addCriterion("management_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeEqualTo(BigDecimal value) {
            addCriterion("management_fee =", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotEqualTo(BigDecimal value) {
            addCriterion("management_fee <>", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThan(BigDecimal value) {
            addCriterion("management_fee >", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("management_fee >=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThan(BigDecimal value) {
            addCriterion("management_fee <", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("management_fee <=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIn(List<BigDecimal> values) {
            addCriterion("management_fee in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotIn(List<BigDecimal> values) {
            addCriterion("management_fee not in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("management_fee between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("management_fee not between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNull() {
            addCriterion("complete_date is null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNotNull() {
            addCriterion("complete_date is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateEqualTo(Date value) {
            addCriterionForJDBCDate("complete_date =", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("complete_date <>", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("complete_date >", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complete_date >=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThan(Date value) {
            addCriterionForJDBCDate("complete_date <", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complete_date <=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIn(List<Date> values) {
            addCriterionForJDBCDate("complete_date in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("complete_date not in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complete_date between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complete_date not between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeIsNull() {
            addCriterion("complete_date_type is null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeIsNotNull() {
            addCriterion("complete_date_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeEqualTo(String value) {
            addCriterion("complete_date_type =", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeNotEqualTo(String value) {
            addCriterion("complete_date_type <>", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeGreaterThan(String value) {
            addCriterion("complete_date_type >", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("complete_date_type >=", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeLessThan(String value) {
            addCriterion("complete_date_type <", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeLessThanOrEqualTo(String value) {
            addCriterion("complete_date_type <=", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeLike(String value) {
            addCriterion("complete_date_type like", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeNotLike(String value) {
            addCriterion("complete_date_type not like", value, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeIn(List<String> values) {
            addCriterion("complete_date_type in", values, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeNotIn(List<String> values) {
            addCriterion("complete_date_type not in", values, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeBetween(String value1, String value2) {
            addCriterion("complete_date_type between", value1, value2, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andCompleteDateTypeNotBetween(String value1, String value2) {
            addCriterion("complete_date_type not between", value1, value2, "completeDateType");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNull() {
            addCriterion("coordinate_x is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNotNull() {
            addCriterion("coordinate_x is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXEqualTo(Float value) {
            addCriterion("coordinate_x =", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotEqualTo(Float value) {
            addCriterion("coordinate_x <>", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThan(Float value) {
            addCriterion("coordinate_x >", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThanOrEqualTo(Float value) {
            addCriterion("coordinate_x >=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThan(Float value) {
            addCriterion("coordinate_x <", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThanOrEqualTo(Float value) {
            addCriterion("coordinate_x <=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIn(List<Float> values) {
            addCriterion("coordinate_x in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotIn(List<Float> values) {
            addCriterion("coordinate_x not in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXBetween(Float value1, Float value2) {
            addCriterion("coordinate_x between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotBetween(Float value1, Float value2) {
            addCriterion("coordinate_x not between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNull() {
            addCriterion("coordinate_y is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNotNull() {
            addCriterion("coordinate_y is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYEqualTo(Float value) {
            addCriterion("coordinate_y =", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotEqualTo(Float value) {
            addCriterion("coordinate_y <>", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThan(Float value) {
            addCriterion("coordinate_y >", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThanOrEqualTo(Float value) {
            addCriterion("coordinate_y >=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThan(Float value) {
            addCriterion("coordinate_y <", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThanOrEqualTo(Float value) {
            addCriterion("coordinate_y <=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIn(List<Float> values) {
            addCriterion("coordinate_y in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotIn(List<Float> values) {
            addCriterion("coordinate_y not in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYBetween(Float value1, Float value2) {
            addCriterion("coordinate_y between", value1, value2, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotBetween(Float value1, Float value2) {
            addCriterion("coordinate_y not between", value1, value2, "coordinateY");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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