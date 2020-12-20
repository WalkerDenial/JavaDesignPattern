package com.walker.pattern.creational.prototype.source;

/**
 * 文档基类
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:04.
 */
public abstract class OfficialDocument implements Cloneable {

    private String type;

    public OfficialDocument() {
        type = " --> " + Math.random();
    }

    /**
     * 采用浅拷贝的方式对对象赋值，在生产新的对象的同时，结果也进行了保留
     * @param document
     */
    public OfficialDocument(OfficialDocument document) {
        this.type = document.type;
    }

    public abstract OfficialDocument clone(); // 克隆文档

    public void display() { // 展示
        System.out.println("type is " + type);
    }

}
