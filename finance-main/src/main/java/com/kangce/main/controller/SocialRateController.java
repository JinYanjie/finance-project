package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.dto.SocialRateParam;
import com.kangce.main.service.SocialRateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@Api(tags = "rate", description = "税率")
@RequestMapping("/rate")
@ResponseBody
public class SocialRateController {
    @Autowired
    SocialRateService socialRateService;

    @ApiOperation(value = "查询税率")
    @PostMapping(value = "/get")
    public Object get() {
        return new CommonResult().success(socialRateService.getSocialRate());
    }

    @ApiOperation(value = "更新税率")
    @PostMapping(value = "/update")
    public Object update(@RequestBody List<SocialRateParam> socialRateParams) {
        Object update = socialRateService.update(socialRateParams);
        if (update instanceof String) {
            return new CommonResult().failed((String) update);
        } else {
            return new CommonResult().success(update);
        }
    }
}
