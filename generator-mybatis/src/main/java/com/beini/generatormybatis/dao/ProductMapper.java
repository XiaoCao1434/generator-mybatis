package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(String proUuid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String proUuid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}