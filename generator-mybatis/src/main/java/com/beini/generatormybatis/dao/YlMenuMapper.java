package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.YlMenu;

public interface YlMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(YlMenu record);

    int insertSelective(YlMenu record);

    YlMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(YlMenu record);

    int updateByPrimaryKey(YlMenu record);
}