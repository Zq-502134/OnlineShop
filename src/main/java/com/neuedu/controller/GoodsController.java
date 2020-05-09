package com.neuedu.controller;

import com.neuedu.common.RespBean;
import com.neuedu.pojo.Goods;
import com.neuedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping(value = "/goodsList",method = RequestMethod.POST)
    public Map<String,Object> getGoodsListByConditionPages(@RequestBody Map<String,Object> goodsMap){
        int count = goodsService.getCount(goodsMap);
        List<Goods> goodsList = goodsService.getGoodsListByContions(goodsMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",goodsList);
        return returnMap;
    }

    @RequestMapping(value = "/saveGoods",method =  RequestMethod.POST)
    public RespBean saveGoods(@RequestBody Goods goods){
        int result = 0;

        if (goods.getId() ==null){
            goods.setCreatetime(new Date());
            result = goodsService.saveGoods(goods);
        }else {
            result = goodsService.updateGoods(goods);
        }
        if (result>0){
            return new RespBean("success","成功");
        }
        return new RespBean("error","失败");
    }
    @RequestMapping(value = "/getGoodsByid",method = RequestMethod.GET)
    public Goods getGoods(@RequestParam Integer id){
        return goodsService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateState",method = RequestMethod.POST)
    public RespBean updateState(@RequestBody Map<String,Object> stateMap){
        int result = 0;
        result  =goodsService.updateState(stateMap);
        if (result>0){
            return new RespBean("success","success");
        }
        return  new RespBean("error","failure");
    }
}
