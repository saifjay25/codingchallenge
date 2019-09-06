package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

public class Players {

    @SerializedName("id")
    private int id = 0;

    @SerializedName("name")
    private String name = "";

    @SerializedName("team_id")
    private int teamID = 0;

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

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
}
