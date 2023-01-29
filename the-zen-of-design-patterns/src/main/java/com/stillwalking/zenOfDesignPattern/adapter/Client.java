package com.stillwalking.zenOfDesignPattern.adapter;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月30日 0:38  
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
