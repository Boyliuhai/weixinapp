package com.cug.mapper;

import com.cug.po.Tempprojectemployee;
import com.cug.po.TempprojectemployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempprojectemployeeMapper {
    int countByExample(TempprojectemployeeExample example);

    int deleteByExample(TempprojectemployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tempprojectemployee record);

    int insertSelective(Tempprojectemployee record);

    List<Tempprojectemployee> selectByExample(TempprojectemployeeExample example);

    Tempprojectemployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tempprojectemployee record, @Param("example") TempprojectemployeeExample example);

    int updateByExample(@Param("record") Tempprojectemployee record, @Param("example") TempprojectemployeeExample example);

    int updateByPrimaryKeySelective(Tempprojectemployee record);

    int updateByPrimaryKey(Tempprojectemployee record);
}