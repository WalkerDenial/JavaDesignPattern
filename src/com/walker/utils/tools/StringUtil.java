package com.walker.utils.tools;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 16:27.
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.equals("");
    }

    public static boolean isBlank(String str) {
        return isEmpty(str) || isEmpty(str.trim());
    }

}
