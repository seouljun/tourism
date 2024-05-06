package com.kj.tourism.business.service;

import com.kj.tourism.base.domain.LocationBased;
import com.kj.tourism.base.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TourismInfoService {
    /**
     * 위치기반 관광정보 조회
     */
    public List<LocationBased> getLocationBasedList(LocationBased locationBasedParam) {
        HttpUtil.getWebClient("glglglggl");
        String requestParam = HttpUtil.makeRequestParam(locationBasedParam);
        return null;
    }
}
