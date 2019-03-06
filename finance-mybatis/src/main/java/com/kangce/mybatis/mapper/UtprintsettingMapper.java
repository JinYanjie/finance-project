package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utprintsetting;
import com.kangce.mybatis.model.UtprintsettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtprintsettingMapper {
    int countByExample(UtprintsettingExample example);

    int deleteByExample(UtprintsettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utprintsetting record);

    int insertSelective(Utprintsetting record);

    List<Utprintsetting> selectByExample(UtprintsettingExample example);

    Utprintsetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utprintsetting record, @Param("example") UtprintsettingExample example);

    int updateByExample(@Param("record") Utprintsetting record, @Param("example") UtprintsettingExample example);

    int updateByPrimaryKeySelective(Utprintsetting record);

    int updateByPrimaryKey(Utprintsetting record);
}