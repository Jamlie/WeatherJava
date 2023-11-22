package com.jam;

import com.jam.common.IWeatherDataDisplay;
import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;

public class StatisticsDisplay implements WeatherDataObservable, IWeatherDataDisplay {
    private float minTemp;
    private float maxTemp;
    private float avgTemp;
    private int numReadings;

    public StatisticsDisplay() {
        this.minTemp = 0;
        this.maxTemp = 0;
        this.avgTemp = 0;
        this.numReadings = 0;
    }

    public StatisticsDisplay(IWeatherDataSubject iWeatherDataSubject) {
        iWeatherDataSubject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        if (this.numReadings == 0) {
            this.minTemp = temperature;
            this.maxTemp = temperature;
        }

        this.minTemp = Math.min(this.minTemp, temperature);
        this.maxTemp = Math.max(this.maxTemp, temperature);
        this.avgTemp = (this.avgTemp * this.numReadings + temperature) / (this.numReadings + 1);
        this.numReadings++;

        this.display();
    }

    @Override
    public void display() {
        System.out.printf("Temperature Statistics: Min: %.2f Max: %.2f Avg: %.2f\n", this.minTemp, this.maxTemp, this.avgTemp);
    }
}
