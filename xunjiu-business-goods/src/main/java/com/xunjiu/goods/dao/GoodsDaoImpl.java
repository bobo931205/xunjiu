package com.xunjiu.goods.dao;

import com.xunjiu.goods.mapper.GoodsMapper;
import com.xunjiu.goods.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangqb on 2017/11/30.
 */
@Service
public class GoodsDaoImpl implements GoodsDao{

    @Autowired
    private GoodsMapper goodsMapper;

    public Goods insert(Goods goods) {
        int id = goodsMapper.insert(goods);
        goods.setId(id);
        return goods;
    }

    public Goods findGoodsById(int id) {
        return null;
    }

    public List<Goods> findGoods() {
        Goods goods = new Goods();
        return goodsMapper.select(goods);
    }

}
