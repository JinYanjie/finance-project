package com.kangce.mybatis.mapper;

import com.kangce.mybatis.model.Certificate;
import com.kangce.mybatis.model.CertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateMapper {
    int countByExample(CertificateExample example);

    int deleteByExample(CertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    List<Certificate> selectByExample(CertificateExample example);

    Certificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExample(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKey(Certificate record);
}