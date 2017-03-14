package com.walker.pattern.creational.prototype;

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

    private Hashtable<String, OfficialDocument> ht = new Hashtable<>();

    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {

    }

    public static PrototypeManager getInstance() {
        return pm;
    }

    public void addOfficialDocument(@NotNull String key, @NotNull OfficialDocument doc) {
        // TODO: 2017/3/14
    }

    public OfficialDocument getOfficialDocument(@NotNull String key) {
        if (ht == null || ht.size() < 1 || StringUtil.isBlank(key)) return null;
        return ht.get(key).clone();
    }

}
