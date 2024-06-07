package com.bit.springbootdemo.service.impl;

import com.bit.springbootdemo.dto.MemberDto;
import com.bit.springbootdemo.mapper.MemberMapper;
import com.bit.springbootdemo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Controller, @RestController, @Service: 객체를 생성해주는 어노테이션
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;

    @Override
    public void join(MemberDto memberDto) {
        // 비즈니스 로직 처리
        // 비밀번호 암호화 로직등을 처리한다.
        memberMapper.join(memberDto);
    }

    @Override
    public int memberCnt(MemberDto memberDto) {
        int memberCnt = memberMapper.memberCnt(memberDto);
        return memberCnt;
    }

    @Override
    public Optional<MemberDto> login(MemberDto memberDto) {
        MemberDto loginMember = memberMapper.login(memberDto);

        if (loginMember == null) {
        return Optional.empty();
        }

        return Optional.of(loginMember);
    }

    @Override
    public List<MemberDto> memberList() {
        return memberMapper.memberList();
    }
}
