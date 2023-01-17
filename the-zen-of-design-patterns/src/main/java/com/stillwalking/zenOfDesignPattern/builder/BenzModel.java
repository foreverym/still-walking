package com.stillwalking.zenOfDesignPattern.builder;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月18日 0:09  
 */
public class BenzModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("奔驰车的跑起来是这样的...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车应该这样停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这样的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音是这样的...");
    }

}
