package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.OrderLogistics;

public interface OrderLogisticsMapper {
    int deleteByPrimaryKey(String orderLogUuid);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    OrderLogistics selectByPrimaryKey(String orderLogUuid);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}