package org.quetzalcode.designpatterns.simplefactory;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }

    public Pizza orderPizza(String type){
        return null;
    }
}
