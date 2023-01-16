package com.stillwalking.zenOfDesignPattern.mediator;

/**
 * @Description: 采购管理
 * @Author wyb
 * @Date 2023年01月17日 0:13  
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不在采购IBM电脑");
    }
}
