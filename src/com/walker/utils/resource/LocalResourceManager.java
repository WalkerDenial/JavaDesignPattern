package com.walker.utils.resource;

import com.sun.istack.internal.NotNull;
import com.walker.constants.ConfigConstants;
import com.walker.utils.resource.interfaces.ILocalResource;
import com.walker.utils.resource.interfaces.impl.PropertyLocalResource;
import com.walker.utils.tools.StringUtil;

import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 17:05.
 */
public class LocalResourceManager {

    private ILocalResource mLocalResource;

    private static volatile LocalResourceManager instance;

    public static LocalResourceManager getInstance() {
        if (instance == null) {
            synchronized (LocalResourceManager.class) {
                if (instance == null) {
                    instance = new LocalResourceManager();
                }
            }
        }
        return instance;
    }

    private LocalResourceManager() {
        initConfig();
    }

    private void initConfig() {
        try {
            ILocalResource mProp = new PropertyLocalResource();
            mProp.setSourceFile(ConfigConstants.DEFAULT_BASE_CONFIG_FILE_URL);
            String className = mProp.getValueByKey("readLocalResourceClass");
            String fileUrl = mProp.getValueByKey("readLocalResourceFile");
            System.out.println(mProp.getValue().toString());

            if (StringUtil.isBlank(className) || StringUtil.isBlank(fileUrl)) {
                System.out.println("Properties config can't be null, please check again!");
                return;
            }
            Class cla = Class.forName(className);
            Object obj = cla.newInstance();
            setLocalResource((ILocalResource) obj, fileUrl);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Properties config error, please check again!");
        }
    }

    public ILocalResource getLocalResource() {
        return mLocalResource;
    }

    private void setLocalResource(ILocalResource mLocalResource, String fileUrl) {
        mLocalResource.setSourceFile(fileUrl);
        this.mLocalResource = mLocalResource;
    }

    public String getValueByKey(@NotNull String key) {
        return checkStatus() ? getLocalResource().getValueByKey(key) : null;
    }

    public Map<String, String> getValue() {
        return checkStatus() ? getLocalResource().getValue() : null;
    }

    private boolean checkStatus() {
        if (getLocalResource() == null) {
            System.out.println("Init failed!");
            return false;
        }
        return true;
    }

}