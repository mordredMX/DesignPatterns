package org.quetzalcode.designpatterns.v1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements  Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void resgisterObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i= observers.indexOf(observer);
        if(i<=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o->o.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
