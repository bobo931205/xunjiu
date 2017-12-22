package com.xunjiu.wechat.controller;

import com.xunjiu.goods.model.Goods;
import com.xunjiu.goods.service.GoodsService;
import com.xunjiu.member.model.Member;
import com.xunjiu.member.service.MemberService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wangqb on 2017/10/27.
 */
@Controller
public class IndexController {

    private static final Logger LOGGER = Logger.getLogger(IndexController.class);

    @Autowired
    private MemberService memberService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value= "/index", method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        Member member = memberService.findMember();
        LOGGER.info("logger init");
        List<Goods> goodsList = goodsService.findOnsaleGoods();
        if (!CollectionUtils.isEmpty(goodsList)){
            for (Goods goods : goodsList){
                System.out.println(goods.getName());
            }
        }
        return "index";
    }
}
