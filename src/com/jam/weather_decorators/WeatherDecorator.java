package com.jam.weather_decorators;

import com.jam.WeatherDataSubject;
import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;

public abstract class WeatherDecorator implements IWeatherDataSubject {
    protected IWeatherDataSubject weatherDataSubject;
    protected WeatherDataObservable weatherDataObservable;
    protected float temperature;
    protected float humidity;

    public WeatherDecorator() {
        this.weatherDataSubject = new WeatherDataSubject();
    }
    public WeatherDecorator(IWeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
    }

    public WeatherDecorator(WeatherDataObservable weatherDataObservable) {
        this.weatherDataObservable = weatherDataObservable;
    }

    @Override
    public void registerObserver(WeatherDataObservable observer) {
        this.weatherDataSubject.registerObserver(observer);
    }

    @Override
    public void removeObserver(WeatherDataObservable observer) {
        this.weatherDataSubject.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.weatherDataSubject.notifyObservers();
    }

    @Override
    public void setMeasurements(float temperature, float humidity) {
        this.weatherDataSubject.setMeasurements(temperature, humidity);
    }
}
