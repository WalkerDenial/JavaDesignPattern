package com.walker.pattern.creational.prototype.source;

/**
 * FAR 格式文档
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:05.
 */
public class FAR extends OfficialDocument {

    public FAR() {

    }

    public FAR(OfficialDocument document) {
        super(document);
    }

    @Override
    public OfficialDocument clone() {
        return new FAR(this);
    }

}
