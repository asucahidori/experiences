package com.gatz.discovery.modules.cidm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTinyVillageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTinyVillageExample() {
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

        public Criteria andTinyvillageIdIsNull() {
            addCriterion("tinyvillage_Id is null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdIsNotNull() {
            addCriterion("tinyvillage_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdEqualTo(Long value) {
            addCriterion("tinyvillage_Id =", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotEqualTo(Long value) {
            addCriterion("tinyvillage_Id <>", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdGreaterThan(Long value) {
            addCriterion("tinyvillage_Id >", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tinyvillage_Id >=", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdLessThan(Long value) {
            addCriterion("tinyvillage_Id <", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdLessThanOrEqualTo(Long value) {
            addCriterion("tinyvillage_Id <=", value, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdIn(List<Long> values) {
            addCriterion("tinyvillage_Id in", values, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotIn(List<Long> values) {
            addCriterion("tinyvillage_Id not in", values, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdBetween(Long value1, Long value2) {
            addCriterion("tinyvillage_Id between", value1, value2, "tinyvillageId");
            return (Criteria) this;
        }

        public Criteria andTinyvillageIdNotBetween(Long value1, Long value2) {
            addCriterion("tinyvillage_Id not between", value1, value2, "tinyvillageId");
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

        public Criteria andTinyvillageTypeIsNull() {
            addCriterion("tinyvillage_type is null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeIsNotNull() {
            addCriterion("tinyvillage_type is not null");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeEqualTo(Integer value) {
            addCriterion("tinyvillage_type =", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeNotEqualTo(Integer value) {
            addCriterion("tinyvillage_type <>", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeGreaterThan(Integer value) {
            addCriterion("tinyvillage_type >", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tinyvillage_type >=", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeLessThan(Integer value) {
            addCriterion("tinyvillage_type <", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tinyvillage_type <=", value, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeIn(List<Integer> values) {
            addCriterion("tinyvillage_type in", values, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeNotIn(List<Integer> values) {
            addCriterion("tinyvillage_type not in", values, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeBetween(Integer value1, Integer value2) {
            addCriterion("tinyvillage_type between", value1, value2, "tinyvillageType");
            return (Criteria) this;
        }

        public Criteria andTinyvillageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tinyvillage_type not between", value1, value2, "tinyvillageType");
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

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Long value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Long value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Long value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Long value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Long value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Long> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Long> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Long value1, Long value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Long value1, Long value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterionForJDBCDate("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIsNull() {
            addCriterion("site_area is null");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIsNotNull() {
            addCriterion("site_area is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAreaEqualTo(Long value) {
            addCriterion("site_area =", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotEqualTo(Long value) {
            addCriterion("site_area <>", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaGreaterThan(Long value) {
            addCriterion("site_area >", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("site_area >=", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaLessThan(Long value) {
            addCriterion("site_area <", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaLessThanOrEqualTo(Long value) {
            addCriterion("site_area <=", value, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaIn(List<Long> values) {
            addCriterion("site_area in", values, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotIn(List<Long> values) {
            addCriterion("site_area not in", values, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaBetween(Long value1, Long value2) {
            addCriterion("site_area between", value1, value2, "siteArea");
            return (Criteria) this;
        }

        public Criteria andSiteAreaNotBetween(Long value1, Long value2) {
            addCriterion("site_area not between", value1, value2, "siteArea");
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

        public Criteria andParkNumIsNull() {
            addCriterion("park_num is null");
            return (Criteria) this;
        }

        public Criteria andParkNumIsNotNull() {
            addCriterion("park_num is not null");
            return (Criteria) this;
        }

        public Criteria andParkNumEqualTo(Long value) {
            addCriterion("park_num =", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotEqualTo(Long value) {
            addCriterion("park_num <>", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThan(Long value) {
            addCriterion("park_num >", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThanOrEqualTo(Long value) {
            addCriterion("park_num >=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThan(Long value) {
            addCriterion("park_num <", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThanOrEqualTo(Long value) {
            addCriterion("park_num <=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumIn(List<Long> values) {
            addCriterion("park_num in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotIn(List<Long> values) {
            addCriterion("park_num not in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumBetween(Long value1, Long value2) {
            addCriterion("park_num between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotBetween(Long value1, Long value2) {
            addCriterion("park_num not between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNull() {
            addCriterion("plot_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNotNull() {
            addCriterion("plot_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioEqualTo(BigDecimal value) {
            addCriterion("plot_ratio =", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <>", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThan(BigDecimal value) {
            addCriterion("plot_ratio >", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio >=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThan(BigDecimal value) {
            addCriterion("plot_ratio <", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIn(List<BigDecimal> values) {
            addCriterion("plot_ratio in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotIn(List<BigDecimal> values) {
            addCriterion("plot_ratio not in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio not between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNull() {
            addCriterion("building_num is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNotNull() {
            addCriterion("building_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumEqualTo(Long value) {
            addCriterion("building_num =", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotEqualTo(Long value) {
            addCriterion("building_num <>", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThan(Long value) {
            addCriterion("building_num >", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThanOrEqualTo(Long value) {
            addCriterion("building_num >=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThan(Long value) {
            addCriterion("building_num <", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThanOrEqualTo(Long value) {
            addCriterion("building_num <=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIn(List<Long> values) {
            addCriterion("building_num in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotIn(List<Long> values) {
            addCriterion("building_num not in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumBetween(Long value1, Long value2) {
            addCriterion("building_num between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotBetween(Long value1, Long value2) {
            addCriterion("building_num not between", value1, value2, "buildingNum");
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