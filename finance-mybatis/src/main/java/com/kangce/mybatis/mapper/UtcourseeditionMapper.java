package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utcourseedition;
import com.kangce.mybatis.model.UtcourseeditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtcourseeditionMapper {
    int countByExample(UtcourseeditionExample example);

    int deleteByExample(UtcourseeditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utcourseedition record);

    int insertSelective(Utcourseedition record);

    List<Utcourseedition> selectByExample(UtcourseeditionExample example);

    Utcourseedition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utcourseedition record, @Param("example") UtcourseeditionExample example);

    int updateByExample(@Param("record") Utcourseedition record, @Param("example") UtcourseeditionExample example);

    int updateByPrimaryKeySelective(Utcourseedition record);

    int updateByPrimaryKey(Utcourseedition record);
}