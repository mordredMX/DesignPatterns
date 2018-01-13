package org.quetzalcode.designpatterns.v1;

public class ForecastDisplay implements DisplayElement,Observer{
    private Subject weatherData;

    private float humidity, temperature,pressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.resgisterObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("forecast: temperature=%f,  humidity=%f, pressure=%f",temperature,humidity,pressure));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}
