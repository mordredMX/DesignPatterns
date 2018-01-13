package org.quetzalcode.designpatterns.fly;

import org.quetzalcode.designpatterns.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
