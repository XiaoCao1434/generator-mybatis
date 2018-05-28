package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderUuid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderUuid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}