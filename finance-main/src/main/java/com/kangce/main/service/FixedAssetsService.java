package com.kangce.main.service;

import com.kangce.mybatis.model.FixedAssets;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FixedAssetsService {

    int addAssets(FixedAssets fixedAssets);

    List<FixedAssets> loadFixedAssetsList();

    String getAssetsCode(int type);

    FixedAssets loadFixedAssetsById(int assetsId);

    int updateAssets(int id,int changWay);
}
