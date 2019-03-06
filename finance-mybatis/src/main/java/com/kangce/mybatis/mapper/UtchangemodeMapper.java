package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utchangemode;
import com.kangce.mybatis.model.UtchangemodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtchangemodeMapper {
    int countByExample(UtchangemodeExample example);

    int deleteByExample(UtchangemodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utchangemode record);

    int insertSelective(Utchangemode record);

    List<Utchangemode> selectByExample(UtchangemodeExample example);

    Utchangemode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utchangemode record, @Param("example") UtchangemodeExample example);

    int updateByExample(@Param("record") Utchangemode record, @Param("example") UtchangemodeExample example);

    int updateByPrimaryKeySelective(Utchangemode record);

    int updateByPrimaryKey(Utchangemode record);
}