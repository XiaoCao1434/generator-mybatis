package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.YlUser;

public interface YlUserMapper {
    int deleteByPrimaryKey(String userCode);

    int insert(YlUser record);

    int insertSelective(YlUser record);

    YlUser selectByPrimaryKey(String userCode);

    int updateByPrimaryKeySelective(YlUser record);

    int updateByPrimaryKey(YlUser record);
}