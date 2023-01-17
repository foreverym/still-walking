package com.stillwalking.zenOfDesignPattern.builder;

import java.util.ArrayList;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年01月18日 0:13  
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
