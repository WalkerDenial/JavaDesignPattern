package com.walker.pattern.structural.proxy;

import com.walker.pattern.structural.proxy.source.searcher.ProxySearcher;
import com.walker.pattern.structural.proxy.source.searcher.Searcher;

public class ProxyTest {

    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        System.out.println(searcher.doSearch("123", "321"));
    }

}
