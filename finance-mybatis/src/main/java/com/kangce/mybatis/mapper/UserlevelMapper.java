package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Userlevel;
import com.kangce.mybatis.model.UserlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlevelMapper {
    int countByExample(UserlevelExample example);

    int deleteByExample(UserlevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userlevel record);

    int insertSelective(Userlevel record);

    List<Userlevel> selectByExample(UserlevelExample example);

    Userlevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userlevel record, @Param("example") UserlevelExample example);

    int updateByExample(@Param("record") Userlevel record, @Param("example") UserlevelExample example);

    int updateByPrimaryKeySelective(Userlevel record);

    int updateByPrimaryKey(Userlevel record);
}