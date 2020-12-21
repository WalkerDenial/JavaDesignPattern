package com.walker.pattern.behavioral.observer.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:43.
 */
public class LoginValidatorA implements LoginEventListener {

    public LoginValidatorA() {

    }

    @Override
    public void validateLogin(LoginEvent event) {
        System.out.println("LoginValidatorA has called");
    }

}
