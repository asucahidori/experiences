package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSumHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSumHouseExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(Long value) {
            addCriterion("date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(Long value) {
            addCriterion("date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(Long value) {
            addCriterion("date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(Long value) {
            addCriterion("date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(Long value) {
            addCriterion("date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<Long> values) {
            addCriterion("date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<Long> values) {
            addCriterion("date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(Long value1, Long value2) {
            addCriterion("date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(Long value1, Long value2) {
            addCriterion("date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNull() {
            addCriterion("area_type is null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIsNotNull() {
            addCriterion("area_type is not null");
            return (Criteria) this;
        }

        public Criteria andAreaTypeEqualTo(Short value) {
            addCriterion("area_type =", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotEqualTo(Short value) {
            addCriterion("area_type <>", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThan(Short value) {
            addCriterion("area_type >", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("area_type >=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThan(Short value) {
            addCriterion("area_type <", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeLessThanOrEqualTo(Short value) {
            addCriterion("area_type <=", value, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeIn(List<Short> values) {
            addCriterion("area_type in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotIn(List<Short> values) {
            addCriterion("area_type not in", values, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeBetween(Short value1, Short value2) {
            addCriterion("area_type between", value1, value2, "areaType");
            return (Criteria) this;
        }

        public Criteria andAreaTypeNotBetween(Short value1, Short value2) {
            addCriterion("area_type not between", value1, value2, "areaType");
            return (Criteria) this;
        }

        public Criteria andGbCodeIsNull() {
            addCriterion("gb_code is null");
            return (Criteria) this;
        }

        public Criteria andGbCodeIsNotNull() {
            addCriterion("gb_code is not null");
            return (Criteria) this;
        }

        public Criteria andGbCodeEqualTo(String value) {
            addCriterion("gb_code =", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeNotEqualTo(String value) {
            addCriterion("gb_code <>", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeGreaterThan(String value) {
            addCriterion("gb_code >", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gb_code >=", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeLessThan(String value) {
            addCriterion("gb_code <", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeLessThanOrEqualTo(String value) {
            addCriterion("gb_code <=", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeLike(String value) {
            addCriterion("gb_code like", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeNotLike(String value) {
            addCriterion("gb_code not like", value, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeIn(List<String> values) {
            addCriterion("gb_code in", values, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeNotIn(List<String> values) {
            addCriterion("gb_code not in", values, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeBetween(String value1, String value2) {
            addCriterion("gb_code between", value1, value2, "gbCode");
            return (Criteria) this;
        }

        public Criteria andGbCodeNotBetween(String value1, String value2) {
            addCriterion("gb_code not between", value1, value2, "gbCode");
            return (Criteria) this;
        }

        public Criteria andSquareAreaIsNull() {
            addCriterion("square_area is null");
            return (Criteria) this;
        }

        public Criteria andSquareAreaIsNotNull() {
            addCriterion("square_area is not null");
            return (Criteria) this;
        }

        public Criteria andSquareAreaEqualTo(Long value) {
            addCriterion("square_area =", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotEqualTo(Long value) {
            addCriterion("square_area <>", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaGreaterThan(Long value) {
            addCriterion("square_area >", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("square_area >=", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaLessThan(Long value) {
            addCriterion("square_area <", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaLessThanOrEqualTo(Long value) {
            addCriterion("square_area <=", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaIn(List<Long> values) {
            addCriterion("square_area in", values, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotIn(List<Long> values) {
            addCriterion("square_area not in", values, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaBetween(Long value1, Long value2) {
            addCriterion("square_area between", value1, value2, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotBetween(Long value1, Long value2) {
            addCriterion("square_area not between", value1, value2, "squareArea");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumIsNull() {
            addCriterion("office_bld_num is null");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumIsNotNull() {
            addCriterion("office_bld_num is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumEqualTo(Long value) {
            addCriterion("office_bld_num =", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumNotEqualTo(Long value) {
            addCriterion("office_bld_num <>", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumGreaterThan(Long value) {
            addCriterion("office_bld_num >", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumGreaterThanOrEqualTo(Long value) {
            addCriterion("office_bld_num >=", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumLessThan(Long value) {
            addCriterion("office_bld_num <", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumLessThanOrEqualTo(Long value) {
            addCriterion("office_bld_num <=", value, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumIn(List<Long> values) {
            addCriterion("office_bld_num in", values, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumNotIn(List<Long> values) {
            addCriterion("office_bld_num not in", values, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumBetween(Long value1, Long value2) {
            addCriterion("office_bld_num between", value1, value2, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeBldNumNotBetween(Long value1, Long value2) {
            addCriterion("office_bld_num not between", value1, value2, "officeBldNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumIsNull() {
            addCriterion("office_park_num is null");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumIsNotNull() {
            addCriterion("office_park_num is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumEqualTo(Long value) {
            addCriterion("office_park_num =", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumNotEqualTo(Long value) {
            addCriterion("office_park_num <>", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumGreaterThan(Long value) {
            addCriterion("office_park_num >", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("office_park_num >=", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumLessThan(Long value) {
            addCriterion("office_park_num <", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumLessThanOrEqualTo(Long value) {
            addCriterion("office_park_num <=", value, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumIn(List<Long> values) {
            addCriterion("office_park_num in", values, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumNotIn(List<Long> values) {
            addCriterion("office_park_num not in", values, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumBetween(Long value1, Long value2) {
            addCriterion("office_park_num between", value1, value2, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeParkNumNotBetween(Long value1, Long value2) {
            addCriterion("office_park_num not between", value1, value2, "officeParkNum");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaIsNull() {
            addCriterion("office_area is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaIsNotNull() {
            addCriterion("office_area is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaEqualTo(Long value) {
            addCriterion("office_area =", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaNotEqualTo(Long value) {
            addCriterion("office_area <>", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaGreaterThan(Long value) {
            addCriterion("office_area >", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("office_area >=", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaLessThan(Long value) {
            addCriterion("office_area <", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaLessThanOrEqualTo(Long value) {
            addCriterion("office_area <=", value, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaIn(List<Long> values) {
            addCriterion("office_area in", values, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaNotIn(List<Long> values) {
            addCriterion("office_area not in", values, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaBetween(Long value1, Long value2) {
            addCriterion("office_area between", value1, value2, "officeArea");
            return (Criteria) this;
        }

        public Criteria andOfficeAreaNotBetween(Long value1, Long value2) {
            addCriterion("office_area not between", value1, value2, "officeArea");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumIsNull() {
            addCriterion("house_bld_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumIsNotNull() {
            addCriterion("house_bld_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumEqualTo(Long value) {
            addCriterion("house_bld_num =", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumNotEqualTo(Long value) {
            addCriterion("house_bld_num <>", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumGreaterThan(Long value) {
            addCriterion("house_bld_num >", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumGreaterThanOrEqualTo(Long value) {
            addCriterion("house_bld_num >=", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumLessThan(Long value) {
            addCriterion("house_bld_num <", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumLessThanOrEqualTo(Long value) {
            addCriterion("house_bld_num <=", value, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumIn(List<Long> values) {
            addCriterion("house_bld_num in", values, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumNotIn(List<Long> values) {
            addCriterion("house_bld_num not in", values, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumBetween(Long value1, Long value2) {
            addCriterion("house_bld_num between", value1, value2, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseBldNumNotBetween(Long value1, Long value2) {
            addCriterion("house_bld_num not between", value1, value2, "houseBldNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumIsNull() {
            addCriterion("house_park_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumIsNotNull() {
            addCriterion("house_park_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumEqualTo(Long value) {
            addCriterion("house_park_num =", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumNotEqualTo(Long value) {
            addCriterion("house_park_num <>", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumGreaterThan(Long value) {
            addCriterion("house_park_num >", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("house_park_num >=", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumLessThan(Long value) {
            addCriterion("house_park_num <", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumLessThanOrEqualTo(Long value) {
            addCriterion("house_park_num <=", value, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumIn(List<Long> values) {
            addCriterion("house_park_num in", values, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumNotIn(List<Long> values) {
            addCriterion("house_park_num not in", values, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumBetween(Long value1, Long value2) {
            addCriterion("house_park_num between", value1, value2, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseParkNumNotBetween(Long value1, Long value2) {
            addCriterion("house_park_num not between", value1, value2, "houseParkNum");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(Long value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(Long value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(Long value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(Long value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(Long value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<Long> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<Long> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(Long value1, Long value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(Long value1, Long value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
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

        public Criteria andRentalNumberIsNull() {
            addCriterion("rental_number is null");
            return (Criteria) this;
        }

        public Criteria andRentalNumberIsNotNull() {
            addCriterion("rental_number is not null");
            return (Criteria) this;
        }

        public Criteria andRentalNumberEqualTo(Long value) {
            addCriterion("rental_number =", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberNotEqualTo(Long value) {
            addCriterion("rental_number <>", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberGreaterThan(Long value) {
            addCriterion("rental_number >", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("rental_number >=", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberLessThan(Long value) {
            addCriterion("rental_number <", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberLessThanOrEqualTo(Long value) {
            addCriterion("rental_number <=", value, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberIn(List<Long> values) {
            addCriterion("rental_number in", values, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberNotIn(List<Long> values) {
            addCriterion("rental_number not in", values, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberBetween(Long value1, Long value2) {
            addCriterion("rental_number between", value1, value2, "rentalNumber");
            return (Criteria) this;
        }

        public Criteria andRentalNumberNotBetween(Long value1, Long value2) {
            addCriterion("rental_number not between", value1, value2, "rentalNumber");
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