package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStorePoiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStorePoiExample() {
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

        public Criteria andStorePoiIdIsNull() {
            addCriterion("store_poi_id is null");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdIsNotNull() {
            addCriterion("store_poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdEqualTo(Long value) {
            addCriterion("store_poi_id =", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdNotEqualTo(Long value) {
            addCriterion("store_poi_id <>", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdGreaterThan(Long value) {
            addCriterion("store_poi_id >", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_poi_id >=", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdLessThan(Long value) {
            addCriterion("store_poi_id <", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdLessThanOrEqualTo(Long value) {
            addCriterion("store_poi_id <=", value, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdIn(List<Long> values) {
            addCriterion("store_poi_id in", values, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdNotIn(List<Long> values) {
            addCriterion("store_poi_id not in", values, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdBetween(Long value1, Long value2) {
            addCriterion("store_poi_id between", value1, value2, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStorePoiIdNotBetween(Long value1, Long value2) {
            addCriterion("store_poi_id not between", value1, value2, "storePoiId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagIsNull() {
            addCriterion("openstaus_flag is null");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagIsNotNull() {
            addCriterion("openstaus_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagEqualTo(Long value) {
            addCriterion("openstaus_flag =", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagNotEqualTo(Long value) {
            addCriterion("openstaus_flag <>", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagGreaterThan(Long value) {
            addCriterion("openstaus_flag >", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("openstaus_flag >=", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagLessThan(Long value) {
            addCriterion("openstaus_flag <", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagLessThanOrEqualTo(Long value) {
            addCriterion("openstaus_flag <=", value, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagIn(List<Long> values) {
            addCriterion("openstaus_flag in", values, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagNotIn(List<Long> values) {
            addCriterion("openstaus_flag not in", values, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagBetween(Long value1, Long value2) {
            addCriterion("openstaus_flag between", value1, value2, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpenstausFlagNotBetween(Long value1, Long value2) {
            addCriterion("openstaus_flag not between", value1, value2, "openstausFlag");
            return (Criteria) this;
        }

        public Criteria andOpentatusIsNull() {
            addCriterion("opentatus is null");
            return (Criteria) this;
        }

        public Criteria andOpentatusIsNotNull() {
            addCriterion("opentatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpentatusEqualTo(String value) {
            addCriterion("opentatus =", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusNotEqualTo(String value) {
            addCriterion("opentatus <>", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusGreaterThan(String value) {
            addCriterion("opentatus >", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusGreaterThanOrEqualTo(String value) {
            addCriterion("opentatus >=", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusLessThan(String value) {
            addCriterion("opentatus <", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusLessThanOrEqualTo(String value) {
            addCriterion("opentatus <=", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusLike(String value) {
            addCriterion("opentatus like", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusNotLike(String value) {
            addCriterion("opentatus not like", value, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusIn(List<String> values) {
            addCriterion("opentatus in", values, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusNotIn(List<String> values) {
            addCriterion("opentatus not in", values, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusBetween(String value1, String value2) {
            addCriterion("opentatus between", value1, value2, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOpentatusNotBetween(String value1, String value2) {
            addCriterion("opentatus not between", value1, value2, "opentatus");
            return (Criteria) this;
        }

        public Criteria andOptionFlagIsNull() {
            addCriterion("option_flag is null");
            return (Criteria) this;
        }

        public Criteria andOptionFlagIsNotNull() {
            addCriterion("option_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOptionFlagEqualTo(Long value) {
            addCriterion("option_flag =", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagNotEqualTo(Long value) {
            addCriterion("option_flag <>", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagGreaterThan(Long value) {
            addCriterion("option_flag >", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("option_flag >=", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagLessThan(Long value) {
            addCriterion("option_flag <", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagLessThanOrEqualTo(Long value) {
            addCriterion("option_flag <=", value, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagIn(List<Long> values) {
            addCriterion("option_flag in", values, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagNotIn(List<Long> values) {
            addCriterion("option_flag not in", values, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagBetween(Long value1, Long value2) {
            addCriterion("option_flag between", value1, value2, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionFlagNotBetween(Long value1, Long value2) {
            addCriterion("option_flag not between", value1, value2, "optionFlag");
            return (Criteria) this;
        }

        public Criteria andOptionIsNull() {
            addCriterion("option is null");
            return (Criteria) this;
        }

        public Criteria andOptionIsNotNull() {
            addCriterion("option is not null");
            return (Criteria) this;
        }

        public Criteria andOptionEqualTo(String value) {
            addCriterion("option =", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotEqualTo(String value) {
            addCriterion("option <>", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionGreaterThan(String value) {
            addCriterion("option >", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionGreaterThanOrEqualTo(String value) {
            addCriterion("option >=", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLessThan(String value) {
            addCriterion("option <", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLessThanOrEqualTo(String value) {
            addCriterion("option <=", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLike(String value) {
            addCriterion("option like", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotLike(String value) {
            addCriterion("option not like", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionIn(List<String> values) {
            addCriterion("option in", values, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotIn(List<String> values) {
            addCriterion("option not in", values, "option");
            return (Criteria) this;
        }

        public Criteria andOptionBetween(String value1, String value2) {
            addCriterion("option between", value1, value2, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotBetween(String value1, String value2) {
            addCriterion("option not between", value1, value2, "option");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("supervisor is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(String value) {
            addCriterion("supervisor =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(String value) {
            addCriterion("supervisor <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(String value) {
            addCriterion("supervisor >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(String value) {
            addCriterion("supervisor <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(String value) {
            addCriterion("supervisor <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLike(String value) {
            addCriterion("supervisor like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotLike(String value) {
            addCriterion("supervisor not like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<String> values) {
            addCriterion("supervisor in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<String> values) {
            addCriterion("supervisor not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(String value1, String value2) {
            addCriterion("supervisor between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(String value1, String value2) {
            addCriterion("supervisor not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSvTelnoIsNull() {
            addCriterion("sv_telno is null");
            return (Criteria) this;
        }

        public Criteria andSvTelnoIsNotNull() {
            addCriterion("sv_telno is not null");
            return (Criteria) this;
        }

        public Criteria andSvTelnoEqualTo(Long value) {
            addCriterion("sv_telno =", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoNotEqualTo(Long value) {
            addCriterion("sv_telno <>", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoGreaterThan(Long value) {
            addCriterion("sv_telno >", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("sv_telno >=", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoLessThan(Long value) {
            addCriterion("sv_telno <", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoLessThanOrEqualTo(Long value) {
            addCriterion("sv_telno <=", value, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoIn(List<Long> values) {
            addCriterion("sv_telno in", values, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoNotIn(List<Long> values) {
            addCriterion("sv_telno not in", values, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoBetween(Long value1, Long value2) {
            addCriterion("sv_telno between", value1, value2, "svTelno");
            return (Criteria) this;
        }

        public Criteria andSvTelnoNotBetween(Long value1, Long value2) {
            addCriterion("sv_telno not between", value1, value2, "svTelno");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andMgTelnoIsNull() {
            addCriterion("mg_telno is null");
            return (Criteria) this;
        }

        public Criteria andMgTelnoIsNotNull() {
            addCriterion("mg_telno is not null");
            return (Criteria) this;
        }

        public Criteria andMgTelnoEqualTo(Long value) {
            addCriterion("mg_telno =", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoNotEqualTo(Long value) {
            addCriterion("mg_telno <>", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoGreaterThan(Long value) {
            addCriterion("mg_telno >", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("mg_telno >=", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoLessThan(Long value) {
            addCriterion("mg_telno <", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoLessThanOrEqualTo(Long value) {
            addCriterion("mg_telno <=", value, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoIn(List<Long> values) {
            addCriterion("mg_telno in", values, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoNotIn(List<Long> values) {
            addCriterion("mg_telno not in", values, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoBetween(Long value1, Long value2) {
            addCriterion("mg_telno between", value1, value2, "mgTelno");
            return (Criteria) this;
        }

        public Criteria andMgTelnoNotBetween(Long value1, Long value2) {
            addCriterion("mg_telno not between", value1, value2, "mgTelno");
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

        public Criteria andFiller01IsNull() {
            addCriterion("filler01 is null");
            return (Criteria) this;
        }

        public Criteria andFiller01IsNotNull() {
            addCriterion("filler01 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller01EqualTo(String value) {
            addCriterion("filler01 =", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01NotEqualTo(String value) {
            addCriterion("filler01 <>", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01GreaterThan(String value) {
            addCriterion("filler01 >", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01GreaterThanOrEqualTo(String value) {
            addCriterion("filler01 >=", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01LessThan(String value) {
            addCriterion("filler01 <", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01LessThanOrEqualTo(String value) {
            addCriterion("filler01 <=", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01Like(String value) {
            addCriterion("filler01 like", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01NotLike(String value) {
            addCriterion("filler01 not like", value, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01In(List<String> values) {
            addCriterion("filler01 in", values, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01NotIn(List<String> values) {
            addCriterion("filler01 not in", values, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01Between(String value1, String value2) {
            addCriterion("filler01 between", value1, value2, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller01NotBetween(String value1, String value2) {
            addCriterion("filler01 not between", value1, value2, "filler01");
            return (Criteria) this;
        }

        public Criteria andFiller02IsNull() {
            addCriterion("filler02 is null");
            return (Criteria) this;
        }

        public Criteria andFiller02IsNotNull() {
            addCriterion("filler02 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller02EqualTo(String value) {
            addCriterion("filler02 =", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02NotEqualTo(String value) {
            addCriterion("filler02 <>", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02GreaterThan(String value) {
            addCriterion("filler02 >", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02GreaterThanOrEqualTo(String value) {
            addCriterion("filler02 >=", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02LessThan(String value) {
            addCriterion("filler02 <", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02LessThanOrEqualTo(String value) {
            addCriterion("filler02 <=", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02Like(String value) {
            addCriterion("filler02 like", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02NotLike(String value) {
            addCriterion("filler02 not like", value, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02In(List<String> values) {
            addCriterion("filler02 in", values, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02NotIn(List<String> values) {
            addCriterion("filler02 not in", values, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02Between(String value1, String value2) {
            addCriterion("filler02 between", value1, value2, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller02NotBetween(String value1, String value2) {
            addCriterion("filler02 not between", value1, value2, "filler02");
            return (Criteria) this;
        }

        public Criteria andFiller03IsNull() {
            addCriterion("filler03 is null");
            return (Criteria) this;
        }

        public Criteria andFiller03IsNotNull() {
            addCriterion("filler03 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller03EqualTo(String value) {
            addCriterion("filler03 =", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03NotEqualTo(String value) {
            addCriterion("filler03 <>", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03GreaterThan(String value) {
            addCriterion("filler03 >", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03GreaterThanOrEqualTo(String value) {
            addCriterion("filler03 >=", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03LessThan(String value) {
            addCriterion("filler03 <", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03LessThanOrEqualTo(String value) {
            addCriterion("filler03 <=", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03Like(String value) {
            addCriterion("filler03 like", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03NotLike(String value) {
            addCriterion("filler03 not like", value, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03In(List<String> values) {
            addCriterion("filler03 in", values, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03NotIn(List<String> values) {
            addCriterion("filler03 not in", values, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03Between(String value1, String value2) {
            addCriterion("filler03 between", value1, value2, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller03NotBetween(String value1, String value2) {
            addCriterion("filler03 not between", value1, value2, "filler03");
            return (Criteria) this;
        }

        public Criteria andFiller04IsNull() {
            addCriterion("filler04 is null");
            return (Criteria) this;
        }

        public Criteria andFiller04IsNotNull() {
            addCriterion("filler04 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller04EqualTo(String value) {
            addCriterion("filler04 =", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04NotEqualTo(String value) {
            addCriterion("filler04 <>", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04GreaterThan(String value) {
            addCriterion("filler04 >", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04GreaterThanOrEqualTo(String value) {
            addCriterion("filler04 >=", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04LessThan(String value) {
            addCriterion("filler04 <", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04LessThanOrEqualTo(String value) {
            addCriterion("filler04 <=", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04Like(String value) {
            addCriterion("filler04 like", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04NotLike(String value) {
            addCriterion("filler04 not like", value, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04In(List<String> values) {
            addCriterion("filler04 in", values, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04NotIn(List<String> values) {
            addCriterion("filler04 not in", values, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04Between(String value1, String value2) {
            addCriterion("filler04 between", value1, value2, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller04NotBetween(String value1, String value2) {
            addCriterion("filler04 not between", value1, value2, "filler04");
            return (Criteria) this;
        }

        public Criteria andFiller05IsNull() {
            addCriterion("filler05 is null");
            return (Criteria) this;
        }

        public Criteria andFiller05IsNotNull() {
            addCriterion("filler05 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller05EqualTo(String value) {
            addCriterion("filler05 =", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05NotEqualTo(String value) {
            addCriterion("filler05 <>", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05GreaterThan(String value) {
            addCriterion("filler05 >", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05GreaterThanOrEqualTo(String value) {
            addCriterion("filler05 >=", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05LessThan(String value) {
            addCriterion("filler05 <", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05LessThanOrEqualTo(String value) {
            addCriterion("filler05 <=", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05Like(String value) {
            addCriterion("filler05 like", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05NotLike(String value) {
            addCriterion("filler05 not like", value, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05In(List<String> values) {
            addCriterion("filler05 in", values, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05NotIn(List<String> values) {
            addCriterion("filler05 not in", values, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05Between(String value1, String value2) {
            addCriterion("filler05 between", value1, value2, "filler05");
            return (Criteria) this;
        }

        public Criteria andFiller05NotBetween(String value1, String value2) {
            addCriterion("filler05 not between", value1, value2, "filler05");
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