package com.mycode.codingchallenge.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BasketballData {

    @SerializedName("teams")
    private List<Team> team = null;

    @SerializedName("players")
    private List<Players> players = null;

    @SerializedName("games")
    private List<BasketballGames> games = null;

    @SerializedName("player_stats")
    private List<PlayerStats> playerStats = null;

    @SerializedName("game_states")
    private List<GameStats> gameStats = null;

    public List<GameStats> getGameStats() {
        return gameStats;
    }

    public void setGameStats(List<GameStats> gameStats) {
        this.gameStats = gameStats;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public List<BasketballGames> getGames() {
        return games;
    }

    public void setGames(List<BasketballGames> games) {
        this.games = games;
    }

    public List<PlayerStats> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }
}
