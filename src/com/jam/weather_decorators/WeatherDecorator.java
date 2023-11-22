package com.jam.weather_decorators;

import com.jam.common.WeatherDataObservable;

public abstract class WeatherDecorator implements WeatherDataObservable {
    protected WeatherDataObservable weatherDataObservable;

    public WeatherDecorator(WeatherDataObservable weatherDataObservable) {
        this.weatherDataObservable = weatherDataObservable;
    }
}
