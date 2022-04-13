package com.novo.framework.core.monitor;

public interface Observable {

    public void registerObserver(Observer observer);


    public void unRegisterObserver(Observer observer);


    public void notifyObservers();

}
