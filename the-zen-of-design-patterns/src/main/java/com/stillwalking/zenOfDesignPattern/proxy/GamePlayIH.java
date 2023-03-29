package com.stillwalking.zenOfDesignPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月25日 13:24  
 */
public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;

    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("可以另外做一些处理");
        }
        return result;
    }
}
