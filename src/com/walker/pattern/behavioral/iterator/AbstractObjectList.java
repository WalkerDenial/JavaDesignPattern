package com.walker.pattern.behavioral.iterator;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:00.
 */
public abstract class AbstractObjectList {

    protected List<Object> objects;

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(){

    }

    public void removeObject(Object obj){

    }

    public List<Object> getObjects() {
        return objects;
    }

    abstract AbstractIterator createIterator();

}
