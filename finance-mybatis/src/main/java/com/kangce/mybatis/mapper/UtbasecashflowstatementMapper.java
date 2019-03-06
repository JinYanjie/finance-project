package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utbasecashflowstatement;
import com.kangce.mybatis.model.UtbasecashflowstatementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtbasecashflowstatementMapper {
    int countByExample(UtbasecashflowstatementExample example);

    int deleteByExample(UtbasecashflowstatementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utbasecashflowstatement record);

    int insertSelective(Utbasecashflowstatement record);

    List<Utbasecashflowstatement> selectByExample(UtbasecashflowstatementExample example);

    Utbasecashflowstatement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utbasecashflowstatement record, @Param("example") UtbasecashflowstatementExample example);

    int updateByExample(@Param("record") Utbasecashflowstatement record, @Param("example") UtbasecashflowstatementExample example);

    int updateByPrimaryKeySelective(Utbasecashflowstatement record);

    int updateByPrimaryKey(Utbasecashflowstatement record);
}