package com.stillwalking.zenOfDesignPattern.builder;

import java.util.ArrayList;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月18日 0:15  
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
