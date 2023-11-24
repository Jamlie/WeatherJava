package com.jam.types;

public enum WindSpeedMeasurementUnit {
    KPH,
    MPH;

    @Override
    public String toString() {
        return switch(this) {
            case KPH -> "km/h";
            case MPH -> "mph";
        };
    }
}
