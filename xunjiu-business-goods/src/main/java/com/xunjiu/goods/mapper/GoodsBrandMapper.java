package com.xunjiu.goods.mapper;

import com.xunjiu.goods.model.GoodsBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsBrandMapper {

    int insert(@Param("pojo") GoodsBrand pojo);

    int insertList(@Param("pojos") List<GoodsBrand> pojo);

    List<GoodsBrand> select(@Param("pojo") GoodsBrand pojo);

    int update(@Param("pojo") GoodsBrand pojo);

    int delete(@Param("pojo") GoodsBrand pojo);
}
