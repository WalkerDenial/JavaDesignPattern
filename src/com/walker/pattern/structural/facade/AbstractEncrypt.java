package com.walker.pattern.structural.facade;

import com.sun.istack.internal.NotNull;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:41.
 */
public abstract class AbstractEncrypt {

    abstract String encrypt(@NotNull String str);

    abstract String decrypt(@NotNull String str);

}
