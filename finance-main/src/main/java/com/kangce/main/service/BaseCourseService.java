package com.kangce.main.service;

import com.kangce.mybatis.model.Utbasecourse;

import java.util.List;

public interface BaseCourseService {
    /**
     * 获取基本科目
        id
     资产
     负债
     共同
     权益
     成本
     损益
     */
    public List<Utbasecourse> getBaseCourse(int id);
}
