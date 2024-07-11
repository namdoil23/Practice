package com.test.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class KakaoMapDto {
    String address_name;
    String category_group;
    String category_group_name;
    String category_name;
    double distance;
    long id;
    String phone;
    String place_name;
    String place_url;
    String road_address_name;
    double x;
    double y;
}
