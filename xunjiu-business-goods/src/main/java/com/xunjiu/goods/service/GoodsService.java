package com.xunjiu.goods.service;

import com.xunjiu.goods.model.Goods;

import java.util.List;

/**
 * Created by wangqb on 2017/11/30.
 */
public interface GoodsService {

    /**
     * 获取在售的商品列表
     * @return
     */
    List<Goods> findOnsaleGoods();

    Goods findGoodsById();

    Goods add(Goods goods);
}
