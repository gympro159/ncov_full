package com.fsoft.ncovserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "World")
public class World {

    @Id
    private String id;
    private String nation;
    private Integer nhiem;
    private Double matDoNhiem;
    private Integer binhPhuc;
    private Integer tuVong;
    private Region region;

    public World() {
    }

    public World(String id, String nation, Integer nhiem, Double matDoNhiem, Integer binhPhuc, Integer tuVong,
            Region region) {
        this.id = id;
        this.nation = nation;
        this.nhiem = nhiem;
        this.matDoNhiem = matDoNhiem;
        this.binhPhuc = binhPhuc;
        this.tuVong = tuVong;
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getNhiem() {
        return nhiem;
    }

    public void setNhiem(Integer nhiem) {
        this.nhiem = nhiem;
    }

    public Double getMatDoNhiem() {
        return matDoNhiem;
    }

    public void setMatDoNhiem(Double matDoNhiem) {
        this.matDoNhiem = matDoNhiem;
    }

    public Integer getBinhPhuc() {
        return binhPhuc;
    }

    public void setBinhPhuc(Integer binhPhuc) {
        this.binhPhuc = binhPhuc;
    }

    public Integer getTuVong() {
        return tuVong;
    }

    public void setTuVong(Integer tuVong) {
        this.tuVong = tuVong;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    
    
}