package com.fsoft.ncovserver.model;

import org.springframework.data.annotation.Id;

public class Region {
    @Id
    private String idRegion;
    private String nameRegion;

    public Region() {
    }

    public Region(String idRegion, String nameRegion) {
        this.idRegion = idRegion;
        this.nameRegion = nameRegion;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

}