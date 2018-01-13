package org.quetzalcode.designpatterns;

import org.quetzalcode.designpatterns.fly.FlyNoWay;
import org.quetzalcode.designpatterns.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
