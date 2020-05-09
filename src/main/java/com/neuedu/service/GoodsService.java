package com.neuedu.service;

import com.neuedu.pojo.Goods;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<Goods> getGoodsListByContions(Map<String,Object> goodsMap);

//    List<Goods> getGoodsListByContions(Map<String,Object> goodsMap);

    int getCount(Map<String,Object> goodsMap);

    int saveGoods(Goods goods);

    int updateGoods(Goods goods);

    int updateState(Map<String,Object> stateMap);

    Goods selectByPrimaryKey(Integer id);
}
