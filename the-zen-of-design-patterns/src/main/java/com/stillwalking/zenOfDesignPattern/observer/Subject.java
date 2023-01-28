package com.stillwalking.zenOfDesignPattern.observer;

import java.util.Vector;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月29日 0:09  
 */
public abstract class Subject {

    // 定义一个观察者数组
    private Vector<Observer> obsVector = new Vector<>();

    // 增加一个观察者
    public void addObserver(Observer observer) {
        obsVector.add(observer);
    }

    // 删除一个观察者
    public void deleteObserver(Observer observer) {
        obsVector.remove(observer);
    }

    // 通知所有的观察者
    public void notifyObservers() {
        for (Observer observer : obsVector) {
            observer.update();
        }
    }
}
