package com.xunjiu.goods.mapper;

import com.xunjiu.goods.model.GoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCategoryMapper {

    int insert(@Param("pojo") GoodsCategory pojo);

    int insertList(@Param("pojos") List<GoodsCategory> pojo);

    List<GoodsCategory> select(@Param("pojo") GoodsCategory pojo);

    int update(@Param("pojo") GoodsCategory pojo);

    int delete(@Param("pojo") GoodsCategory pojo);

}
