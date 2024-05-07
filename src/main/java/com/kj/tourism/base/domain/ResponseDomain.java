package com.kj.tourism.base.domain;

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
        List<Item> item;
    }

    @Getter
    @Setter
    public static class Item{
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
    }
}
