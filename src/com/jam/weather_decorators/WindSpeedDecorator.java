package com.jam.weather_decorators;

import com.jam.common.WeatherDataObservable;
import com.jam.internal.WindSpeedDecoratorUtils;
import com.jam.types.WindSpeedMeasurementUnit;

public class WindSpeedDecorator extends WeatherDecorator {
    private final WindSpeedMeasurementUnit unit;
    private final float speedInKM;
    public WindSpeedDecorator(WeatherDataObservable observable, float speedInKM, WindSpeedMeasurementUnit unit) {
        super(observable);
        this.speedInKM = speedInKM;
        this.unit = unit;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.weatherDataObservable.update(temperature, humidity);
        WindSpeedDecoratorUtils.printWindSpeed(this.speedInKM, this.unit);
    }
}
