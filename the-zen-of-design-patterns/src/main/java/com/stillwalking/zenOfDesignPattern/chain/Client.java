package com.stillwalking.zenOfDesignPattern.chain;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月28日 23:57  
 */
public class Client {

    public static void main(String[] args) {
        Handler projectDeptManagerHandler = new ProjectDeptManagerHandler();
        Handler projectGroupManagerHandler = new ProjectGroupManagerHandler();
        projectGroupManagerHandler.setNextHandler(projectDeptManagerHandler);
        projectGroupManagerHandler.handleWgApply();
    }
}
