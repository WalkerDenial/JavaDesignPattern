package com.walker.pattern.structural.proxy.source.searcher;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 22:11.
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String id, String pwd) {
        return "RealSearcher doSearch id: " + id + ", pwd: " + pwd;
    }
}
