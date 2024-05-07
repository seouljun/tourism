package com.kj.tourism.base.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kj.tourism.business.tourismConst.TourismConst;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.Map;
import java.util.Set;

public class HttpUtil {
    private static final String QUESTION_MARK = "?";
    private static final String AMPERSAND = "&";
    private static final String EQUAL = "=";
    private static final String SLASH = "/";
    private static final String ERROR_MESSAGE = "parameter map is null";

    /**
     * MAP TO REQUEST PARAMETER
     */
    public static URI makeRequestParam(Map<String, ?> map, String method) {
        StringBuilder sb;
        URI uri = null;
        if (ObjectUtils.isNotEmpty(map)) {
            Set<? extends Map.Entry<String, ?>> entrySet = map.entrySet();

            sb = new StringBuilder();
            sb.append(TourismConst.URL);
            sb.append(method);
            sb.append(QUESTION_MARK);

            for (Map.Entry<String, ?> entry : entrySet) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if(ObjectUtils.isNotEmpty(value))
                {
                    sb.append(key).append(EQUAL).append(value.toString()).append(AMPERSAND);
                }
            }

            sb.deleteCharAt(sb.length() - 1);
            uri = URI.create(sb.toString());
        }
        else {
            throw new RuntimeException(ERROR_MESSAGE);
        }

        return uri;
    }

    /**
     * OBJECT TO REQUEST PARAMETER
     */
    public static <T> URI makeRequestParam(T t, String method) {
        if (ObjectUtils.isNotEmpty(t)) {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, ?> map = (Map<String, ?>) mapper.convertValue(t, Map.class);
            return makeRequestParam(map, method);
        }
        else {
            throw new RuntimeException(ERROR_MESSAGE);
        }
    }

    /**
     * GET BASE WEB CLIENT
     */
    public static WebClient getWebClient(String baseURL) {
        return WebClient.builder()
                .baseUrl(baseURL)
                .defaultHeaders(httpHeaders -> {
                    httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
                })
                .build();
    }

}
