package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

public class PlayerStats {

    @SerializedName("id")
    private int id = 0;

    @SerializedName("game_id")
    private int gameID = 0;

    @SerializedName("player_id")
    private int playerID = 0;

    @SerializedName("team_id")
    private int teamID = 0;

    @SerializedName("points")
    private String points = "";

    @SerializedName("assists")
    private String assists = "";

    @SerializedName("rebounds")
    private String rebounds = "";

    @SerializedName("nerd")
    private String nerd = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNerd() {
        return nerd;
    }

    public void setNerd(String nerd) {
        this.nerd = nerd;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getRebounds() {
        return rebounds;
    }

    public void setRebounds(String rebounds) {
        this.rebounds = rebounds;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

}
