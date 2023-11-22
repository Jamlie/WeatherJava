package com.jam.weather_decorators;

import com.jam.common.WeatherDataObservable;
import com.jam.types.PrecipitationType;

public class PrecipitationDecorator extends WeatherDecorator {
    PrecipitationType precipitation;

    public PrecipitationDecorator(WeatherDataObservable observable, PrecipitationType precipitation) {
        super(observable);
        this.precipitation = precipitation;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.weatherDataObservable.update(temperature, humidity);
        System.out.println("PrecipitationDecorator: " + precipitation.toString());
    }
}
