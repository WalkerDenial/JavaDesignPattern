package com.walker.pattern.behavioral.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 12:33.
 */
public abstract class Node {

    public abstract void interpret(Context context);

    public abstract void execute();

}
