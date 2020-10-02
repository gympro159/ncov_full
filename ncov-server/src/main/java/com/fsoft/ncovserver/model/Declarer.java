package com.fsoft.ncovserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Declarer")
public class Declarer {

    @Id
    private String id;
    private String fullName;
    private String phone;
    private String email;
    private String place;
    private String note;

    public Declarer() {
    }

    public Declarer(String id, String fullName, String phone, String email, String place, String note) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.place = place;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}