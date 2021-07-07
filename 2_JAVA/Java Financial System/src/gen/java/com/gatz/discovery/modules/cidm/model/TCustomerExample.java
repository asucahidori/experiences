package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
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

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Short value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Short value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Short value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Short value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Short value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Short> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Short> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Short value1, Short value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Short value1, Short value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Long value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Long value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Long value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Long value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Long value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Long> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Long> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Long value1, Long value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Long value1, Long value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(Long value) {
            addCriterion("building_id =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(Long value) {
            addCriterion("building_id <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(Long value) {
            addCriterion("building_id >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("building_id >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(Long value) {
            addCriterion("building_id <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(Long value) {
            addCriterion("building_id <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<Long> values) {
            addCriterion("building_id in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<Long> values) {
            addCriterion("building_id not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(Long value1, Long value2) {
            addCriterion("building_id between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(Long value1, Long value2) {
            addCriterion("building_id not between", value1, value2, "buildingId");
            return (Criteria) this;
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

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Long value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Long value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Long value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Long value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Long> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Long> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Long value1, Long value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(Integer value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(Integer value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(Integer value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(Integer value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<Integer> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<Integer> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(Integer value1, Integer value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
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

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusIsNull() {
            addCriterion("children_status is null");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusIsNotNull() {
            addCriterion("children_status is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusEqualTo(String value) {
            addCriterion("children_status =", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusNotEqualTo(String value) {
            addCriterion("children_status <>", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusGreaterThan(String value) {
            addCriterion("children_status >", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("children_status >=", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusLessThan(String value) {
            addCriterion("children_status <", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusLessThanOrEqualTo(String value) {
            addCriterion("children_status <=", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusLike(String value) {
            addCriterion("children_status like", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusNotLike(String value) {
            addCriterion("children_status not like", value, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusIn(List<String> values) {
            addCriterion("children_status in", values, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusNotIn(List<String> values) {
            addCriterion("children_status not in", values, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusBetween(String value1, String value2) {
            addCriterion("children_status between", value1, value2, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenStatusNotBetween(String value1, String value2) {
            addCriterion("children_status not between", value1, value2, "childrenStatus");
            return (Criteria) this;
        }

        public Criteria andHouseHoldIsNull() {
            addCriterion("house_hold is null");
            return (Criteria) this;
        }

        public Criteria andHouseHoldIsNotNull() {
            addCriterion("house_hold is not null");
            return (Criteria) this;
        }

        public Criteria andHouseHoldEqualTo(Integer value) {
            addCriterion("house_hold =", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldNotEqualTo(Integer value) {
            addCriterion("house_hold <>", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldGreaterThan(Integer value) {
            addCriterion("house_hold >", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_hold >=", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldLessThan(Integer value) {
            addCriterion("house_hold <", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldLessThanOrEqualTo(Integer value) {
            addCriterion("house_hold <=", value, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldIn(List<Integer> values) {
            addCriterion("house_hold in", values, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldNotIn(List<Integer> values) {
            addCriterion("house_hold not in", values, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldBetween(Integer value1, Integer value2) {
            addCriterion("house_hold between", value1, value2, "houseHold");
            return (Criteria) this;
        }

        public Criteria andHouseHoldNotBetween(Integer value1, Integer value2) {
            addCriterion("house_hold not between", value1, value2, "houseHold");
            return (Criteria) this;
        }

        public Criteria andMemberFlagIsNull() {
            addCriterion("member_flag is null");
            return (Criteria) this;
        }

        public Criteria andMemberFlagIsNotNull() {
            addCriterion("member_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMemberFlagEqualTo(Short value) {
            addCriterion("member_flag =", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagNotEqualTo(Short value) {
            addCriterion("member_flag <>", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagGreaterThan(Short value) {
            addCriterion("member_flag >", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("member_flag >=", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagLessThan(Short value) {
            addCriterion("member_flag <", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagLessThanOrEqualTo(Short value) {
            addCriterion("member_flag <=", value, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagIn(List<Short> values) {
            addCriterion("member_flag in", values, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagNotIn(List<Short> values) {
            addCriterion("member_flag not in", values, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagBetween(Short value1, Short value2) {
            addCriterion("member_flag between", value1, value2, "memberFlag");
            return (Criteria) this;
        }

        public Criteria andMemberFlagNotBetween(Short value1, Short value2) {
            addCriterion("member_flag not between", value1, value2, "memberFlag");
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