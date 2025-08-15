package com.example.footballapp.model;

import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<League> getMockLeagues() {
        return Arrays.asList(
                new League(
                        "60d5f3f77a5b4b3b4c9e1b2a", // IDs de exemplo como String
                        "Premier League",
                        "England",
                        "2024/2025",
                        Arrays.asList(
                                "Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton & Hove Albion",
                                "Chelsea", "Crystal Palace", "Everton", "Fulham", "Ipswich Town",
                                "Leicester City", "Liverpool", "Manchester City", "Manchester United",
                                "Newcastle United", "Nottingham Forest", "Southampton", "Tottenham Hotspur",
                                "West Ham United", "Wolverhampton Wanderers"
                        ),
                        39
                ),
                new League(
                        "60d5f3f77a5b4b3b4c9e1b2b",
                        "La Liga",
                        "Spain",
                        "2024/2025",
                        Arrays.asList(
                                "Alavés", "Almería", "Athletic Club", "Atlético Madrid", "Barcelona",
                                "Cádiz", "Celta de Vigo", "Deportivo La Coruña", "Espanyol", "Getafe",
                                "Girona", "Granada", "Las Palmas", "Leganés", "Mallorca", "Osasuna",
                                "Rayo Vallecano", "Real Betis", "Real Madrid", "Real Sociedad"
                        ),
                        140
                )
        );
    }
}
