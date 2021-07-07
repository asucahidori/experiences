package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class THouseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THouseDetailExample() {
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

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Short value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Short value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Short value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Short value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Short value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Short value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Short> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Short> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Short value1, Short value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Short value1, Short value2) {
            addCriterion("floor not between", value1, value2, "floor");
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

        public Criteria andBuildupAreaEqualTo(Integer value) {
            addCriterion("buildup_area =", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotEqualTo(Integer value) {
            addCriterion("buildup_area <>", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaGreaterThan(Integer value) {
            addCriterion("buildup_area >", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("buildup_area >=", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaLessThan(Integer value) {
            addCriterion("buildup_area <", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaLessThanOrEqualTo(Integer value) {
            addCriterion("buildup_area <=", value, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaIn(List<Integer> values) {
            addCriterion("buildup_area in", values, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotIn(List<Integer> values) {
            addCriterion("buildup_area not in", values, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaBetween(Integer value1, Integer value2) {
            addCriterion("buildup_area between", value1, value2, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andBuildupAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("buildup_area not between", value1, value2, "buildupArea");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleIsNull() {
            addCriterion("decorate_style is null");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleIsNotNull() {
            addCriterion("decorate_style is not null");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleEqualTo(String value) {
            addCriterion("decorate_style =", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleNotEqualTo(String value) {
            addCriterion("decorate_style <>", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleGreaterThan(String value) {
            addCriterion("decorate_style >", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleGreaterThanOrEqualTo(String value) {
            addCriterion("decorate_style >=", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleLessThan(String value) {
            addCriterion("decorate_style <", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleLessThanOrEqualTo(String value) {
            addCriterion("decorate_style <=", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleLike(String value) {
            addCriterion("decorate_style like", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleNotLike(String value) {
            addCriterion("decorate_style not like", value, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleIn(List<String> values) {
            addCriterion("decorate_style in", values, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleNotIn(List<String> values) {
            addCriterion("decorate_style not in", values, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleBetween(String value1, String value2) {
            addCriterion("decorate_style between", value1, value2, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateStyleNotBetween(String value1, String value2) {
            addCriterion("decorate_style not between", value1, value2, "decorateStyle");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelIsNull() {
            addCriterion("decorate_level is null");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelIsNotNull() {
            addCriterion("decorate_level is not null");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelEqualTo(String value) {
            addCriterion("decorate_level =", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelNotEqualTo(String value) {
            addCriterion("decorate_level <>", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelGreaterThan(String value) {
            addCriterion("decorate_level >", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelGreaterThanOrEqualTo(String value) {
            addCriterion("decorate_level >=", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelLessThan(String value) {
            addCriterion("decorate_level <", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelLessThanOrEqualTo(String value) {
            addCriterion("decorate_level <=", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelLike(String value) {
            addCriterion("decorate_level like", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelNotLike(String value) {
            addCriterion("decorate_level not like", value, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelIn(List<String> values) {
            addCriterion("decorate_level in", values, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelNotIn(List<String> values) {
            addCriterion("decorate_level not in", values, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelBetween(String value1, String value2) {
            addCriterion("decorate_level between", value1, value2, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andDecorateLevelNotBetween(String value1, String value2) {
            addCriterion("decorate_level not between", value1, value2, "decorateLevel");
            return (Criteria) this;
        }

        public Criteria andTvBrandIsNull() {
            addCriterion("TV_brand is null");
            return (Criteria) this;
        }

        public Criteria andTvBrandIsNotNull() {
            addCriterion("TV_brand is not null");
            return (Criteria) this;
        }

        public Criteria andTvBrandEqualTo(String value) {
            addCriterion("TV_brand =", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandNotEqualTo(String value) {
            addCriterion("TV_brand <>", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandGreaterThan(String value) {
            addCriterion("TV_brand >", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandGreaterThanOrEqualTo(String value) {
            addCriterion("TV_brand >=", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandLessThan(String value) {
            addCriterion("TV_brand <", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandLessThanOrEqualTo(String value) {
            addCriterion("TV_brand <=", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandLike(String value) {
            addCriterion("TV_brand like", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandNotLike(String value) {
            addCriterion("TV_brand not like", value, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandIn(List<String> values) {
            addCriterion("TV_brand in", values, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandNotIn(List<String> values) {
            addCriterion("TV_brand not in", values, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandBetween(String value1, String value2) {
            addCriterion("TV_brand between", value1, value2, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvBrandNotBetween(String value1, String value2) {
            addCriterion("TV_brand not between", value1, value2, "tvBrand");
            return (Criteria) this;
        }

        public Criteria andTvSizeIsNull() {
            addCriterion("TV_size is null");
            return (Criteria) this;
        }

        public Criteria andTvSizeIsNotNull() {
            addCriterion("TV_size is not null");
            return (Criteria) this;
        }

        public Criteria andTvSizeEqualTo(String value) {
            addCriterion("TV_size =", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeNotEqualTo(String value) {
            addCriterion("TV_size <>", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeGreaterThan(String value) {
            addCriterion("TV_size >", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeGreaterThanOrEqualTo(String value) {
            addCriterion("TV_size >=", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeLessThan(String value) {
            addCriterion("TV_size <", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeLessThanOrEqualTo(String value) {
            addCriterion("TV_size <=", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeLike(String value) {
            addCriterion("TV_size like", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeNotLike(String value) {
            addCriterion("TV_size not like", value, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeIn(List<String> values) {
            addCriterion("TV_size in", values, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeNotIn(List<String> values) {
            addCriterion("TV_size not in", values, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeBetween(String value1, String value2) {
            addCriterion("TV_size between", value1, value2, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvSizeNotBetween(String value1, String value2) {
            addCriterion("TV_size not between", value1, value2, "tvSize");
            return (Criteria) this;
        }

        public Criteria andTvColorIsNull() {
            addCriterion("TV_color is null");
            return (Criteria) this;
        }

        public Criteria andTvColorIsNotNull() {
            addCriterion("TV_color is not null");
            return (Criteria) this;
        }

        public Criteria andTvColorEqualTo(String value) {
            addCriterion("TV_color =", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorNotEqualTo(String value) {
            addCriterion("TV_color <>", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorGreaterThan(String value) {
            addCriterion("TV_color >", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorGreaterThanOrEqualTo(String value) {
            addCriterion("TV_color >=", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorLessThan(String value) {
            addCriterion("TV_color <", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorLessThanOrEqualTo(String value) {
            addCriterion("TV_color <=", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorLike(String value) {
            addCriterion("TV_color like", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorNotLike(String value) {
            addCriterion("TV_color not like", value, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorIn(List<String> values) {
            addCriterion("TV_color in", values, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorNotIn(List<String> values) {
            addCriterion("TV_color not in", values, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorBetween(String value1, String value2) {
            addCriterion("TV_color between", value1, value2, "tvColor");
            return (Criteria) this;
        }

        public Criteria andTvColorNotBetween(String value1, String value2) {
            addCriterion("TV_color not between", value1, value2, "tvColor");
            return (Criteria) this;
        }

        public Criteria andAirconBrandIsNull() {
            addCriterion("aircon_brand is null");
            return (Criteria) this;
        }

        public Criteria andAirconBrandIsNotNull() {
            addCriterion("aircon_brand is not null");
            return (Criteria) this;
        }

        public Criteria andAirconBrandEqualTo(String value) {
            addCriterion("aircon_brand =", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandNotEqualTo(String value) {
            addCriterion("aircon_brand <>", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandGreaterThan(String value) {
            addCriterion("aircon_brand >", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandGreaterThanOrEqualTo(String value) {
            addCriterion("aircon_brand >=", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandLessThan(String value) {
            addCriterion("aircon_brand <", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandLessThanOrEqualTo(String value) {
            addCriterion("aircon_brand <=", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandLike(String value) {
            addCriterion("aircon_brand like", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandNotLike(String value) {
            addCriterion("aircon_brand not like", value, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandIn(List<String> values) {
            addCriterion("aircon_brand in", values, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandNotIn(List<String> values) {
            addCriterion("aircon_brand not in", values, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandBetween(String value1, String value2) {
            addCriterion("aircon_brand between", value1, value2, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconBrandNotBetween(String value1, String value2) {
            addCriterion("aircon_brand not between", value1, value2, "airconBrand");
            return (Criteria) this;
        }

        public Criteria andAirconTypeIsNull() {
            addCriterion("aircon_type is null");
            return (Criteria) this;
        }

        public Criteria andAirconTypeIsNotNull() {
            addCriterion("aircon_type is not null");
            return (Criteria) this;
        }

        public Criteria andAirconTypeEqualTo(String value) {
            addCriterion("aircon_type =", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeNotEqualTo(String value) {
            addCriterion("aircon_type <>", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeGreaterThan(String value) {
            addCriterion("aircon_type >", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeGreaterThanOrEqualTo(String value) {
            addCriterion("aircon_type >=", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeLessThan(String value) {
            addCriterion("aircon_type <", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeLessThanOrEqualTo(String value) {
            addCriterion("aircon_type <=", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeLike(String value) {
            addCriterion("aircon_type like", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeNotLike(String value) {
            addCriterion("aircon_type not like", value, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeIn(List<String> values) {
            addCriterion("aircon_type in", values, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeNotIn(List<String> values) {
            addCriterion("aircon_type not in", values, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeBetween(String value1, String value2) {
            addCriterion("aircon_type between", value1, value2, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconTypeNotBetween(String value1, String value2) {
            addCriterion("aircon_type not between", value1, value2, "airconType");
            return (Criteria) this;
        }

        public Criteria andAirconColorIsNull() {
            addCriterion("aircon_color is null");
            return (Criteria) this;
        }

        public Criteria andAirconColorIsNotNull() {
            addCriterion("aircon_color is not null");
            return (Criteria) this;
        }

        public Criteria andAirconColorEqualTo(String value) {
            addCriterion("aircon_color =", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorNotEqualTo(String value) {
            addCriterion("aircon_color <>", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorGreaterThan(String value) {
            addCriterion("aircon_color >", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorGreaterThanOrEqualTo(String value) {
            addCriterion("aircon_color >=", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorLessThan(String value) {
            addCriterion("aircon_color <", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorLessThanOrEqualTo(String value) {
            addCriterion("aircon_color <=", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorLike(String value) {
            addCriterion("aircon_color like", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorNotLike(String value) {
            addCriterion("aircon_color not like", value, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorIn(List<String> values) {
            addCriterion("aircon_color in", values, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorNotIn(List<String> values) {
            addCriterion("aircon_color not in", values, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorBetween(String value1, String value2) {
            addCriterion("aircon_color between", value1, value2, "airconColor");
            return (Criteria) this;
        }

        public Criteria andAirconColorNotBetween(String value1, String value2) {
            addCriterion("aircon_color not between", value1, value2, "airconColor");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(Byte value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(Byte value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(Byte value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(Byte value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(Byte value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<Byte> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<Byte> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(Byte value1, Byte value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNull() {
            addCriterion("room_size is null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNotNull() {
            addCriterion("room_size is not null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeEqualTo(Byte value) {
            addCriterion("room_size =", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotEqualTo(Byte value) {
            addCriterion("room_size <>", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThan(Byte value) {
            addCriterion("room_size >", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThanOrEqualTo(Byte value) {
            addCriterion("room_size >=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThan(Byte value) {
            addCriterion("room_size <", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThanOrEqualTo(Byte value) {
            addCriterion("room_size <=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIn(List<Byte> values) {
            addCriterion("room_size in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotIn(List<Byte> values) {
            addCriterion("room_size not in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeBetween(Byte value1, Byte value2) {
            addCriterion("room_size between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotBetween(Byte value1, Byte value2) {
            addCriterion("room_size not between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionIsNull() {
            addCriterion("room_direction is null");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionIsNotNull() {
            addCriterion("room_direction is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionEqualTo(String value) {
            addCriterion("room_direction =", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionNotEqualTo(String value) {
            addCriterion("room_direction <>", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionGreaterThan(String value) {
            addCriterion("room_direction >", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("room_direction >=", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionLessThan(String value) {
            addCriterion("room_direction <", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionLessThanOrEqualTo(String value) {
            addCriterion("room_direction <=", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionLike(String value) {
            addCriterion("room_direction like", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionNotLike(String value) {
            addCriterion("room_direction not like", value, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionIn(List<String> values) {
            addCriterion("room_direction in", values, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionNotIn(List<String> values) {
            addCriterion("room_direction not in", values, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionBetween(String value1, String value2) {
            addCriterion("room_direction between", value1, value2, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andRoomDirectionNotBetween(String value1, String value2) {
            addCriterion("room_direction not between", value1, value2, "roomDirection");
            return (Criteria) this;
        }

        public Criteria andWindowNumberIsNull() {
            addCriterion("window_number is null");
            return (Criteria) this;
        }

        public Criteria andWindowNumberIsNotNull() {
            addCriterion("window_number is not null");
            return (Criteria) this;
        }

        public Criteria andWindowNumberEqualTo(Byte value) {
            addCriterion("window_number =", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberNotEqualTo(Byte value) {
            addCriterion("window_number <>", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberGreaterThan(Byte value) {
            addCriterion("window_number >", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("window_number >=", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberLessThan(Byte value) {
            addCriterion("window_number <", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberLessThanOrEqualTo(Byte value) {
            addCriterion("window_number <=", value, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberIn(List<Byte> values) {
            addCriterion("window_number in", values, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberNotIn(List<Byte> values) {
            addCriterion("window_number not in", values, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberBetween(Byte value1, Byte value2) {
            addCriterion("window_number between", value1, value2, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("window_number not between", value1, value2, "windowNumber");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionIsNull() {
            addCriterion("window_direction is null");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionIsNotNull() {
            addCriterion("window_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionEqualTo(String value) {
            addCriterion("window_direction =", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionNotEqualTo(String value) {
            addCriterion("window_direction <>", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionGreaterThan(String value) {
            addCriterion("window_direction >", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("window_direction >=", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionLessThan(String value) {
            addCriterion("window_direction <", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionLessThanOrEqualTo(String value) {
            addCriterion("window_direction <=", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionLike(String value) {
            addCriterion("window_direction like", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionNotLike(String value) {
            addCriterion("window_direction not like", value, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionIn(List<String> values) {
            addCriterion("window_direction in", values, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionNotIn(List<String> values) {
            addCriterion("window_direction not in", values, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionBetween(String value1, String value2) {
            addCriterion("window_direction between", value1, value2, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andWindowDirectionNotBetween(String value1, String value2) {
            addCriterion("window_direction not between", value1, value2, "windowDirection");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberIsNull() {
            addCriterion("bathroom_number is null");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberIsNotNull() {
            addCriterion("bathroom_number is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberEqualTo(Byte value) {
            addCriterion("bathroom_number =", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberNotEqualTo(Byte value) {
            addCriterion("bathroom_number <>", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberGreaterThan(Byte value) {
            addCriterion("bathroom_number >", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("bathroom_number >=", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberLessThan(Byte value) {
            addCriterion("bathroom_number <", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberLessThanOrEqualTo(Byte value) {
            addCriterion("bathroom_number <=", value, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberIn(List<Byte> values) {
            addCriterion("bathroom_number in", values, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberNotIn(List<Byte> values) {
            addCriterion("bathroom_number not in", values, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberBetween(Byte value1, Byte value2) {
            addCriterion("bathroom_number between", value1, value2, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("bathroom_number not between", value1, value2, "bathroomNumber");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeIsNull() {
            addCriterion("bathroom_size is null");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeIsNotNull() {
            addCriterion("bathroom_size is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeEqualTo(String value) {
            addCriterion("bathroom_size =", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeNotEqualTo(String value) {
            addCriterion("bathroom_size <>", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeGreaterThan(String value) {
            addCriterion("bathroom_size >", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeGreaterThanOrEqualTo(String value) {
            addCriterion("bathroom_size >=", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeLessThan(String value) {
            addCriterion("bathroom_size <", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeLessThanOrEqualTo(String value) {
            addCriterion("bathroom_size <=", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeLike(String value) {
            addCriterion("bathroom_size like", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeNotLike(String value) {
            addCriterion("bathroom_size not like", value, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeIn(List<String> values) {
            addCriterion("bathroom_size in", values, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeNotIn(List<String> values) {
            addCriterion("bathroom_size not in", values, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeBetween(String value1, String value2) {
            addCriterion("bathroom_size between", value1, value2, "bathroomSize");
            return (Criteria) this;
        }

        public Criteria andBathroomSizeNotBetween(String value1, String value2) {
            addCriterion("bathroom_size not between", value1, value2, "bathroomSize");
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