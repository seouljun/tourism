package com.kj.tourism.base.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Map;
import java.util.Set;

public class HttpUtil {
    private static final String QUESTION_MARK = "?";
    private static final String AMPERSAND = "&";
    private static final String EQUAL = "=";
    private static final String ERROR_MESSAGE = "parameter map is null";

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
            throw new RuntimeException(ERROR_MESSAGE);
        }

        return sb.toString();
    }

    public static <T> String makeRequestParam(T t) {
        if (ObjectUtils.isNotEmpty(t)) {
            ObjectMapper mapper = new ObjectMapper();
            Map map = mapper.convertValue(t, Map.class);
            return makeRequestParam(map);
        }
        else {
            throw new RuntimeException(ERROR_MESSAGE);
        }
    }
}
