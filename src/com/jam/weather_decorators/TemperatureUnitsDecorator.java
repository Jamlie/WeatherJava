package com.jam.weather_decorators;

import com.jam.common.WeatherDataObservable;
import com.jam.internal.TemperatureUnitsDecoratorUtils;
import com.jam.types.TemperatureUnit;

public class TemperatureUnitsDecorator extends WeatherDecorator {
    private final TemperatureUnit unit;
    public TemperatureUnitsDecorator(WeatherDataObservable observable, TemperatureUnit unit) {
        super(observable);
        this.unit = unit;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.weatherDataObservable.update(TemperatureUnitsDecoratorUtils.getTemperatureFromUnit(this.unit, temperature), humidity);
    }
}
