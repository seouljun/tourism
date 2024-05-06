package com.kj.tourism.base.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

@Getter
@Setter
public class TourismBaseDomain {
    @ReadOnlyProperty
    private int numOfRows;
    @ReadOnlyProperty
    private int pageNo;
    @ReadOnlyProperty
    private String MobileOs;
    @ReadOnlyProperty
    private String MobileApp;
    @ReadOnlyProperty
    private String _type;
    @ReadOnlyProperty
    private String listYN;
    @ReadOnlyProperty
    private String arrange;
    @ReadOnlyProperty
    private String serviceKey;
}
