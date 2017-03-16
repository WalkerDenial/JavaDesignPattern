package com.walker.pattern.behavioral.command;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 11:49.
 */
public class HelpCommand extends Command {

    private HelpHandler handler = new HelpHandler();

    public HelpCommand() {
        
    }

    @Override
    void execute() {

    }

}
