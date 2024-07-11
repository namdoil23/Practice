package com.test.api.service;

import com.test.api.dto.KakaoMapDto;

import java.util.List;
import java.util.Map;

public interface KakaoMapDataRestore {
    public void restore(List<KakaoMapDto> data);

    public void testRestore(KakaoMapDto kakaoMapDto);
}
