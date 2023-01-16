package com.stillwalking.zenOfDesignPattern.mediator;

/**
 * @Description: 库存管理
 * @Author wyb
 * @Date 2023年01月17日 0:18  
 */
public class Stock extends AbstractColleague {


    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    // 库存增加
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 库存降低
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
