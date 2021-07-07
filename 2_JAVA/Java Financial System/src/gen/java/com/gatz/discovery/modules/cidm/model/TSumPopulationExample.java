package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSumPopulationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSumPopulationExample() {
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

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Long value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Long value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Long value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Long value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Long value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Long value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Long> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Long> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Long value1, Long value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Long value1, Long value2) {
            addCriterion("population not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andMalePopulationIsNull() {
            addCriterion("male_population is null");
            return (Criteria) this;
        }

        public Criteria andMalePopulationIsNotNull() {
            addCriterion("male_population is not null");
            return (Criteria) this;
        }

        public Criteria andMalePopulationEqualTo(Long value) {
            addCriterion("male_population =", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationNotEqualTo(Long value) {
            addCriterion("male_population <>", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationGreaterThan(Long value) {
            addCriterion("male_population >", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationGreaterThanOrEqualTo(Long value) {
            addCriterion("male_population >=", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationLessThan(Long value) {
            addCriterion("male_population <", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationLessThanOrEqualTo(Long value) {
            addCriterion("male_population <=", value, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationIn(List<Long> values) {
            addCriterion("male_population in", values, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationNotIn(List<Long> values) {
            addCriterion("male_population not in", values, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationBetween(Long value1, Long value2) {
            addCriterion("male_population between", value1, value2, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andMalePopulationNotBetween(Long value1, Long value2) {
            addCriterion("male_population not between", value1, value2, "malePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationIsNull() {
            addCriterion("female_population is null");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationIsNotNull() {
            addCriterion("female_population is not null");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationEqualTo(Long value) {
            addCriterion("female_population =", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationNotEqualTo(Long value) {
            addCriterion("female_population <>", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationGreaterThan(Long value) {
            addCriterion("female_population >", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationGreaterThanOrEqualTo(Long value) {
            addCriterion("female_population >=", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationLessThan(Long value) {
            addCriterion("female_population <", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationLessThanOrEqualTo(Long value) {
            addCriterion("female_population <=", value, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationIn(List<Long> values) {
            addCriterion("female_population in", values, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationNotIn(List<Long> values) {
            addCriterion("female_population not in", values, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationBetween(Long value1, Long value2) {
            addCriterion("female_population between", value1, value2, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andFemalePopulationNotBetween(Long value1, Long value2) {
            addCriterion("female_population not between", value1, value2, "femalePopulation");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelIsNull() {
            addCriterion("comsume_level is null");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelIsNotNull() {
            addCriterion("comsume_level is not null");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelEqualTo(Short value) {
            addCriterion("comsume_level =", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelNotEqualTo(Short value) {
            addCriterion("comsume_level <>", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelGreaterThan(Short value) {
            addCriterion("comsume_level >", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("comsume_level >=", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelLessThan(Short value) {
            addCriterion("comsume_level <", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelLessThanOrEqualTo(Short value) {
            addCriterion("comsume_level <=", value, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelIn(List<Short> values) {
            addCriterion("comsume_level in", values, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelNotIn(List<Short> values) {
            addCriterion("comsume_level not in", values, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelBetween(Short value1, Short value2) {
            addCriterion("comsume_level between", value1, value2, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andComsumeLevelNotBetween(Short value1, Short value2) {
            addCriterion("comsume_level not between", value1, value2, "comsumeLevel");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyIsNull() {
            addCriterion("nuclear_family is null");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyIsNotNull() {
            addCriterion("nuclear_family is not null");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyEqualTo(Long value) {
            addCriterion("nuclear_family =", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyNotEqualTo(Long value) {
            addCriterion("nuclear_family <>", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyGreaterThan(Long value) {
            addCriterion("nuclear_family >", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyGreaterThanOrEqualTo(Long value) {
            addCriterion("nuclear_family >=", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyLessThan(Long value) {
            addCriterion("nuclear_family <", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyLessThanOrEqualTo(Long value) {
            addCriterion("nuclear_family <=", value, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyIn(List<Long> values) {
            addCriterion("nuclear_family in", values, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyNotIn(List<Long> values) {
            addCriterion("nuclear_family not in", values, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyBetween(Long value1, Long value2) {
            addCriterion("nuclear_family between", value1, value2, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andNuclearFamilyNotBetween(Long value1, Long value2) {
            addCriterion("nuclear_family not between", value1, value2, "nuclearFamily");
            return (Criteria) this;
        }

        public Criteria andLeadNumIsNull() {
            addCriterion("lead_num is null");
            return (Criteria) this;
        }

        public Criteria andLeadNumIsNotNull() {
            addCriterion("lead_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeadNumEqualTo(Long value) {
            addCriterion("lead_num =", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumNotEqualTo(Long value) {
            addCriterion("lead_num <>", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumGreaterThan(Long value) {
            addCriterion("lead_num >", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumGreaterThanOrEqualTo(Long value) {
            addCriterion("lead_num >=", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumLessThan(Long value) {
            addCriterion("lead_num <", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumLessThanOrEqualTo(Long value) {
            addCriterion("lead_num <=", value, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumIn(List<Long> values) {
            addCriterion("lead_num in", values, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumNotIn(List<Long> values) {
            addCriterion("lead_num not in", values, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumBetween(Long value1, Long value2) {
            addCriterion("lead_num between", value1, value2, "leadNum");
            return (Criteria) this;
        }

        public Criteria andLeadNumNotBetween(Long value1, Long value2) {
            addCriterion("lead_num not between", value1, value2, "leadNum");
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