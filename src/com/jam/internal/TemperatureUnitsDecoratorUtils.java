package com.jam.internal;

import com.jam.types.TemperatureUnit;

public final class TemperatureUnitsDecoratorUtils {
    public static float getTemperatureFromUnit(TemperatureUnit unit, float temperature) {
        return switch (unit) {
            case FAHRENHEIT -> convertCelsiusToFahrenheit(temperature);
            case CELSIUS -> temperature;
        };
    }

    private static float convertCelsiusToFahrenheit(float temperature) {
        return temperature * 1.8f + 32;
    }
}
