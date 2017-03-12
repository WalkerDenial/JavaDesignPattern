package com.walker.utils.resource.interfaces.impl;

import com.sun.istack.internal.NotNull;
import com.walker.utils.resource.exception.NullKeyException;
import com.walker.utils.resource.interfaces.ILocalResource;
import com.walker.utils.tools.StringUtil;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 16:17.
 */
public abstract class AbstractLocalResource implements ILocalResource {

    private String sourceFile;

    public AbstractLocalResource() {

    }

    public abstract String getValue(@NotNull String key);

    @Override
    public String getValueByKey(@NotNull String key) {
        try {
            if (StringUtil.isBlank(key))
                throw new NullKeyException();
            else
                return getValue(key);
        } catch (NullKeyException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    @Override
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

}
