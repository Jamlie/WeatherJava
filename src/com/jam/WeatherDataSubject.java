package com.jam;

import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements IWeatherDataSubject {
    private float temperature;
    private float humidity;

    private final List<WeatherDataObservable> observers;

    public WeatherDataSubject() {
        this.temperature = 0;
        this.humidity = 0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherDataObservable observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherDataObservable observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherDataObservable observer : this.observers) {
            observer.update(this.temperature, this.humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        this.notifyObservers();
    }
}
