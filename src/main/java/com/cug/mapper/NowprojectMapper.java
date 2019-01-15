package com.cug.mapper;

import com.cug.po.Nowproject;
import com.cug.po.NowprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NowprojectMapper {
    int countByExample(NowprojectExample example);

    int deleteByExample(NowprojectExample example);

    int deleteByPrimaryKey(String contractid);

    int insert(Nowproject record);

    int insertSelective(Nowproject record);

    List<Nowproject> selectByExample(NowprojectExample example);

    Nowproject selectByPrimaryKey(String contractid);

    int updateByExampleSelective(@Param("record") Nowproject record, @Param("example") NowprojectExample example);

    int updateByExample(@Param("record") Nowproject record, @Param("example") NowprojectExample example);

    int updateByPrimaryKeySelective(Nowproject record);

    int updateByPrimaryKey(Nowproject record);
}