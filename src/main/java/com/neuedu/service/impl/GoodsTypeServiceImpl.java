package com.neuedu.service.impl;

import com.neuedu.mapper.GoodsTypeMapper;
import com.neuedu.pojo.GoodsType;
import com.neuedu.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
   @Autowired
   private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> getGoodsTypeList() {
        return goodsTypeMapper.getGoodsTypeList();
    }
}
