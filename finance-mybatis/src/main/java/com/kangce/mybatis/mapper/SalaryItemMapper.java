package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.SalaryItem;
import com.kangce.mybatis.model.SalaryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryItemMapper {
    int countByExample(SalaryItemExample example);

    int deleteByExample(SalaryItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalaryItem record);

    int insertSelective(SalaryItem record);

    List<SalaryItem> selectByExample(SalaryItemExample example);

    SalaryItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalaryItem record, @Param("example") SalaryItemExample example);

    int updateByExample(@Param("record") SalaryItem record, @Param("example") SalaryItemExample example);

    int updateByPrimaryKeySelective(SalaryItem record);

    int updateByPrimaryKey(SalaryItem record);
}