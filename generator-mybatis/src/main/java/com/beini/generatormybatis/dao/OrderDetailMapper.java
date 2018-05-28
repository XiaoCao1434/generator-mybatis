package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(String orderDetailUuid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(String orderDetailUuid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}