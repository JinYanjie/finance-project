package com.kangce.main.controller;

import com.kangce.main.dto.CertificateParam;
import com.kangce.main.dto.CommonResult;
import com.kangce.main.service.impl.CertificateManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "certificate-manager-controller", description = "凭证管理")
@RequestMapping("/certificateManager")
@ResponseBody
public class CertificateManagerController {
    @Autowired
    CertificateManagerService managerService;

    @ApiOperation(value = "添加凭证")
    @PostMapping("/add")
    public Object addCertificate(@RequestBody List<CertificateParam> certificateParams) {
        int i = managerService.addCertificate(certificateParams);
        if (i > 0) {
            return new CommonResult().success("修改成功");
        } else {
            return new CommonResult().failed("更新失败");
        }
    }

    @ApiOperation("获取凭证")
    @PostMapping("/get")
    public Object getWord(@RequestParam("state") int state) {
        List<Map<String, Object>> certificate = managerService.getCertificate(state);
        if (certificate == null) {
            return new CommonResult().failed("获取失败");
        } else {
            return new CommonResult().success(certificate);
        }
    }

    @ApiOperation("获取凭证")
    @PostMapping("/check")
    public Object check(@RequestParam("certificateNum") String certificateNum,
                        @RequestParam("currentNum") int currentNum,
                        @RequestParam("userId") int userId,
                        @RequestParam("state") int state) {
        int update = managerService.update(certificateNum, currentNum, userId, state);
        if (update > 0) {
            return new CommonResult().success("修改成功");
        } else {
            return new CommonResult().failed("更新失败");
        }
    }

}
