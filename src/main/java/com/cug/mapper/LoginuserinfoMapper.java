package com.cug.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cug.po.Loginuserinfo;
import com.cug.po.LoginuserinfoExample;

public interface LoginuserinfoMapper {
    int countByExample(LoginuserinfoExample example);

    int deleteByExample(LoginuserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Loginuserinfo record);

    int insertSelective(Loginuserinfo record);

    List<Loginuserinfo> selectByExample(LoginuserinfoExample example);

    Loginuserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByExample(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByPrimaryKeySelective(Loginuserinfo record);

    int updateByPrimaryKey(Loginuserinfo record);
}