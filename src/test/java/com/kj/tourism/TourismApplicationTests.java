package com.kj.tourism;

import com.kj.tourism.base.domain.LocationBased;
import com.kj.tourism.base.domain.ResponseDomain;
import com.kj.tourism.business.service.TourismInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TourismApplicationTests {
    @Autowired
    TourismInfoService tourismInfoService;

    @Test
    void tset() {
        LocationBased locationBased = new LocationBased();
        locationBased.setMobileOS("ETC");
        locationBased.setMobileApp("TOUR");
        locationBased.set_type("json");
        locationBased.setMapX("127");
        locationBased.setMapY("37");
        locationBased.setRadius(20000L);
        locationBased.setServiceKey("d7utwF4c9FJqYh92r4fudpd8ZzR5Yxr%2BUaFW8sRsGpM3XbomM1k6kh7ldUp0d9Lb0F4EUhhdaxm9b%2BVoGii6VQ%3D%3D");

        List<ResponseDomain> locationBasedList = tourismInfoService.getLocationBasedList(locationBased);
        assert locationBasedList != null;
    }

}
