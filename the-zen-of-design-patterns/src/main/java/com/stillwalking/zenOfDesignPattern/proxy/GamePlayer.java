package com.stillwalking.zenOfDesignPattern.proxy;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月25日 13:29  
 */
public class GamePlayer implements IGamePlayer {

    @Override
    public void play() {
        System.out.println("开始打游戏");
    }

}
