package com.cug.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cug.po.Usertoken;
import com.cug.po.UsertokenExample;

public interface UsertokenMapper {
    int countByExample(UsertokenExample example);

    int deleteByExample(UsertokenExample example);

    int deleteByPrimaryKey(String digitalid);

    int insert(Usertoken record);

    int insertSelective(Usertoken record);

    List<Usertoken> selectByExample(UsertokenExample example);

    Usertoken selectByPrimaryKey(String digitalid);

    int updateByExampleSelective(@Param("record") Usertoken record, @Param("example") UsertokenExample example);

    int updateByExample(@Param("record") Usertoken record, @Param("example") UsertokenExample example);

    int updateByPrimaryKeySelective(Usertoken record);

    int updateByPrimaryKey(Usertoken record);
}