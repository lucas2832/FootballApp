package com.example.footballapp.model;

import java.util.List;

public class League {
    private final String id;
    private final String name;
    private final String country;
    private final String season;
    private final List<String> teams;
    private final int leagueId;

    public League(String id, String name, String country, String season, List<String> teams, int leagueId) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.season = season;
        this.teams = teams;
        this.leagueId = leagueId;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getSeason() { return season; }
    public List<String> getTeams() { return teams; }
    public int getLeagueId() { return leagueId; }
}
