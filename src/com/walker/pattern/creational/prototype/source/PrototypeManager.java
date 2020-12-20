package com.walker.pattern.creational.prototype.source;

import com.sun.istack.internal.NotNull;
import com.walker.utils.tools.StringUtil;

import java.util.Hashtable;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:05.
 */
public class PrototypeManager {

    /**
     * Table 容器装载对象
     */
    private Hashtable<String, OfficialDocument> ht = new Hashtable<>();

    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {

    }

    public static PrototypeManager getInstance() {
        return pm;
    }

    /**
     * 添加新的文档类型
     * @param key
     * @param doc
     */
    public void addOfficialDocument(@NotNull String key, @NotNull OfficialDocument doc) {
        ht.put(key, doc);
    }

    /**
     * 从缓存中获取文档类型对象
     * @param key
     * @return
     */
    public OfficialDocument getOfficialDocument(@NotNull String key) {
        if (ht == null || ht.size() < 1 || StringUtil.isBlank(key)) return null;
        return ht.get(key).clone();
    }

}
