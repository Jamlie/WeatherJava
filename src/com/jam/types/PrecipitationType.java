package com.jam.types;

public enum PrecipitationType {
    RAIN,
    SNOW,
    CLOUDY,
    SUNNY,
    FOGGY,
    THUNDERSTORM,
    WINDY,
    HAIL,
    SLEET,
    NONE;

    public String toString() {
        return switch(this) {
            case RAIN -> "Rain";
            case SNOW -> "Snow";
            case CLOUDY -> "Cloudy";
            case SUNNY -> "Sunny";
            case FOGGY -> "Foggy";
            case THUNDERSTORM -> "Thunderstorm";
            case WINDY -> "Windy";
            case HAIL -> "Hail";
            case SLEET -> "Sleet";
            case NONE -> "None";
        };
    }
}
