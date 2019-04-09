package com.kangce.main.service;

import com.kangce.mybatis.model.Utassettype;
import com.kangce.mybatis.model.Utchangemode;

import java.util.List;

public interface AssetsChoiceParameterService {

    List<Utchangemode> loadAllChangeMode();

    List<Utassettype> loadAllAssetType();

}
