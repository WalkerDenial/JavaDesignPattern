package com.walker.pattern.creational.prototype.source;

/**
 * SRS 模式文档
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:05.
 */
public class SRS extends OfficialDocument {

    public SRS() {
    }

    public SRS(OfficialDocument document) {
        super(document);
    }

    @Override
    public OfficialDocument clone() {
        return new SRS(this);
    }

}
