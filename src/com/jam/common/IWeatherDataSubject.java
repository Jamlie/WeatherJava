package com.jam.common;

public interface IWeatherDataSubject {
    void registerObserver(WeatherDataObservable observer);
    void removeObserver(WeatherDataObservable observer);
    void notifyObservers();

    void setMeasurements(float temperature, float humidity);
}
