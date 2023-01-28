package com.stillwalking.zenOfDesignPattern.observer;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月29日 0:18  
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        concreteSubject.addObserver(observer);
        concreteSubject.doSomething();
    }
}
