package com.fsoft.ncovserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Vietnam")
public class Vietnam {

    @Id
    private String id;
    private Integer age;
    private Boolean gender;
    private String place;
    private String status;
    private String nationality;

    public Vietnam() {
    }

    public Vietnam(String id, Integer age, Boolean gender, String place, String status, String nationality) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.place = place;
        this.status = status;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
}