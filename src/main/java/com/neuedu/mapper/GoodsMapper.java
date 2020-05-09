package com.neuedu.mapper;

import com.neuedu.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    int updateState(Map<String,Object> stateMap);
//    条件查询
    List<Goods> getGoodsListByContions(Map<String,Object> goodsMap);
//      获取总的记录数
    int getCount(Map<String,Object> goodsMap);
}