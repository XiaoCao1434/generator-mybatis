package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.YlUserRole;

public interface YlUserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(YlUserRole record);

    int insertSelective(YlUserRole record);

    YlUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(YlUserRole record);

    int updateByPrimaryKey(YlUserRole record);
}