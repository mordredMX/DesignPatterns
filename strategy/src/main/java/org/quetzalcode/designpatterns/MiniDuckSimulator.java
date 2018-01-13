package org.quetzalcode.designpatterns;

import org.quetzalcode.designpatterns.fly.FlyRocketPowered;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard= new MallardDuck();
        mallard.permorQuack();
        mallard.performFly();
        Duck model= new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
