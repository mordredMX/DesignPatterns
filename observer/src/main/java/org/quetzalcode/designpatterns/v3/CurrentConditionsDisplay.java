package org.quetzalcode.designpatterns.v3;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %fF degrees and %f humidity",temperature,humidity));
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData.WeatherDataObservable){
            WeatherData.WeatherDataObservable weatherData=(WeatherData.WeatherDataObservable)o;
            temperature=weatherData.getWeatherData().getTemperature();
            humidity=weatherData.getWeatherData().getHumidity();
            display();
        }
    }
}
