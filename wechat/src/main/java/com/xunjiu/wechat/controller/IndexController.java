package com.xunjiu.wechat.controller;

import com.xunjiu.goods.model.Goods;
import com.xunjiu.goods.service.GoodsService;
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

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value= "/index", method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        Member member = memberService.findMember();

        Goods goods = new Goods();
        goods.setBrandId(1);
        goods.setCategoryId(1);
        goods.setName("红酒");
        goods.setUnit("瓶");
        goods.setOnsale(1);
        goods.setEnable(1);
        goodsService.add(goods);
        return "index";
    }
}
