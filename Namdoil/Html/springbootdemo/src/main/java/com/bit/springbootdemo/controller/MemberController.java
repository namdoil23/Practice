package com.bit.springbootdemo.controller;

import com.bit.springbootdemo.dto.MemberDto;
import com.bit.springbootdemo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

// @Controller, @RestController: 이 클래스를 http 요청을 받아서 처리할 수 있는 클래스로 만들어준다.
@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/login")
    public ModelAndView login(MemberDto memberDto) {
        ModelAndView mav = new ModelAndView();

        int memberCnt = memberService.memberCnt(memberDto);

        if(memberCnt == 0){
            mav.setViewName("index");
            mav.addObject("errorMsg", "id not exist");

            return mav;
        }

        Optional<MemberDto> loginMember = memberService.login(memberDto);

        if(loginMember.isEmpty()){
            mav.setViewName("index");
            mav.addObject("errorMsg", "wrong password");
            return mav;
        }

        mav.setViewName("list");
        mav.addObject("loginMember", loginMember.get());

        List<MemberDto> memberDtoList = memberService.memberList();
        mav.addObject("memberList", memberDtoList);
        return mav;

    }

    @GetMapping("/join")
    public ModelAndView join() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("join");

        return mav;
    }

    @PostMapping("/join")
    // @ModelAttribute로 지정된 객체는 생성자를 자동으로 호출하여 객체를 하나 생성한다.
    // 객체의 인스턴스변수와 동일한 키값으로 넘어오는 데이터에 대해서 자동으로 셋터메소드를 동작시켜준다.
    // <input name="username">
    // setUsername(넘어온데이터) 자동실행
    // @ModelAttribute는 생략가능
    public ModelAndView join(MemberDto memberDto) {
        ModelAndView mav = new ModelAndView();

        System.out.println(memberDto.getUsername());
        System.out.println(memberDto.getPassword());

        // MVC 패턴
        // ModelViewController
        // Model => DB와 연동되는 Service, DAO나 Mapper
        // View => 화면단(html, jsp)
        // Cotroller => 화면에서 데이터를 받거나 DB에서 뽑아온 데이터를 화면으로 넘겨주는 클래스(Controller)
        memberService.join(memberDto);

        mav.setViewName("index");
        return mav;
    }
}
