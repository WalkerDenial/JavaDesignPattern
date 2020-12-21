package com.walker.pattern.behavioral.observer.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:43.
 */
public class LoginValidatorB implements LoginEventListener {

    public LoginValidatorB() {

    }

    @Override
    public void validateLogin(LoginEvent event) {
        System.out.println("LoginValidatorB has called");
    }

}
