package com.kangce.main.service;

import com.kangce.mybatis.model.FixedAssets;

import java.util.List;

public interface FixedAssetsService {

    int addAssets(FixedAssets fixedAssets);

    List<FixedAssets> loadFixedAssetsList();
}
