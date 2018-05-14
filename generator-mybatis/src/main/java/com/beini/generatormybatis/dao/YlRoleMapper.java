package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.YlRole;
import com.beini.generatormybatis.pojo.YlRoleKey;

public interface YlRoleMapper {
    int deleteByPrimaryKey(YlRoleKey key);

    int insert(YlRole record);

    int insertSelective(YlRole record);

    YlRole selectByPrimaryKey(YlRoleKey key);

    int updateByPrimaryKeySelective(YlRole record);

    int updateByPrimaryKey(YlRole record);
}