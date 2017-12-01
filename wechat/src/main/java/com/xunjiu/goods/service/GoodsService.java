package com.xunjiu.goods.service;

import com.xunjiu.goods.model.Goods;

import java.util.List;

/**
 * Created by wangqb on 2017/11/30.
 */
public interface GoodsService {

    /**
     * ???????????
     * @return
     */
    List<Goods> findOnsaleGoods();

    Goods add(Goods goods);
}
