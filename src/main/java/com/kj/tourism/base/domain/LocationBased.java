package com.kj.tourism.base.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LocationBased extends TourismBaseDomain{
    //----------------------------------
    // RESPONSE PARAMETER
    //----------------------------------

    //----------------------------------
    // REQUEST PARAMETER
    //----------------------------------
    //@JsonIgnore
    private String mapX;
    private String mapY;
    private Long radius;
    private String contentTypeId;
    @JsonProperty("modifiedtime")
    private String modifiedTime;
}
