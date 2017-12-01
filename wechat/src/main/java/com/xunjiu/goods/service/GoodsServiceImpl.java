package com.xunjiu.goods.service;

import com.xunjiu.goods.dao.GoodsDao;
import com.xunjiu.goods.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wangqb on 2017/11/30.
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> findOnsaleGoods() {
        return null;
    }

    public Goods add(Goods goods) {
        return goodsDao.insert(goods);
    }
}
