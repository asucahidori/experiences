package com.gatz.discovery.modules.cidm.model;

import java.math.BigDecimal;
import java.util.Date;

public class TOrder {
    private Long id;

    private String orderSn;

    private String groupId;

    private Integer orderType;

    private Long customerId;

    private String consignee;

    private String consigneePhone;

    private Long provinceId;

    private Long cityId;

    private Long countyId;

    private Long townId;

    private Long villageId;

    private Long tinyVillageId;

    private Long buildingId;

    private String detailAddress;

    private String completeAddress;

    private Long employeeId;

    private String employeePhone;

    private String employeeName;

    private Long storeId;

    private Long eshopId;

    private String eshopName;

    private Long receiptsId;

    private Integer evaluationStatus;

    private Date appointmentStartTime;

    private Date appointmentEndTime;

    private Integer orderStatus;

    private Integer orderSource;

    private Integer invoiceStatus;

    private String sellerRemark;

    private String buyerRemark;

    private String employeeRemark;

    private Integer payment;

    private Integer payStatus;

    private Integer payPlatform;

    private Date payTime;

    private BigDecimal tradingPrice;

    private BigDecimal freight;

    private Long couponId;

    private BigDecimal payablePrice;

    private Integer abnormalStatus;

    private Integer deliveryType;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private Long createUserId;

    private Long updateUserId;

    private Double totalWeight;

    private Integer totalQuantity;

    private Integer receiveOrSend;

    private Integer clothesAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone == null ? null : consigneePhone.trim();
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Long getTownId() {
        return townId;
    }

    public void setTownId(Long townId) {
        this.townId = townId;
    }

    public Long getVillageId() {
        return villageId;
    }

    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    public Long getTinyVillageId() {
        return tinyVillageId;
    }

    public void setTinyVillageId(Long tinyVillageId) {
        this.tinyVillageId = tinyVillageId;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress == null ? null : completeAddress.trim();
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getEshopId() {
        return eshopId;
    }

    public void setEshopId(Long eshopId) {
        this.eshopId = eshopId;
    }

    public String getEshopName() {
        return eshopName;
    }

    public void setEshopName(String eshopName) {
        this.eshopName = eshopName == null ? null : eshopName.trim();
    }

    public Long getReceiptsId() {
        return receiptsId;
    }

    public void setReceiptsId(Long receiptsId) {
        this.receiptsId = receiptsId;
    }

    public Integer getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(Integer evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    public Date getAppointmentStartTime() {
        return appointmentStartTime;
    }

    public void setAppointmentStartTime(Date appointmentStartTime) {
        this.appointmentStartTime = appointmentStartTime;
    }

    public Date getAppointmentEndTime() {
        return appointmentEndTime;
    }

    public void setAppointmentEndTime(Date appointmentEndTime) {
        this.appointmentEndTime = appointmentEndTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark == null ? null : sellerRemark.trim();
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark == null ? null : buyerRemark.trim();
    }

    public String getEmployeeRemark() {
        return employeeRemark;
    }

    public void setEmployeeRemark(String employeeRemark) {
        this.employeeRemark = employeeRemark == null ? null : employeeRemark.trim();
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getTradingPrice() {
        return tradingPrice;
    }

    public void setTradingPrice(BigDecimal tradingPrice) {
        this.tradingPrice = tradingPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getPayablePrice() {
        return payablePrice;
    }

    public void setPayablePrice(BigDecimal payablePrice) {
        this.payablePrice = payablePrice;
    }

    public Integer getAbnormalStatus() {
        return abnormalStatus;
    }

    public void setAbnormalStatus(Integer abnormalStatus) {
        this.abnormalStatus = abnormalStatus;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Integer getReceiveOrSend() {
        return receiveOrSend;
    }

    public void setReceiveOrSend(Integer receiveOrSend) {
        this.receiveOrSend = receiveOrSend;
    }

    public Integer getClothesAmount() {
        return clothesAmount;
    }

    public void setClothesAmount(Integer clothesAmount) {
        this.clothesAmount = clothesAmount;
    }
}