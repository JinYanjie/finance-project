package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.FixedAssets;
import com.kangce.mybatis.model.FixedAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedAssetsMapper {
    int countByExample(FixedAssetsExample example);

    int deleteByExample(FixedAssetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FixedAssets record);

    int insertSelective(FixedAssets record);

    List<FixedAssets> selectByExample(FixedAssetsExample example);

    FixedAssets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FixedAssets record, @Param("example") FixedAssetsExample example);

    int updateByExample(@Param("record") FixedAssets record, @Param("example") FixedAssetsExample example);

    int updateByPrimaryKeySelective(FixedAssets record);

    int updateByPrimaryKey(FixedAssets record);
}