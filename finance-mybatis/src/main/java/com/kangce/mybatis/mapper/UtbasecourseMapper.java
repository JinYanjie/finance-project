package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utbasecourse;
import com.kangce.mybatis.model.UtbasecourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtbasecourseMapper {
    int countByExample(UtbasecourseExample example);

    int deleteByExample(UtbasecourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utbasecourse record);

    int insertSelective(Utbasecourse record);

    List<Utbasecourse> selectByExample(UtbasecourseExample example);

    Utbasecourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utbasecourse record, @Param("example") UtbasecourseExample example);

    int updateByExample(@Param("record") Utbasecourse record, @Param("example") UtbasecourseExample example);

    int updateByPrimaryKeySelective(Utbasecourse record);

    int updateByPrimaryKey(Utbasecourse record);
}