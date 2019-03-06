package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utcredentialsword;
import com.kangce.mybatis.model.UtcredentialswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtcredentialswordMapper {
    int countByExample(UtcredentialswordExample example);

    int deleteByExample(UtcredentialswordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utcredentialsword record);

    int insertSelective(Utcredentialsword record);

    List<Utcredentialsword> selectByExample(UtcredentialswordExample example);

    Utcredentialsword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utcredentialsword record, @Param("example") UtcredentialswordExample example);

    int updateByExample(@Param("record") Utcredentialsword record, @Param("example") UtcredentialswordExample example);

    int updateByPrimaryKeySelective(Utcredentialsword record);

    int updateByPrimaryKey(Utcredentialsword record);
}