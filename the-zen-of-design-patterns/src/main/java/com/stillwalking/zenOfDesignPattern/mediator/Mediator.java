package com.stillwalking.zenOfDesignPattern.mediator;

import java.util.Objects;

/**
 * @Description: 中介者
 * @Author wyb
 * @Date 2023年01月17日 0:37  
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer)objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer)objects[0]);
        } else if (str.equals("sale.offSale")) {
            this.offSale();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    // 采购电脑
    public void buyComputer(int number) {
        int saleStatus = this.sale.getSaleStatus();
        if (saleStatus > 80) {
            // 销售状况良好
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + number + "台");
        }
    }

    // 销售电脑
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSale() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber());
    }

    // 清仓处理
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
