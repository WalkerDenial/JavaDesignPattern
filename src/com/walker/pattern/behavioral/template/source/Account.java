package com.walker.pattern.behavioral.template.source;

/**
 * 先设计好住框架流程，并开放可扩展部分
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:37.
 */
public abstract class Account {

    /**
     * 鉴权
     *
     * @param account
     * @param password
     * @return
     */
    public boolean validate(String account, String password) {
        // 模拟鉴权全部通过
        return true;
    }

    /**
     * 计算余额
     */
    abstract double calculateInterest();

    // 展示
    protected void display() {
        System.out.println("interest: " + calculateInterest());
    }

    /**
     * 事件流分发
     */
    public void handle(String account, String password) {
        validate(account, password);
        display();
    }

}
