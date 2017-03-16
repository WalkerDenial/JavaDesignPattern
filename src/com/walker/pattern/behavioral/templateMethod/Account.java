package com.walker.pattern.behavioral.templateMethod;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:37.
 */
public abstract class Account {

    public boolean validate(String account, String password){
        return true;
    }

    abstract void calculateInterest();

    public void display(){

    }

    public void handle(String account, String password){

    }

}
