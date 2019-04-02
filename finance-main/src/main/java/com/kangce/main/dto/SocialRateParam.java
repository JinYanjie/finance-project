package com.kangce.main.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialRateParam {
    @ApiModelProperty(value = "税率id")
    private int id;

    @ApiModelProperty(value = "税率名称")
    private String name;

    @ApiModelProperty(value = "税率")
    private float rate;

    @ApiModelProperty(value = "类型")
    private int type;
}
