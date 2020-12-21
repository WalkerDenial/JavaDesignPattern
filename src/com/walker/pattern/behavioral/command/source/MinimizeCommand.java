package com.walker.pattern.behavioral.command.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 11:49.
 */
public class MinimizeCommand extends Command {

    private WindowHandler handler = new WindowHandler();

    public MinimizeCommand() {

    }

    @Override
    void execute() {
        System.out.println("MinimizeCommand execute");
        handler.minimize();
    }

}
