package com.test.api.controller;

import ch.qos.logback.classic.Logger;
import com.test.api.dto.KakaoMapDto;
import com.test.api.service.KakaoMapDataRestore;
import com.test.api.service.OctoparseData;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiTestController {

    private Logger logger = (Logger) LoggerFactory.getLogger(ApiTestController.class);
    private final OctoparseData octoparseData;
    private final KakaoMapDataRestore kakaoMapDataRestore;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        return mav;
    }

    @GetMapping("/main")
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");

        return mav;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");

        return mav;
    }

    @GetMapping("/signUp")
    public ModelAndView signUp() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("signUp");

        return mav;
    }

    @GetMapping("/mainCourse")
    public ModelAndView mainCourse() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("mainCourse");

        return mav;
    }

    @GetMapping("/courseHomeReview")
    public ModelAndView courseHomeReview() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("courseHomeReview");

        return mav;
    }

    @GetMapping("/courseHomeReview2")
    public ModelAndView courseHomeReview2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("courseHomeReview2");

        return mav;
    }

    @GetMapping("/userPage")
    public ModelAndView userPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userPage");

        return mav;
    }

    @GetMapping("/randomPin")
    public ModelAndView randomPin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("randomPin");

        return mav;
    }

    @GetMapping("/calendar")
    public ModelAndView calendar() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("calendar");

        return mav;
    }

    @GetMapping("/myPin")
    public ModelAndView myPin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("myPin");

        return mav;
    }

    @GetMapping("/community")
    public ModelAndView community() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("community");

        return mav;
    }

    @GetMapping("/courseMake")
    public ModelAndView courseMake() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("courseMake");

        return mav;
    }

    @GetMapping("/courseMake2")
    public ModelAndView courseMake2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("courseMake2");

        return mav;
    }

    @GetMapping("/myCourse")
    public ModelAndView myCourse() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("myCourse");

        return mav;
    }

    @GetMapping("/myCourse2")
    public ModelAndView myCourse2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("myCourse2");

        return mav;
    }

    @GetMapping("/getData")
    public void getData() {
        logger.debug("getData 실행");
        octoparseData.getData();
    }

    @PostMapping("/kakaoData")
    @ResponseBody
    public void kakaoData(@RequestBody List<KakaoMapDto> data){
        logger.debug("ajax 받은 데이터 : " + data.toString());
        logger.debug("ajax 받은 데이터 개수 : " + data.size());
        kakaoMapDataRestore.restore(data);
//        kakaoMapDataRestore.testRestore(data.get(0));
    }
}
