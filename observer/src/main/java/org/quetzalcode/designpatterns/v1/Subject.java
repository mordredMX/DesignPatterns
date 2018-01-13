package org.quetzalcode.designpatterns.v1;

public interface Subject {
    public void resgisterObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
