package com.stillwalking.zenOfDesignPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月25日 13:32  
 */
public class Client {

    public static void main(String[] args) {
        // 定义一个玩家
        IGamePlayer gamePlayer = new GamePlayer();
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        // 获取类加载器
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);
        proxy.play();
    }
}
