package com.kj.tourism.base.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TourismBaseDomain {
    //@JsonIgnore
    private Integer numOfRows;
    //@JsonIgnore
    private Integer pageNo;
    //@JsonIgnore
    private Integer totalCount;
    //@JsonIgnore
    private String MobileOS;
    //@JsonIgnore
    private String MobileApp;
    //@JsonIgnore
    private String _type;
    //@JsonIgnore
    private String listYN;
    //@JsonIgnore
    private String arrange;
    //@JsonIgnore
    private String serviceKey;
}
