package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

public class BasketballGames {

    @SerializedName("id")
    private int id = 0;

    @SerializedName("home_team_id")
    private int homeID  = 0;

    @SerializedName("away_team_id")
    private int awayID = 0;

    @SerializedName("date")
    private String date = "";

    public int getHomeID() {
        return homeID;
    }

    public void setHomeID(int homeID) {
        this.homeID = homeID;
    }

    public int getAwayID() {
        return awayID;
    }

    public void setAwayID(int awayID) {
        this.awayID = awayID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
