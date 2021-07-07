package com.gatz.discovery.modules.cidm.model;

public class FamilyMemberKey {
    private Long customerId;

    private Long houseId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }
}