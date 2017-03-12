package com.walker.utils.resource.interfaces.impl;

import com.sun.istack.internal.NotNull;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 17:02.
 */
public class PropertyLocalResource extends AbstractLocalResource {

    private Properties mProperties;

    @Override
    public Map<String, String> getValue() {
        Iterator<String> it = getProperties().stringPropertyNames().iterator();
        Map<String, String> params = null;
        while (it.hasNext()) {
            if (params == null) params = new HashMap<>();
            String key = it.next();
            params.put(key, getValue(key));
        }
        return params;
    }

    @Override
    public String getValue(@NotNull String key) {
        if (getProperties() != null) {
            return getProperties().getProperty(key);
        }
        return null;
    }

    private Properties getProperties() {
        if (mProperties != null) return mProperties;
        InputStream is = null;
        try {
            mProperties = new Properties();
            is = new BufferedInputStream(PropertyLocalResource.class.getResourceAsStream(String.format("/%s", getSourceFile())));
            mProperties.load(is);
            return mProperties;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
