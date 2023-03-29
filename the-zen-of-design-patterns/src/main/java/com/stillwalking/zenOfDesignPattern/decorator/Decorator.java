package com.stillwalking.zenOfDesignPattern.decorator;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月29日 23:28  
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void operate() {
        this.component.operate();
    }

}
