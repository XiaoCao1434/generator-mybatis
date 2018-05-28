package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.OrderReturns;

public interface OrderReturnsMapper {
    int deleteByPrimaryKey(String orderReturnsUuid);

    int insert(OrderReturns record);

    int insertSelective(OrderReturns record);

    OrderReturns selectByPrimaryKey(String orderReturnsUuid);

    int updateByPrimaryKeySelective(OrderReturns record);

    int updateByPrimaryKey(OrderReturns record);
}