package com.stillwalking.zenOfDesignPattern.mediator;

/**
 * @Description: 场景类
 * @Author wyb
 * @Date 2023年01月17日 0:55  
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("------销售人员销售电脑------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("------库房管理人员管理库存------");
        Stock stock = new Stock(mediator);
        stock.clearStock();

    }


}
