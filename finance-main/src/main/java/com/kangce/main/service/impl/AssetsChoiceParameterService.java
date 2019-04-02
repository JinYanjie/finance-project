package com.kangce.main.service.impl;

import com.kangce.mybatis.model.Utassettype;
import com.kangce.mybatis.model.Utchangemode;

import java.util.List;

public interface AssetsChoiceParameterService {

    List<Utchangemode> loadAllChangeMode();

    List<Utassettype> loadAllAssetType();

}
