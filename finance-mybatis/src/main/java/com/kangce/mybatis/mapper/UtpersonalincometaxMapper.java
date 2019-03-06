package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utpersonalincometax;
import com.kangce.mybatis.model.UtpersonalincometaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtpersonalincometaxMapper {
    int countByExample(UtpersonalincometaxExample example);

    int deleteByExample(UtpersonalincometaxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utpersonalincometax record);

    int insertSelective(Utpersonalincometax record);

    List<Utpersonalincometax> selectByExample(UtpersonalincometaxExample example);

    Utpersonalincometax selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utpersonalincometax record, @Param("example") UtpersonalincometaxExample example);

    int updateByExample(@Param("record") Utpersonalincometax record, @Param("example") UtpersonalincometaxExample example);

    int updateByPrimaryKeySelective(Utpersonalincometax record);

    int updateByPrimaryKey(Utpersonalincometax record);
}