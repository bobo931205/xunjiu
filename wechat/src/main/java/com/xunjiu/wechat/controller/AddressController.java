package com.xunjiu.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangqb on 2017/10/27.
 */
@Controller
public class AddressController {

    @RequestMapping(value= "/address", method = RequestMethod.GET)
    public String home(HttpServletRequest request){

        return "address";
    }
}
