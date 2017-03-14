package com.walker.pattern.creational.factory.normal;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:30.
 */
public interface LoggerFactory {

    Logger createLogger();

    Logger createLogger(String args);

    Logger createLogger(Object obj);

}
