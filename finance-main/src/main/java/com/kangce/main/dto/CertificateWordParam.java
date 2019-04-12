package com.kangce.main.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class CertificateWordParam {
    @ApiModelProperty(value = "凭证字编号")
    private int id;

    @ApiModelProperty(value = "凭证字")
    @NotEmpty(message = "凭证字不能为空")
    private String credentcontent;

    @ApiModelProperty(value = "凭证字描述")
    private String printtitle;

    @ApiModelProperty(value = "凭证字是否默认")
    private Integer whetherdefault;
}
