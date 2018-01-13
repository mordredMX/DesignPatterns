package org.quetzalcode.designpatterns;

import org.quetzalcode.designpatterns.fly.FlyWithWings;
import org.quetzalcode.designpatterns.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
