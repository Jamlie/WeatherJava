package com.jam.weather_decorators;

import com.jam.WeatherDataSubject;
import com.jam.common.WeatherDataObservable;
import com.jam.types.WindSpeedMeasurementUnit;

public class WindSpeedDecorator extends WeatherDecorator {
    private final float windSpeed;
    private final WindSpeedMeasurementUnit unit;

    public WindSpeedDecorator(float windSpeed, WindSpeedMeasurementUnit unit) {
        super();
        this.windSpeed = windSpeed;
        this.unit = unit;
    }

    public WindSpeedDecorator(WeatherDataSubject weatherDataSubject, float windSpeed, WindSpeedMeasurementUnit unit) {
        super(weatherDataSubject);
        this.windSpeed = windSpeed;
        this.unit = unit;
    }

    public WindSpeedDecorator(WeatherDataObservable weatherDataObservable, float windSpeed, WindSpeedMeasurementUnit unit) {
        super(weatherDataObservable);
        this.windSpeed = windSpeed;
        this.unit = unit;
    }

    @Override
    public void setMeasurements(float temperature, float humidity) {
        super.setMeasurements(temperature, humidity);
        System.out.println("Wind Speed: " + windSpeed + " " + unit.toString());
    }
}
