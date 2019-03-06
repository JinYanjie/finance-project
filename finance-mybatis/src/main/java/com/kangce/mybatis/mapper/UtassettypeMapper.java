package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utassettype;
import com.kangce.mybatis.model.UtassettypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtassettypeMapper {
    int countByExample(UtassettypeExample example);

    int deleteByExample(UtassettypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utassettype record);

    int insertSelective(Utassettype record);

    List<Utassettype> selectByExample(UtassettypeExample example);

    Utassettype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utassettype record, @Param("example") UtassettypeExample example);

    int updateByExample(@Param("record") Utassettype record, @Param("example") UtassettypeExample example);

    int updateByPrimaryKeySelective(Utassettype record);

    int updateByPrimaryKey(Utassettype record);
}