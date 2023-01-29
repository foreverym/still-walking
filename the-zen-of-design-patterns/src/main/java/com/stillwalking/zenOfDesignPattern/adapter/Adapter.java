package com.stillwalking.zenOfDesignPattern.adapter;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月30日 0:38  
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }

}
