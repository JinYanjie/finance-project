package com.kangce.main.service.impl;

import com.kangce.main.service.FixedAssetsService;
import com.kangce.mybatis.mapper.FixedAssetsMapper;
import com.kangce.mybatis.model.FixedAssets;
import com.kangce.mybatis.model.FixedAssetsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FixedAssetsServiceImpl implements FixedAssetsService {

    @Autowired
    FixedAssetsMapper fixedAssetsMapper;

    @Override
    public int addAssets(FixedAssets fixedAssets) {
        return fixedAssetsMapper.insert(fixedAssets);
    }

    @Override
    public List<FixedAssets> loadFixedAssetsList() {
        return fixedAssetsMapper.selectByExample(new FixedAssetsExample());
    }
}
