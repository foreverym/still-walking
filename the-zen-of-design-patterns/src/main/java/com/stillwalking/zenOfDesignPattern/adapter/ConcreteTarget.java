package com.stillwalking.zenOfDesignPattern.adapter;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月30日 0:34  
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help, pls call me");
    }
}
