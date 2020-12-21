package com.walker.pattern.behavioral.observer;

import com.walker.pattern.behavioral.observer.source.LoginBean;
import com.walker.pattern.behavioral.observer.source.LoginEvent;
import com.walker.pattern.behavioral.observer.source.LoginValidatorA;
import com.walker.pattern.behavioral.observer.source.LoginValidatorB;

public class ObserverTest {

    public static void main(String[] args) {
        LoginBean loginBean = new LoginBean();
        loginBean.addLoginEventListener(new LoginValidatorA());
        loginBean.addLoginEventListener(new LoginValidatorB());

        loginBean.actionPerformed(new LoginEvent());
    }

}
