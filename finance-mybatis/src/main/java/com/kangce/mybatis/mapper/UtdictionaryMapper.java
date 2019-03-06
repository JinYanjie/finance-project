package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utdictionary;
import com.kangce.mybatis.model.UtdictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtdictionaryMapper {
    int countByExample(UtdictionaryExample example);

    int deleteByExample(UtdictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utdictionary record);

    int insertSelective(Utdictionary record);

    List<Utdictionary> selectByExample(UtdictionaryExample example);

    Utdictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utdictionary record, @Param("example") UtdictionaryExample example);

    int updateByExample(@Param("record") Utdictionary record, @Param("example") UtdictionaryExample example);

    int updateByPrimaryKeySelective(Utdictionary record);

    int updateByPrimaryKey(Utdictionary record);
}