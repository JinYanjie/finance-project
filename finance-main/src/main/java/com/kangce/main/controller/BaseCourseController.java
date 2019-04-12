package com.kangce.main.controller;

import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.impl.BaseCourseServiceImpl;
import com.kangce.mybatis.model.Utbasecourse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "baseCourse-controller", description = "基础科目查询")
@RequestMapping("/baseCourse")
@ResponseBody
public class BaseCourseController {
    @Autowired
    BaseCourseServiceImpl baseCourseService;

    @ApiOperation("获取 基本科目")
    @ApiImplicitParam(name = "id", value = "0 全部，1 资产， 2 负债，3 共同， 4  权益，5 成本，6 损益", required = true, dataType = "int", paramType = "query")
    @PostMapping("/get")
    public Object getBaseCourse(int id) {
        List<Utbasecourse> baseCourse = baseCourseService.getBaseCourse(id);
        if (baseCourse == null) {
            return new CommonResult().failed("获取失败");
        } else {
            return new CommonResult().success(baseCourse);
        }
    }
}
