package com.walker.pattern.behavioral.observer.source;


import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:43.
 */
public class LoginBean {

    private List<LoginEventListener> lel = new ArrayList<>();

    private LoginEvent le = new LoginEvent();

    public LoginBean() {

    }

    public void addLoginEventListener(LoginEventListener listener){
        lel.add(listener);
    }

    public void fireLoginEvent(LoginEventListener listener, String userName, String password){
        lel.remove(listener);
    }

    public void actionPerformed(LoginEvent event){
        for (int i = 0; i < lel.size(); i++) lel.get(i).validateLogin(event);
    }

}
