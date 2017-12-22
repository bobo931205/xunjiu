package com.xunjiu.goods.dao;


import com.xunjiu.goods.model.Goods;

import java.util.List;

/**
 * Created by wangqb on 2017/11/30.
 */
public interface GoodsDao {

    Goods insert(Goods goods);

    Goods findGoodsById(int id);

    List<Goods> findGoods();
}
