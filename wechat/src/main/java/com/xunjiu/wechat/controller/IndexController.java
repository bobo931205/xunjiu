package com.xunjiu.wechat.controller;

import com.xunjiu.member.model.Member;
import com.xunjiu.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangqb on 2017/10/27.
 */
@Controller
public class IndexController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value= "/index", method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        Member member = memberService.findMember();
        System.out.println(member.getNickName() + " 登录成功");
        return "index";
    }
}
