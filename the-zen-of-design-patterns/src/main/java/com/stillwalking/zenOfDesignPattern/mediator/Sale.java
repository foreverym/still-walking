package com.stillwalking.zenOfDesignPattern.mediator;

import java.util.Random;

/**
 * @Description: 销售管理
 * @Author wyb
 * @Date 2023年01月17日 0:28  
 */
public class Sale extends AbstractColleague {


    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        System.out.println("销售IBM电脑" + number + "台");
    }

    // 反映销售情况
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    // 折价处理
    public void offSale() {
        super.mediator.execute("sale.offSale");
    }
}
