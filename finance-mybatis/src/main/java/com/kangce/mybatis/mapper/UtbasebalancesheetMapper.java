package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utbasebalancesheet;
import com.kangce.mybatis.model.UtbasebalancesheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtbasebalancesheetMapper {
    int countByExample(UtbasebalancesheetExample example);

    int deleteByExample(UtbasebalancesheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utbasebalancesheet record);

    int insertSelective(Utbasebalancesheet record);

    List<Utbasebalancesheet> selectByExample(UtbasebalancesheetExample example);

    Utbasebalancesheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utbasebalancesheet record, @Param("example") UtbasebalancesheetExample example);

    int updateByExample(@Param("record") Utbasebalancesheet record, @Param("example") UtbasebalancesheetExample example);

    int updateByPrimaryKeySelective(Utbasebalancesheet record);

    int updateByPrimaryKey(Utbasebalancesheet record);
}