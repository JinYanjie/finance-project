package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Utusestatus;
import com.kangce.mybatis.model.UtusestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtusestatusMapper {
    int countByExample(UtusestatusExample example);

    int deleteByExample(UtusestatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utusestatus record);

    int insertSelective(Utusestatus record);

    List<Utusestatus> selectByExample(UtusestatusExample example);

    Utusestatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utusestatus record, @Param("example") UtusestatusExample example);

    int updateByExample(@Param("record") Utusestatus record, @Param("example") UtusestatusExample example);

    int updateByPrimaryKeySelective(Utusestatus record);

    int updateByPrimaryKey(Utusestatus record);
}