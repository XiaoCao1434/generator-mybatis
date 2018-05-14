package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.YlRoleMenu;

public interface YlRoleMenuMapper {
    int deleteByPrimaryKey(Integer roleMenuId);

    int insert(YlRoleMenu record);

    int insertSelective(YlRoleMenu record);

    YlRoleMenu selectByPrimaryKey(Integer roleMenuId);

    int updateByPrimaryKeySelective(YlRoleMenu record);

    int updateByPrimaryKey(YlRoleMenu record);
}