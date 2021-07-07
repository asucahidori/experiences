package com.gatz.discovery.modules.cidm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBldHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBldHouseExample() {
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

        public Criteria andBuildingUnitNoIsNull() {
            addCriterion("building_unit_no is null");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoIsNotNull() {
            addCriterion("building_unit_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoEqualTo(String value) {
            addCriterion("building_unit_no =", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoNotEqualTo(String value) {
            addCriterion("building_unit_no <>", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoGreaterThan(String value) {
            addCriterion("building_unit_no >", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoGreaterThanOrEqualTo(String value) {
            addCriterion("building_unit_no >=", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoLessThan(String value) {
            addCriterion("building_unit_no <", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoLessThanOrEqualTo(String value) {
            addCriterion("building_unit_no <=", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoLike(String value) {
            addCriterion("building_unit_no like", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoNotLike(String value) {
            addCriterion("building_unit_no not like", value, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoIn(List<String> values) {
            addCriterion("building_unit_no in", values, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoNotIn(List<String> values) {
            addCriterion("building_unit_no not in", values, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoBetween(String value1, String value2) {
            addCriterion("building_unit_no between", value1, value2, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingUnitNoNotBetween(String value1, String value2) {
            addCriterion("building_unit_no not between", value1, value2, "buildingUnitNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoIsNull() {
            addCriterion("building_house_no is null");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoIsNotNull() {
            addCriterion("building_house_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoEqualTo(String value) {
            addCriterion("building_house_no =", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoNotEqualTo(String value) {
            addCriterion("building_house_no <>", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoGreaterThan(String value) {
            addCriterion("building_house_no >", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("building_house_no >=", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoLessThan(String value) {
            addCriterion("building_house_no <", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoLessThanOrEqualTo(String value) {
            addCriterion("building_house_no <=", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoLike(String value) {
            addCriterion("building_house_no like", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoNotLike(String value) {
            addCriterion("building_house_no not like", value, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoIn(List<String> values) {
            addCriterion("building_house_no in", values, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoNotIn(List<String> values) {
            addCriterion("building_house_no not in", values, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoBetween(String value1, String value2) {
            addCriterion("building_house_no between", value1, value2, "buildingHouseNo");
            return (Criteria) this;
        }

        public Criteria andBuildingHouseNoNotBetween(String value1, String value2) {
            addCriterion("building_house_no not between", value1, value2, "buildingHouseNo");
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