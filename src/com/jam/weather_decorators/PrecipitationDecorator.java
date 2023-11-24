package com.jam.weather_decorators;

import com.jam.WeatherDataSubject;
import com.jam.common.WeatherDataObservable;
import com.jam.types.PrecipitationType;

public class PrecipitationDecorator extends WeatherDecorator {
    private final PrecipitationType precipitation;

    public PrecipitationDecorator(PrecipitationType precipitation) {
        super();
        this.precipitation = precipitation;
    }

    public PrecipitationDecorator(WeatherDataSubject weatherDataSubject, PrecipitationType precipitation) {
        super(weatherDataSubject);
        this.precipitation = precipitation;
    }

    public PrecipitationDecorator(WeatherDataObservable weatherDataObservable, PrecipitationType precipitation) {
        super(weatherDataObservable);
        this.precipitation = precipitation;
    }

    @Override
    public void setMeasurements(float temperature, float humidity) {
        super.setMeasurements(temperature, humidity);
        System.out.println("PrecipitationDecorator: " + precipitation.toString());
    }
}
