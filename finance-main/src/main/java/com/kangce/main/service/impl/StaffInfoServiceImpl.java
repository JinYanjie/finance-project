package com.kangce.main.service.impl;

import com.github.pagehelper.PageHelper;
import com.kangce.main.dto.StaffInfoParam;
import com.kangce.main.service.StaffInfoService;
import com.kangce.mybatis.mapper.StaffInfoMapper;
import com.kangce.mybatis.model.StaffInfo;
import com.kangce.mybatis.model.StaffInfoExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class StaffInfoServiceImpl implements StaffInfoService {
    @Autowired
    StaffInfoMapper staffInfoMapper;

    @Override
    public StaffInfo addStaff(StaffInfoParam param) {
        StaffInfo staffInfo = new StaffInfo();
        BeanUtils.copyProperties(param, staffInfo);

        staffInfoMapper.insert(staffInfo);
        return staffInfo;
    }

    @Override
    public StaffInfo updateStaff(StaffInfoParam param) {
        //如果员工存在则更显，否则不更新
        StaffInfo staffInfo = new StaffInfo();
        BeanUtils.copyProperties(param, staffInfo);
        StaffInfoExample staffInfoExample = new StaffInfoExample();
        staffInfoExample.createCriteria().andIdEqualTo(param.getId());
        List<StaffInfo> staffInfos = staffInfoMapper.selectByExample(staffInfoExample);
        if (staffInfos.size() > 0) {
            staffInfoMapper.updateByPrimaryKeySelective(staffInfo);
            return staffInfo;
        } else {
            return null;
        }
    }

    @Override
    public int delStaff(int id) {
        StaffInfoExample staffInfoExample = new StaffInfoExample();
        staffInfoExample.createCriteria().andIdEqualTo(id);
        List<StaffInfo> staffInfos = staffInfoMapper.selectByExample(staffInfoExample);
        if (staffInfos.size() > 0) {
            return staffInfoMapper.deleteByPrimaryKey(id);
        }
        return -1;
    }

    @Override
    public StaffInfo getStaffInfo(int id) {
        return staffInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StaffInfo> getBatchStaff(String keyWord, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        StaffInfoExample staffInfoExample = new StaffInfoExample();
        StaffInfoExample.Criteria criteria = staffInfoExample.createCriteria();
        if (!StringUtils.isEmpty(keyWord)) {
            criteria.andNameLike("%" + keyWord + "%");
        }
        return staffInfoMapper.selectByExample(staffInfoExample);
    }

    @Override
    public List<StaffInfo> getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return staffInfoMapper.selectByExample(new StaffInfoExample());
    }


}
