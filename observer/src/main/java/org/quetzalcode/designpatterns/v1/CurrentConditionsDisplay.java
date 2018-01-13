package org.quetzalcode.designpatterns.v1;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.resgisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %fF degrees and %f humidity",temperature,humidity));
    }
}
