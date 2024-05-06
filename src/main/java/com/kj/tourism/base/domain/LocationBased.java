package com.kj.tourism.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.ReadOnlyProperty;

@EqualsAndHashCode(callSuper = true)
@Data
public class LocationBased extends TourismBaseDomain{
    //----------------------------------
    // RESPONSE PARAMETER
    //----------------------------------
    private String contentid;
    private String addr2;
    private String firstimage2;
    private String cpyrhtDivCd;
    private String addr1;
    private String contenttypeid;
    private String createdtime;
    private String dist;
    private String firstimage;
    private String areacode;
    private String booktour;
    private String mapx;
    private String mapy;
    private String mlevel;
    private String sigungucode;
    private String tel;
    private String title;
    private String cat1;
    private String cat2;
    private String cat3;


    //----------------------------------
    // REQUEST PARAMETER
    //----------------------------------
    @ReadOnlyProperty
    private String mapX;
    @ReadOnlyProperty
    private String mapY;
    @ReadOnlyProperty
    private Long radius;
    @ReadOnlyProperty
    private String contentTypeId;
    @ReadOnlyProperty
    private String modifiedtime;
}
