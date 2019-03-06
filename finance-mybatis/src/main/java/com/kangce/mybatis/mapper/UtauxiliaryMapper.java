package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utauxiliary;
import com.kangce.mybatis.model.UtauxiliaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtauxiliaryMapper {
    int countByExample(UtauxiliaryExample example);

    int deleteByExample(UtauxiliaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utauxiliary record);

    int insertSelective(Utauxiliary record);

    List<Utauxiliary> selectByExample(UtauxiliaryExample example);

    Utauxiliary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utauxiliary record, @Param("example") UtauxiliaryExample example);

    int updateByExample(@Param("record") Utauxiliary record, @Param("example") UtauxiliaryExample example);

    int updateByPrimaryKeySelective(Utauxiliary record);

    int updateByPrimaryKey(Utauxiliary record);
}