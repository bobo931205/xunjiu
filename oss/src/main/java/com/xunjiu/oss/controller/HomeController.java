package com.xunjiu.oss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangqb on 2018/4/28.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "oss is run";
    }
}
