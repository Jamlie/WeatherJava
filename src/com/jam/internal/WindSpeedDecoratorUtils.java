package com.jam.internal;

import com.jam.types.WindSpeedMeasurementUnit;

public final class WindSpeedDecoratorUtils {
    public static final float KILOMETER_TO_MILE = 0.6213712f;
    public static void printWindSpeed(float speed, WindSpeedMeasurementUnit unit) {
        switch (unit) {
            case KPH -> System.out.println("Wind speed: " + speed + " km/h");
            case MPH -> System.out.println("Wind speed: " + convertKilometersPerHourToMilesPerHour(speed) + " mph");
        }
    }

    private static float convertKilometersPerHourToMilesPerHour(float windSpeed) {
        return windSpeed * KILOMETER_TO_MILE;
    }
}
