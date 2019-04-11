package com.kangce.main.service.impl;

import com.kangce.main.service.BaseCourseService;
import com.kangce.mybatis.mapper.UtbasecourseMapper;
import com.kangce.mybatis.model.Utbasecourse;
import com.kangce.mybatis.model.UtbasecourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseCourseServiceImpl implements BaseCourseService {
    @Autowired
    UtbasecourseMapper utbasecourseMapper;

    /**
     * 0  查询所有
     * 资产
     * 负债
     * 共同
     * 权益
     * 成本
     * 损益
     */
    @Override
    public List<Utbasecourse> getBaseCourse(int id) {
        UtbasecourseExample utbasecourseExample = new UtbasecourseExample();
        if (id == 0) {
            return utbasecourseMapper.selectByExample(utbasecourseExample);
        } else {
            utbasecourseExample.createCriteria().andCtypeEqualTo(id);
            return utbasecourseMapper.selectByExample(utbasecourseExample);
        }
    }
}
