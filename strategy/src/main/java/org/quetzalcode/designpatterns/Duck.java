package org.quetzalcode.designpatterns;

import org.quetzalcode.designpatterns.fly.FlyBehavior;
import org.quetzalcode.designpatterns.quack.QuackBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(){

    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void permorQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
