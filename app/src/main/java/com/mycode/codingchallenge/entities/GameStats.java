package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameStats {

    @SerializedName("id")
    private int id = 0;

    @SerializedName("game_id")
    private int gameID = 0;

    @SerializedName("home_team_score")
    private String homeScore = "";

    @SerializedName("away_team_score")
    private String awayScore = "";

    @SerializedName("broadcast")
    private String broadcast = "";

    @SerializedName("quarter")
    private int quarter = 0;

    @SerializedName("time_left_in_quarter")
    private String timeLeft = "";

    @SerializedName("game_status")
    private String gameStatus = "";

    @SerializedName("game_start")
    private String gameStart ="";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameStart() {
        return gameStart;
    }

    public void setGameStart(String gameStart) {
        this.gameStart = gameStart;
    }
}
