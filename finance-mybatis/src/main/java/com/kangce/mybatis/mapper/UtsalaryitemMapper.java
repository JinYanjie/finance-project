package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utsalaryitem;
import com.kangce.mybatis.model.UtsalaryitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtsalaryitemMapper {
    int countByExample(UtsalaryitemExample example);

    int deleteByExample(UtsalaryitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utsalaryitem record);

    int insertSelective(Utsalaryitem record);

    List<Utsalaryitem> selectByExample(UtsalaryitemExample example);

    Utsalaryitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utsalaryitem record, @Param("example") UtsalaryitemExample example);

    int updateByExample(@Param("record") Utsalaryitem record, @Param("example") UtsalaryitemExample example);

    int updateByPrimaryKeySelective(Utsalaryitem record);

    int updateByPrimaryKey(Utsalaryitem record);
}