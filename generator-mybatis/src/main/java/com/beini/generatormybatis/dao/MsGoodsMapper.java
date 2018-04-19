package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.MsGoods;

public interface MsGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MsGoods record);

    int insertSelective(MsGoods record);

    MsGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MsGoods record);

    int updateByPrimaryKeyWithBLOBs(MsGoods record);

    int updateByPrimaryKey(MsGoods record);
}