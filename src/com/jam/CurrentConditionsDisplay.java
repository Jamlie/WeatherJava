package com.jam;

import com.jam.common.IWeatherDataDisplay;
import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;

public class CurrentConditionsDisplay implements WeatherDataObservable, IWeatherDataDisplay {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(IWeatherDataSubject weatherDataSubject) {
        weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        this.display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2fC degrees, %.2f%% humidity\n", this.temperature, this.humidity);
    }
}
