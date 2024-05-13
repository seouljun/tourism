package com.kj.tourism.base.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TourismBaseDomain {
    private Integer numOfRows;
    private Integer pageNo;
    private Integer totalCount;
    @JsonProperty("MobileOS")
    private String mobileOS;
    @JsonProperty("MobileApp")
    private String mobileApp;
    @JsonProperty("_type")
    private String type;
    private String listYN;
    private String arrange;
    private String serviceKey;
}
