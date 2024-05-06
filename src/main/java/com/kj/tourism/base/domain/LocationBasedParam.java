package com.kj.tourism.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LocationBasedParam extends TourismBaseDomain{
    private String mapX;
    private String mapY;
    // 제약을 설정해야할까 ?
    private Long radius;
}
