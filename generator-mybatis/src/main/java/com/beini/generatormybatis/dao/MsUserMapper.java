package com.beini.generatormybatis.dao;

import com.beini.generatormybatis.pojo.MsUser;

public interface MsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsUser record);

    int insertSelective(MsUser record);

    MsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsUser record);

    int updateByPrimaryKey(MsUser record);
}