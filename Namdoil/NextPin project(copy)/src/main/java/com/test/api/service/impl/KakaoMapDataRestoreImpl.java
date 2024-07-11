package com.test.api.service.impl;

import ch.qos.logback.classic.Logger;
import com.test.api.dto.KakaoMapDto;
import com.test.api.mapper.DataMapper;
import com.test.api.service.KakaoMapDataRestore;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class KakaoMapDataRestoreImpl implements KakaoMapDataRestore {
    private Logger logger = (Logger) LoggerFactory.getLogger(KakaoMapDataRestoreImpl.class);
    private final DataMapper dataMapper;

    @Override
    public void restore(List<KakaoMapDto> data) {
        for(KakaoMapDto kakaoMapDto : data) {

            dataMapper.kakaoTestInsert(kakaoMapDto);

        }
    }

    @Override
    public void testRestore(KakaoMapDto kakaoMapDto) {
        logger.debug(kakaoMapDto.toString());
        dataMapper.kakaoTestInsert(kakaoMapDto);
    }
}
