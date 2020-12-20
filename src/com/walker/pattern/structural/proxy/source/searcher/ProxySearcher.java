package com.walker.pattern.structural.proxy.source.searcher;

import com.walker.pattern.structural.proxy.source.AccessValidator;
import com.walker.pattern.structural.proxy.source.Logger;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 22:11.
 */
public class ProxySearcher implements Searcher {

    private Searcher searcher = new RealSearcher();

    private AccessValidator validator = new AccessValidator();

    private Logger logger = new Logger();

    @Override
    public String doSearch(String id, String pwd) {
        System.out.println("ProxySearcher doSearch id: " + id + ", pwd: " + pwd);
        return searcher.doSearch(id, pwd);
    }

    public boolean validate(String id) {
        System.out.println("ProxySearcher validate id " + id);
        return validator.validate(id);
    }

    public void log(String id) {
        System.out.println("ProxySearcher log " + id);
        logger.log(id);
    }

}
