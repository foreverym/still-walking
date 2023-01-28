package com.stillwalking.zenOfDesignPattern.observer;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月29日 0:19  
 */
public class ConcreteSubject extends Subject {

    public void doSomething() {
        super.notifyObservers();
    }
}
