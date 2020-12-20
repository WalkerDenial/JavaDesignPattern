package com.walker.pattern.structural.adapter.source.adapter;

import com.walker.pattern.structural.adapter.source.target.Target;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 20:23.
 */
public abstract class Adapter {

    private String name = "adapter";

    abstract Target bindTarget();

    public void request() {
        bindTarget().request();
    }

}
