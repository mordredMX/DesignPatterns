package org.quetzalcode.designpatterns.fly;

import org.quetzalcode.designpatterns.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
