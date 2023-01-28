package com.stillwalking.zenOfDesignPattern.observer;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月29日 0:11  
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到消息并进行处理");
    }
}
