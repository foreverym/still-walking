package com.stillwalking.zenOfDesignPattern.builder;

import java.util.ArrayList;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月18日 0:15  
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
