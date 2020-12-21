package com.walker.pattern.behavioral.template.source;

/**
 * 当前账户余额
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:39.
 */
public class CurrentAccount extends Account {
    @Override
    double calculateInterest() {
        return 88;
    }
}
