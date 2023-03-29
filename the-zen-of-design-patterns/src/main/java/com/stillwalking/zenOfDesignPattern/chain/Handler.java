package com.stillwalking.zenOfDesignPattern.chain;

/**
 * @Description:
 * @Author wyb
 * @Date 2023年03月28日 23:07  
 */
public abstract class Handler {


    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    // 获取角色id
    protected abstract Integer getRoleId();

    // 处理申请
    protected abstract void dealApply();

    public void handleWgApply() {
        if (this.getRoleId() == 1) {
            this.dealApply();
        }
        if (this.nextHandler != null) {
            this.nextHandler.dealApply();
        } else {
            // 没有找到处理折
        }
    }

}
