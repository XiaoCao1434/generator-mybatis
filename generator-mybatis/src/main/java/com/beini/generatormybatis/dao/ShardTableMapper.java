package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.ShardTable;

public interface ShardTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShardTable record);

    int insertSelective(ShardTable record);

    ShardTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShardTable record);

    int updateByPrimaryKey(ShardTable record);
}