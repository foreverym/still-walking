package com.stillwalking.zenOfDesignPattern.decorator;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月29日 23:33  
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);

    }

    @Override
    public void operate() {
        super.operate();
        this.doSomething();

    }

    public void doSomething() {
        System.out.println(".。。。。。。。");
    }

}
