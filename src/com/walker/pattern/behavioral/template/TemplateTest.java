package com.walker.pattern.behavioral.template;

import com.walker.pattern.behavioral.template.source.Account;
import com.walker.pattern.behavioral.template.source.CurrentAccount;
import com.walker.pattern.behavioral.template.source.SavingAccount;

public class TemplateTest {

    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.handle(null, null);

        account = new SavingAccount();
        account.handle(null, null);
    }

}
