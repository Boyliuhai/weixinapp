package com.cug.mapper;

import com.cug.po.Projectprovidertemp;
import com.cug.po.ProjectprovidertempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectprovidertempMapper {
    int countByExample(ProjectprovidertempExample example);

    int deleteByExample(ProjectprovidertempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projectprovidertemp record);

    int insertSelective(Projectprovidertemp record);

    List<Projectprovidertemp> selectByExample(ProjectprovidertempExample example);

    Projectprovidertemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projectprovidertemp record, @Param("example") ProjectprovidertempExample example);

    int updateByExample(@Param("record") Projectprovidertemp record, @Param("example") ProjectprovidertempExample example);

    int updateByPrimaryKeySelective(Projectprovidertemp record);

    int updateByPrimaryKey(Projectprovidertemp record);
}