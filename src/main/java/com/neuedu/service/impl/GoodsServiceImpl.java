package com.neuedu.service.impl;

import com.neuedu.mapper.GoodsMapper;
import com.neuedu.pojo.Goods;
import com.neuedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsListByContions(Map<String, Object> goodsMap) {
        return goodsMapper.getGoodsListByContions(goodsMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsMap) {
        return goodsMapper.getCount(goodsMap);
    }

    @Override
    public int saveGoods(Goods goods) {
       return goodsMapper.insertSelective(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int updateState(Map<String, Object> stateMap) {
        return goodsMapper.updateState(stateMap);
    }

    @Override
    public Goods selectByPrimaryKey(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }
}
