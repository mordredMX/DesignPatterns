package org.quetzalcode.designpatterns.v2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement,Observer {

    private Observable observable;

    private float humidity, temperature,pressure;

    public ForecastDisplay(Observable observable) {
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("forecast: temperature=%f,  humidity=%f, pressure=%f",temperature,humidity,pressure));
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof  WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            this.pressure=weatherData.getPressure();
            display();
        }
    }
}
