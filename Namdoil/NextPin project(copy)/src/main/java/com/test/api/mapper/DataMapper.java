package com.test.api.mapper;

import com.test.api.dto.KakaoMapDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface DataMapper {
    void kakaoInsert(List<KakaoMapDto> data);

    void kakaoTestInsert(KakaoMapDto kakaoMapDto);
}
