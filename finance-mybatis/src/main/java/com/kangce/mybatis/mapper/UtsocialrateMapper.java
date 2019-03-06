package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utsocialrate;
import com.kangce.mybatis.model.UtsocialrateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtsocialrateMapper {
    int countByExample(UtsocialrateExample example);

    int deleteByExample(UtsocialrateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utsocialrate record);

    int insertSelective(Utsocialrate record);

    List<Utsocialrate> selectByExample(UtsocialrateExample example);

    Utsocialrate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utsocialrate record, @Param("example") UtsocialrateExample example);

    int updateByExample(@Param("record") Utsocialrate record, @Param("example") UtsocialrateExample example);

    int updateByPrimaryKeySelective(Utsocialrate record);

    int updateByPrimaryKey(Utsocialrate record);
}