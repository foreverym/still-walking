package com.stillwalking.zenOfDesignPattern.mediator;

/**
 * @Description: 抽象同事类
 * @Author wyb
 * @Date 2023年01月17日 0:11  
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }

}
