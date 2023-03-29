package com.stillwalking.zenOfDesignPattern.decorator;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月29日 23:45  
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        component.operate();

    }
}
