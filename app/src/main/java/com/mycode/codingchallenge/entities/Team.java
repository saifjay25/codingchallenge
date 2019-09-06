package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("id")
    private int id =0;

    @SerializedName("name")
    private String name = "";

    @SerializedName("city")
    private String city = "";

    @SerializedName("record")
    private String record = "";

    @SerializedName("full_name")
    private String fullName = "";

    @SerializedName("abbrev")
    private String abbrev = "";

    @SerializedName("color")
    private String color = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
