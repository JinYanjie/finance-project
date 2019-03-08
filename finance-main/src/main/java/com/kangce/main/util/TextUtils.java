package com.kangce.main.util;

import org.springframework.lang.Nullable;

public class TextUtils {

    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }


    public static boolean isNotEmpty(@Nullable CharSequence str) {
        return str != null && str.length() != 0;
    }
}
