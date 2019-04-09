package com.kangce.main.controller;

import com.kangce.main.dto.CertificateWordParam;
import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.CertificateService;
import com.kangce.mybatis.model.Utcredentialsword;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "certificate-controller", description = "凭证字")
@RequestMapping("/certificate")
@ResponseBody
public class CertificateController {
    @Autowired
    CertificateService certificateService;

    @ApiOperation("获取凭证字")
    @PostMapping("/getWord")
    public Object getWord() {
        List<Utcredentialsword> word = certificateService.getWord();
        if (word == null) {
            return new CommonResult().failed("凭证字获取失败");
        } else {
            return new CommonResult().success(word);
        }
    }

    @ApiOperation(value = "编辑凭证字")
    @PostMapping("/update")
    public Object updateWord(CertificateWordParam certificateWordParam) {
        int i = certificateService.editWord(certificateWordParam);
        if (i > 0) {
            return new CommonResult().success("修改成功");
        } else {
            return new CommonResult().failed("更新失败");
        }
    }

    @ApiOperation(value = "添加凭证字")
    @PostMapping("/add")
    public Object addWord(CertificateWordParam certificateWordParam) {
        int i = certificateService.addWord(certificateWordParam);
        if (i > 0) {
            return new CommonResult().success("添加成功");
        } else {
            return new CommonResult().failed("添加失败");
        }
    }

    @ApiOperation(value = "删除凭证字")
    @PostMapping("/delete")
    public Object addWord(int id) {
        int i = certificateService.deleteWord(id);
        if (i > 0) {
            return new CommonResult().success("删除成功");
        } else {
            return new CommonResult().failed("删除失败");
        }
    }

}
