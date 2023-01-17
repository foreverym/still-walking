package com.stillwalking.zenOfDesignPattern.builder;

import java.util.ArrayList;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月18日 0:20  
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        CarBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();
    }
}
