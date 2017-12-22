package com.xunjiu.goods.mapper;

import com.xunjiu.goods.model.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wangqb on 2017/12/1.
 */
public interface GoodsMapper {

    int insert(@Param("pojo") Goods goods);

    void insertList(List<Goods> goodsList);

    int update(Goods goods);

    List<Goods> select(@Param("pojo") Goods goods);

    int delete(Goods goods);
}
