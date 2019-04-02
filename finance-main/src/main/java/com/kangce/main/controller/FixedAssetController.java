package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.FixedAssetsService;
import com.kangce.main.service.impl.AssetsChoiceParameterService;
import com.kangce.main.util.TextUtils;
import com.kangce.mybatis.model.FixedAssets;
import com.kangce.mybatis.model.Utassettype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@Api(tags = "FixedAssetController", description = "固定资产管理")
@RequestMapping("/fixedAssets")
@ResponseBody
public class FixedAssetController {

    @Autowired
    FixedAssetsService fixedAssetsService;

    @Autowired
    AssetsChoiceParameterService assetsChoiceParameterService;

    @ApiOperation("添加固定资产记录")
    @PostMapping("/add")
    public Object addFixed(FixedAssets fixedAssets) {
        CommonResult commonResult = new CommonResult();
        if (fixedAssets == null) {
            return commonResult.failed("未获取到数据");
        }
        if (TextUtils.isEmpty(fixedAssets.getAssetsName())
                || TextUtils.isEmpty(fixedAssets.getAssetsCode())
                || fixedAssets.getInputTime()==null
                || fixedAssets.getInitialAssetValue() ==null
        ) {
            return commonResult.failed("必填字段不可为空");
        }


        int line = fixedAssetsService.addAssets(fixedAssets);
        if(line==1){
            return commonResult.success(new HashMap<>());
        }else {
            return commonResult.failed("系统内部错误");
        }
    }

    @ApiOperation("查询所有固定资产记录")
    @PostMapping("/loadFixedAssetsList")
    public Object loadFixedAssetsList(){
        CommonResult commonResult = new CommonResult();

        List<FixedAssets> fixedAssets = fixedAssetsService.loadFixedAssetsList();
        return commonResult.success(fixedAssets);
    }


    @ApiOperation("查询所有固定资产类型")
    @PostMapping("/loadAllAssetType")
    public Object loadAllAssetType(){
        CommonResult commonResult = new CommonResult();

        List<Utassettype> utassettypes = assetsChoiceParameterService.loadAllAssetType();
        return commonResult.success(utassettypes);
    }


}
