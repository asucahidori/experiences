package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVillageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVillageExample() {
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

        public Criteria andSquareAreaIsNull() {
            addCriterion("square_area is null");
            return (Criteria) this;
        }

        public Criteria andSquareAreaIsNotNull() {
            addCriterion("square_area is not null");
            return (Criteria) this;
        }

        public Criteria andSquareAreaEqualTo(String value) {
            addCriterion("square_area =", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotEqualTo(String value) {
            addCriterion("square_area <>", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaGreaterThan(String value) {
            addCriterion("square_area >", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaGreaterThanOrEqualTo(String value) {
            addCriterion("square_area >=", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaLessThan(String value) {
            addCriterion("square_area <", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaLessThanOrEqualTo(String value) {
            addCriterion("square_area <=", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaLike(String value) {
            addCriterion("square_area like", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotLike(String value) {
            addCriterion("square_area not like", value, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaIn(List<String> values) {
            addCriterion("square_area in", values, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotIn(List<String> values) {
            addCriterion("square_area not in", values, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaBetween(String value1, String value2) {
            addCriterion("square_area between", value1, value2, "squareArea");
            return (Criteria) this;
        }

        public Criteria andSquareAreaNotBetween(String value1, String value2) {
            addCriterion("square_area not between", value1, value2, "squareArea");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberIsNull() {
            addCriterion("household_number is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberIsNotNull() {
            addCriterion("household_number is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberEqualTo(Integer value) {
            addCriterion("household_number =", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberNotEqualTo(Integer value) {
            addCriterion("household_number <>", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberGreaterThan(Integer value) {
            addCriterion("household_number >", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_number >=", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberLessThan(Integer value) {
            addCriterion("household_number <", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("household_number <=", value, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberIn(List<Integer> values) {
            addCriterion("household_number in", values, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberNotIn(List<Integer> values) {
            addCriterion("household_number not in", values, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberBetween(Integer value1, Integer value2) {
            addCriterion("household_number between", value1, value2, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andHouseholdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("household_number not between", value1, value2, "householdNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberIsNull() {
            addCriterion("resident_population_number is null");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberIsNotNull() {
            addCriterion("resident_population_number is not null");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberEqualTo(Double value) {
            addCriterion("resident_population_number =", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberNotEqualTo(Double value) {
            addCriterion("resident_population_number <>", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberGreaterThan(Double value) {
            addCriterion("resident_population_number >", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("resident_population_number >=", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberLessThan(Double value) {
            addCriterion("resident_population_number <", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberLessThanOrEqualTo(Double value) {
            addCriterion("resident_population_number <=", value, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberIn(List<Double> values) {
            addCriterion("resident_population_number in", values, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberNotIn(List<Double> values) {
            addCriterion("resident_population_number not in", values, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberBetween(Double value1, Double value2) {
            addCriterion("resident_population_number between", value1, value2, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andResidentPopulationNumberNotBetween(Double value1, Double value2) {
            addCriterion("resident_population_number not between", value1, value2, "residentPopulationNumber");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXIsNull() {
            addCriterion("baidu_coordinate_x is null");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXIsNotNull() {
            addCriterion("baidu_coordinate_x is not null");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXEqualTo(Double value) {
            addCriterion("baidu_coordinate_x =", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXNotEqualTo(Double value) {
            addCriterion("baidu_coordinate_x <>", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXGreaterThan(Double value) {
            addCriterion("baidu_coordinate_x >", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXGreaterThanOrEqualTo(Double value) {
            addCriterion("baidu_coordinate_x >=", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXLessThan(Double value) {
            addCriterion("baidu_coordinate_x <", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXLessThanOrEqualTo(Double value) {
            addCriterion("baidu_coordinate_x <=", value, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXIn(List<Double> values) {
            addCriterion("baidu_coordinate_x in", values, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXNotIn(List<Double> values) {
            addCriterion("baidu_coordinate_x not in", values, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXBetween(Double value1, Double value2) {
            addCriterion("baidu_coordinate_x between", value1, value2, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateXNotBetween(Double value1, Double value2) {
            addCriterion("baidu_coordinate_x not between", value1, value2, "baiduCoordinateX");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYIsNull() {
            addCriterion("baidu_coordinate_y is null");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYIsNotNull() {
            addCriterion("baidu_coordinate_y is not null");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYEqualTo(Double value) {
            addCriterion("baidu_coordinate_y =", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYNotEqualTo(Double value) {
            addCriterion("baidu_coordinate_y <>", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYGreaterThan(Double value) {
            addCriterion("baidu_coordinate_y >", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYGreaterThanOrEqualTo(Double value) {
            addCriterion("baidu_coordinate_y >=", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYLessThan(Double value) {
            addCriterion("baidu_coordinate_y <", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYLessThanOrEqualTo(Double value) {
            addCriterion("baidu_coordinate_y <=", value, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYIn(List<Double> values) {
            addCriterion("baidu_coordinate_y in", values, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYNotIn(List<Double> values) {
            addCriterion("baidu_coordinate_y not in", values, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYBetween(Double value1, Double value2) {
            addCriterion("baidu_coordinate_y between", value1, value2, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andBaiduCoordinateYNotBetween(Double value1, Double value2) {
            addCriterion("baidu_coordinate_y not between", value1, value2, "baiduCoordinateY");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatIsNull() {
            addCriterion("gaode_coordinate_lat is null");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatIsNotNull() {
            addCriterion("gaode_coordinate_lat is not null");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatEqualTo(Double value) {
            addCriterion("gaode_coordinate_lat =", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatNotEqualTo(Double value) {
            addCriterion("gaode_coordinate_lat <>", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatGreaterThan(Double value) {
            addCriterion("gaode_coordinate_lat >", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatGreaterThanOrEqualTo(Double value) {
            addCriterion("gaode_coordinate_lat >=", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatLessThan(Double value) {
            addCriterion("gaode_coordinate_lat <", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatLessThanOrEqualTo(Double value) {
            addCriterion("gaode_coordinate_lat <=", value, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatIn(List<Double> values) {
            addCriterion("gaode_coordinate_lat in", values, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatNotIn(List<Double> values) {
            addCriterion("gaode_coordinate_lat not in", values, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatBetween(Double value1, Double value2) {
            addCriterion("gaode_coordinate_lat between", value1, value2, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLatNotBetween(Double value1, Double value2) {
            addCriterion("gaode_coordinate_lat not between", value1, value2, "gaodeCoordinateLat");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngIsNull() {
            addCriterion("gaode_coordinate_lng is null");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngIsNotNull() {
            addCriterion("gaode_coordinate_lng is not null");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngEqualTo(Double value) {
            addCriterion("gaode_coordinate_lng =", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngNotEqualTo(Double value) {
            addCriterion("gaode_coordinate_lng <>", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngGreaterThan(Double value) {
            addCriterion("gaode_coordinate_lng >", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngGreaterThanOrEqualTo(Double value) {
            addCriterion("gaode_coordinate_lng >=", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngLessThan(Double value) {
            addCriterion("gaode_coordinate_lng <", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngLessThanOrEqualTo(Double value) {
            addCriterion("gaode_coordinate_lng <=", value, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngIn(List<Double> values) {
            addCriterion("gaode_coordinate_lng in", values, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngNotIn(List<Double> values) {
            addCriterion("gaode_coordinate_lng not in", values, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngBetween(Double value1, Double value2) {
            addCriterion("gaode_coordinate_lng between", value1, value2, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andGaodeCoordinateLngNotBetween(Double value1, Double value2) {
            addCriterion("gaode_coordinate_lng not between", value1, value2, "gaodeCoordinateLng");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressIsNull() {
            addCriterion("committee_address is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressIsNotNull() {
            addCriterion("committee_address is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressEqualTo(String value) {
            addCriterion("committee_address =", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressNotEqualTo(String value) {
            addCriterion("committee_address <>", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressGreaterThan(String value) {
            addCriterion("committee_address >", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("committee_address >=", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressLessThan(String value) {
            addCriterion("committee_address <", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressLessThanOrEqualTo(String value) {
            addCriterion("committee_address <=", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressLike(String value) {
            addCriterion("committee_address like", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressNotLike(String value) {
            addCriterion("committee_address not like", value, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressIn(List<String> values) {
            addCriterion("committee_address in", values, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressNotIn(List<String> values) {
            addCriterion("committee_address not in", values, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressBetween(String value1, String value2) {
            addCriterion("committee_address between", value1, value2, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteeAddressNotBetween(String value1, String value2) {
            addCriterion("committee_address not between", value1, value2, "committeeAddress");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneIsNull() {
            addCriterion("committee_phone is null");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneIsNotNull() {
            addCriterion("committee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneEqualTo(String value) {
            addCriterion("committee_phone =", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneNotEqualTo(String value) {
            addCriterion("committee_phone <>", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneGreaterThan(String value) {
            addCriterion("committee_phone >", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("committee_phone >=", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneLessThan(String value) {
            addCriterion("committee_phone <", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneLessThanOrEqualTo(String value) {
            addCriterion("committee_phone <=", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneLike(String value) {
            addCriterion("committee_phone like", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneNotLike(String value) {
            addCriterion("committee_phone not like", value, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneIn(List<String> values) {
            addCriterion("committee_phone in", values, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneNotIn(List<String> values) {
            addCriterion("committee_phone not in", values, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneBetween(String value1, String value2) {
            addCriterion("committee_phone between", value1, value2, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andCommitteePhoneNotBetween(String value1, String value2) {
            addCriterion("committee_phone not between", value1, value2, "committeePhone");
            return (Criteria) this;
        }

        public Criteria andTownIdIsNull() {
            addCriterion("town_id is null");
            return (Criteria) this;
        }

        public Criteria andTownIdIsNotNull() {
            addCriterion("town_id is not null");
            return (Criteria) this;
        }

        public Criteria andTownIdEqualTo(Long value) {
            addCriterion("town_id =", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotEqualTo(Long value) {
            addCriterion("town_id <>", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdGreaterThan(Long value) {
            addCriterion("town_id >", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdGreaterThanOrEqualTo(Long value) {
            addCriterion("town_id >=", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdLessThan(Long value) {
            addCriterion("town_id <", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdLessThanOrEqualTo(Long value) {
            addCriterion("town_id <=", value, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdIn(List<Long> values) {
            addCriterion("town_id in", values, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotIn(List<Long> values) {
            addCriterion("town_id not in", values, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdBetween(Long value1, Long value2) {
            addCriterion("town_id between", value1, value2, "townId");
            return (Criteria) this;
        }

        public Criteria andTownIdNotBetween(Long value1, Long value2) {
            addCriterion("town_id not between", value1, value2, "townId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNull() {
            addCriterion("approve_status is null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNotNull() {
            addCriterion("approve_status is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusEqualTo(Integer value) {
            addCriterion("approve_status =", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotEqualTo(Integer value) {
            addCriterion("approve_status <>", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThan(Integer value) {
            addCriterion("approve_status >", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve_status >=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThan(Integer value) {
            addCriterion("approve_status <", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("approve_status <=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIn(List<Integer> values) {
            addCriterion("approve_status in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotIn(List<Integer> values) {
            addCriterion("approve_status not in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusBetween(Integer value1, Integer value2) {
            addCriterion("approve_status between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("approve_status not between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNull() {
            addCriterion("attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(Long value) {
            addCriterion("attachment_id =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(Long value) {
            addCriterion("attachment_id <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(Long value) {
            addCriterion("attachment_id >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attachment_id >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(Long value) {
            addCriterion("attachment_id <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(Long value) {
            addCriterion("attachment_id <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<Long> values) {
            addCriterion("attachment_id in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<Long> values) {
            addCriterion("attachment_id not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(Long value1, Long value2) {
            addCriterion("attachment_id between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(Long value1, Long value2) {
            addCriterion("attachment_id not between", value1, value2, "attachmentId");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(Boolean value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(Boolean value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(Boolean value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(Boolean value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(Boolean value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<Boolean> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<Boolean> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(Boolean value1, Boolean value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("batch not between", value1, value2, "batch");
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