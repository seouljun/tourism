package com.kj.tourism.base.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class ResponseDomain {
    private Response response;

    @Getter
    @Setter
    public static class Response{
        private Header header;
        private Body body;
    }

    @Getter
    @Setter
    public static class Header{
        private String resultCode;
        private String resultMsg;
    }

    @Getter
    @Setter
    public static class Body{
        private Items items;
        private Integer numOfRows;
        private Integer pageNo;
        private Integer totalCount;
    }

    @Getter
    @Setter
    public static class Items{
        @JsonProperty("item")
        List<LocationBasedResponse> locationBasedResponse;
    }

    @Getter
    @Setter
    public static class LocationBasedResponse {
        @JsonProperty("contentid")
        private String contentId;
        private String addr2;
        @JsonProperty("firstimage2")
        private String firstImage2;
        private String cpyrhtDivCd;
        @JsonProperty("addr1")
        private String addr;
        @JsonProperty("contenttypeid")
        private String contentTypeId;
        @JsonProperty("createdtime")
        private String createdTime;
        private String dist;
        @JsonProperty("firstimage")
        private String firstImage;
        @JsonProperty("areacode")
        private String areaCode;
        @JsonProperty("booktour")
        private String bookTour;
        @JsonProperty("mapx")
        private String mapX;
        @JsonProperty("mapy")
        private String mapY;
        @JsonProperty("mlevel")
        private String mLevel;
        @JsonProperty("sigungucode")
        private String sigunguCode;
        private String tel;
        private String title;
        private String cat1;
        private String cat2;
        private String cat3;
    }
}
