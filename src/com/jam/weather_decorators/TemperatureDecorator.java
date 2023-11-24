package com.jam.weather_decorators;

import com.jam.WeatherDataSubject;
import com.jam.common.WeatherDataObservable;
import com.jam.internal.TemperatureUnitsDecoratorUtils;
import com.jam.types.TemperatureUnit;

public class TemperatureDecorator extends WeatherDecorator {
    private final TemperatureUnit unit;

    public TemperatureDecorator(TemperatureUnit unit) {
        super();
        this.unit = unit;
    }

    public TemperatureDecorator(WeatherDataSubject weatherDataSubject, TemperatureUnit unit) {
        super(weatherDataSubject);
        this.unit = unit;
    }

    public TemperatureDecorator(WeatherDataObservable weatherDataObservable, TemperatureUnit unit) {
        super(weatherDataObservable);
        this.unit = unit;
    }

    @Override
    public void setMeasurements(float temperature, float humidity) {
        super.setMeasurements(TemperatureUnitsDecoratorUtils.getTemperatureFromUnit(this.unit, temperature), humidity);
    }
}
