package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPoiTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPoiTypeExample() {
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

        public Criteria andPoiTypeIdIsNull() {
            addCriterion("poi_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdIsNotNull() {
            addCriterion("poi_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdEqualTo(Long value) {
            addCriterion("poi_type_id =", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdNotEqualTo(Long value) {
            addCriterion("poi_type_id <>", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdGreaterThan(Long value) {
            addCriterion("poi_type_id >", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("poi_type_id >=", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdLessThan(Long value) {
            addCriterion("poi_type_id <", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("poi_type_id <=", value, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdIn(List<Long> values) {
            addCriterion("poi_type_id in", values, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdNotIn(List<Long> values) {
            addCriterion("poi_type_id not in", values, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdBetween(Long value1, Long value2) {
            addCriterion("poi_type_id between", value1, value2, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andPoiTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("poi_type_id not between", value1, value2, "poiTypeId");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIsNull() {
            addCriterion("level1_code is null");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIsNotNull() {
            addCriterion("level1_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeEqualTo(String value) {
            addCriterion("level1_code =", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotEqualTo(String value) {
            addCriterion("level1_code <>", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeGreaterThan(String value) {
            addCriterion("level1_code >", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("level1_code >=", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLessThan(String value) {
            addCriterion("level1_code <", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLessThanOrEqualTo(String value) {
            addCriterion("level1_code <=", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeLike(String value) {
            addCriterion("level1_code like", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotLike(String value) {
            addCriterion("level1_code not like", value, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeIn(List<String> values) {
            addCriterion("level1_code in", values, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotIn(List<String> values) {
            addCriterion("level1_code not in", values, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeBetween(String value1, String value2) {
            addCriterion("level1_code between", value1, value2, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1CodeNotBetween(String value1, String value2) {
            addCriterion("level1_code not between", value1, value2, "level1Code");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIsNull() {
            addCriterion("level1_name is null");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIsNotNull() {
            addCriterion("level1_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1NameEqualTo(String value) {
            addCriterion("level1_name =", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotEqualTo(String value) {
            addCriterion("level1_name <>", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameGreaterThan(String value) {
            addCriterion("level1_name >", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameGreaterThanOrEqualTo(String value) {
            addCriterion("level1_name >=", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLessThan(String value) {
            addCriterion("level1_name <", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLessThanOrEqualTo(String value) {
            addCriterion("level1_name <=", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLike(String value) {
            addCriterion("level1_name like", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotLike(String value) {
            addCriterion("level1_name not like", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIn(List<String> values) {
            addCriterion("level1_name in", values, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotIn(List<String> values) {
            addCriterion("level1_name not in", values, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameBetween(String value1, String value2) {
            addCriterion("level1_name between", value1, value2, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotBetween(String value1, String value2) {
            addCriterion("level1_name not between", value1, value2, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIsNull() {
            addCriterion("level2_code is null");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIsNotNull() {
            addCriterion("level2_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeEqualTo(String value) {
            addCriterion("level2_code =", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotEqualTo(String value) {
            addCriterion("level2_code <>", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeGreaterThan(String value) {
            addCriterion("level2_code >", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("level2_code >=", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLessThan(String value) {
            addCriterion("level2_code <", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLessThanOrEqualTo(String value) {
            addCriterion("level2_code <=", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeLike(String value) {
            addCriterion("level2_code like", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotLike(String value) {
            addCriterion("level2_code not like", value, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeIn(List<String> values) {
            addCriterion("level2_code in", values, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotIn(List<String> values) {
            addCriterion("level2_code not in", values, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeBetween(String value1, String value2) {
            addCriterion("level2_code between", value1, value2, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2CodeNotBetween(String value1, String value2) {
            addCriterion("level2_code not between", value1, value2, "level2Code");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIsNull() {
            addCriterion("level2_name is null");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIsNotNull() {
            addCriterion("level2_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2NameEqualTo(String value) {
            addCriterion("level2_name =", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotEqualTo(String value) {
            addCriterion("level2_name <>", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameGreaterThan(String value) {
            addCriterion("level2_name >", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameGreaterThanOrEqualTo(String value) {
            addCriterion("level2_name >=", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLessThan(String value) {
            addCriterion("level2_name <", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLessThanOrEqualTo(String value) {
            addCriterion("level2_name <=", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLike(String value) {
            addCriterion("level2_name like", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotLike(String value) {
            addCriterion("level2_name not like", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIn(List<String> values) {
            addCriterion("level2_name in", values, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotIn(List<String> values) {
            addCriterion("level2_name not in", values, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameBetween(String value1, String value2) {
            addCriterion("level2_name between", value1, value2, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotBetween(String value1, String value2) {
            addCriterion("level2_name not between", value1, value2, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeIsNull() {
            addCriterion("level3_code is null");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeIsNotNull() {
            addCriterion("level3_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeEqualTo(String value) {
            addCriterion("level3_code =", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeNotEqualTo(String value) {
            addCriterion("level3_code <>", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeGreaterThan(String value) {
            addCriterion("level3_code >", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("level3_code >=", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeLessThan(String value) {
            addCriterion("level3_code <", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeLessThanOrEqualTo(String value) {
            addCriterion("level3_code <=", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeLike(String value) {
            addCriterion("level3_code like", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeNotLike(String value) {
            addCriterion("level3_code not like", value, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeIn(List<String> values) {
            addCriterion("level3_code in", values, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeNotIn(List<String> values) {
            addCriterion("level3_code not in", values, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeBetween(String value1, String value2) {
            addCriterion("level3_code between", value1, value2, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3CodeNotBetween(String value1, String value2) {
            addCriterion("level3_code not between", value1, value2, "level3Code");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIsNull() {
            addCriterion("level3_name is null");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIsNotNull() {
            addCriterion("level3_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3NameEqualTo(String value) {
            addCriterion("level3_name =", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotEqualTo(String value) {
            addCriterion("level3_name <>", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameGreaterThan(String value) {
            addCriterion("level3_name >", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameGreaterThanOrEqualTo(String value) {
            addCriterion("level3_name >=", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLessThan(String value) {
            addCriterion("level3_name <", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLessThanOrEqualTo(String value) {
            addCriterion("level3_name <=", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLike(String value) {
            addCriterion("level3_name like", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotLike(String value) {
            addCriterion("level3_name not like", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIn(List<String> values) {
            addCriterion("level3_name in", values, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotIn(List<String> values) {
            addCriterion("level3_name not in", values, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameBetween(String value1, String value2) {
            addCriterion("level3_name between", value1, value2, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotBetween(String value1, String value2) {
            addCriterion("level3_name not between", value1, value2, "level3Name");
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