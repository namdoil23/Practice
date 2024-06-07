package com.bit.springbootdemo.service;

import com.bit.springbootdemo.dto.MemberDto;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    void join(MemberDto memberDto);

    int memberCnt(MemberDto memberDto);

    Optional<MemberDto> login(MemberDto memberDto);

    List<MemberDto> memberList();
}
