package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrdBuildingKey {
    private Date date;

    private Long familyId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }
}