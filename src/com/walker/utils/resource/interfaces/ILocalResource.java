package com.walker.utils.resource.interfaces;

import com.sun.istack.internal.NotNull;

import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 16:02.
 */
public interface ILocalResource {

    String getValueByKey(@NotNull String key);

    Map<String, String> getValue();

    void setSourceFile(String sourceFile);

}
