package com.cug.mapper;

import com.cug.po.Providercompanytemp;
import com.cug.po.ProvidercompanytempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvidercompanytempMapper {
    int countByExample(ProvidercompanytempExample example);

    int deleteByExample(ProvidercompanytempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Providercompanytemp record);

    int insertSelective(Providercompanytemp record);

    List<Providercompanytemp> selectByExample(ProvidercompanytempExample example);

    Providercompanytemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Providercompanytemp record, @Param("example") ProvidercompanytempExample example);

    int updateByExample(@Param("record") Providercompanytemp record, @Param("example") ProvidercompanytempExample example);

    int updateByPrimaryKeySelective(Providercompanytemp record);

    int updateByPrimaryKey(Providercompanytemp record);
}