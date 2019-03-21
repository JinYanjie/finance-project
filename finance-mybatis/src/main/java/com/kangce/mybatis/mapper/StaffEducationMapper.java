package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.StaffEducation;
import com.kangce.mybatis.model.StaffEducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffEducationMapper {
    int countByExample(StaffEducationExample example);

    int deleteByExample(StaffEducationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StaffEducation record);

    int insertSelective(StaffEducation record);

    List<StaffEducation> selectByExample(StaffEducationExample example);

    StaffEducation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StaffEducation record, @Param("example") StaffEducationExample example);

    int updateByExample(@Param("record") StaffEducation record, @Param("example") StaffEducationExample example);

    int updateByPrimaryKeySelective(StaffEducation record);

    int updateByPrimaryKey(StaffEducation record);
}