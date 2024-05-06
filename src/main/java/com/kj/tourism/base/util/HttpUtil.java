package com.kj.tourism.base.util;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Map;
import java.util.Set;

public class HttpUtil {
    private static final String QUESTION_MARK = "?";
    private static final String AMPERSAND = "&";
    private static final String EQUAL = "=";

    public static String makeRequestParam(Map<String, String> map) {
        StringBuilder sb;

        if (ObjectUtils.isNotEmpty(map)) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();

            sb = new StringBuilder();
            sb.append(QUESTION_MARK);

            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append(key).append(EQUAL).append(value).append(AMPERSAND);
            }

            sb.deleteCharAt(sb.length() - 1);

        }
        else {
            throw new RuntimeException("parameter map is null");
        }

        return sb.toString();
    }
}
