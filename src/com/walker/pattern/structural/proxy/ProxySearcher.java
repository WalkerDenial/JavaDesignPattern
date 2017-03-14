package com.walker.pattern.structural.proxy;

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
        return null;
    }

    public boolean validate(String id) {
        return validator.validate(id);
    }

    public void log(String id) {
        logger.log(id);
    }

}
