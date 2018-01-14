package org.quetzalcode.designpatterns.v3;


import javafx.beans.binding.When;

import java.util.Observable;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherDataObservable observable;
    public static class WeatherDataObservable extends Observable{
        private WeatherData weatherData;
        public WeatherDataObservable(WeatherData weatherData){
            this.weatherData=weatherData;
        }

        @Override
        protected synchronized void setChanged() {
            super.setChanged();
        }

        public WeatherData getWeatherData() {
            return weatherData;
        }
    }

    public WeatherData(){
        observable=new WeatherDataObservable(this);
    }

    public void measurementsChanged(){
        observable.setChanged();
        observable.notifyObservers();
    }

    public Observable getObservable(){
        return observable;
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
