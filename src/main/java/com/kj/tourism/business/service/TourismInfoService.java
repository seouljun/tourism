package com.kj.tourism.business.service;

import com.kj.tourism.base.domain.LocationBased;
import com.kj.tourism.base.domain.ResponseDomain;
import com.kj.tourism.base.util.HttpUtil;
import com.kj.tourism.business.tourismConst.TourismConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.List;

@Service
@Slf4j
public class TourismInfoService {
    /**
     * 위치기반 관광정보 조회
     */
    public List<ResponseDomain> getLocationBasedList(LocationBased locationBasedParam) {
        WebClient webClient = HttpUtil.getWebClient(TourismConst.URL);
        URI requestParam = HttpUtil.makeRequestParam(locationBasedParam, "/locationBasedList1");
        List<ResponseDomain> block = webClient
                .get()
                .uri(requestParam)
                .retrieve()
                .bodyToFlux(ResponseDomain.class)
                .collectList()
                .block();
        return block;
    }

//    public static void main(String[] args) {
//        LocationBased locationBased = new LocationBased();
//        locationBased.setMobileOS("ETC");
//        locationBased.setMobileApp("TOUR");
//        locationBased.set_type("json");
//        locationBased.setMapX("127");
//        locationBased.setMapY("37");
//        locationBased.setRadius(20000L);
//        locationBased.setServiceKey("d7utwF4c9FJqYh92r4fudpd8ZzR5Yxr%2BUaFW8sRsGpM3XbomM1k6kh7ldUp0d9Lb0F4EUhhdaxm9b%2BVoGii6VQ%3D%3D");
//
//        List<ResponseDomain> locationBasedList = getLocationBasedList(locationBased);
//        log.info(locationBasedList.toString());
//    }
}
