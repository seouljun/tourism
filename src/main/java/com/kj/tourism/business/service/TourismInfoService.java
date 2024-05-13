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
}
