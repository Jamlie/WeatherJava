package com.jam.types;

public enum TemperatureUnit {
    CELSIUS,
    FAHRENHEIT;

    public String toString() {
        return switch(this) {
            case CELSIUS -> "Celsius";
            case FAHRENHEIT -> "Fahrenheit";
        };
    }
}
