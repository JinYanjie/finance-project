package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utbaseincomestatement;
import com.kangce.mybatis.model.UtbaseincomestatementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtbaseincomestatementMapper {
    int countByExample(UtbaseincomestatementExample example);

    int deleteByExample(UtbaseincomestatementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utbaseincomestatement record);

    int insertSelective(Utbaseincomestatement record);

    List<Utbaseincomestatement> selectByExample(UtbaseincomestatementExample example);

    Utbaseincomestatement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utbaseincomestatement record, @Param("example") UtbaseincomestatementExample example);

    int updateByExample(@Param("record") Utbaseincomestatement record, @Param("example") UtbaseincomestatementExample example);

    int updateByPrimaryKeySelective(Utbaseincomestatement record);

    int updateByPrimaryKey(Utbaseincomestatement record);
}