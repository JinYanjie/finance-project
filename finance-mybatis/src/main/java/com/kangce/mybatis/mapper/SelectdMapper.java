package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Selectd;
import com.kangce.mybatis.model.SelectdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectdMapper {
    int countByExample(SelectdExample example);

    int deleteByExample(SelectdExample example);

    int insert(Selectd record);

    int insertSelective(Selectd record);

    List<Selectd> selectByExample(SelectdExample example);

    int updateByExampleSelective(@Param("record") Selectd record, @Param("example") SelectdExample example);

    int updateByExample(@Param("record") Selectd record, @Param("example") SelectdExample example);
}