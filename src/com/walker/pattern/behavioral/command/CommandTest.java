package com.walker.pattern.behavioral.command;

import com.walker.pattern.behavioral.command.source.FunctionButton;
import com.walker.pattern.behavioral.command.source.HelpCommand;
import com.walker.pattern.behavioral.command.source.MinimizeCommand;

public class CommandTest {

    public static void main(String[] args) {
        FunctionButton button = new FunctionButton("");
        button.setCommand(new HelpCommand());
        button.onClick();

        button.setCommand(new MinimizeCommand());
        button.onClick();
    }

}
