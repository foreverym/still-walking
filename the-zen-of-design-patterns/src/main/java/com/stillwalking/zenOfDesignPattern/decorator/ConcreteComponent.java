package com.stillwalking.zenOfDesignPattern.decorator;

import sun.reflect.ConstantPool;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月29日 23:27  
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("开始了吗");
    }

}
