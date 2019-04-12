package com.kangce.main.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class CertificateParam {
    /**
     * 凭证id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "凭证id")
    private Integer id;

    /**
     * 凭证保存日期
     *
     * @mbggenerated
     */

    @ApiModelProperty(value = "日期")
    @NotEmpty(message = "日期不能为空")
    private Date date;

    /**
     * 摘要（借方、贷方）
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "摘要")
    private String summary;

    /**
     * 凭证号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "凭证号")
    private String certificateNum;

    /**
     * 会计科目号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "会计科目号")
    private String cNum;

    /**
     * 会计科目名
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "会计科目名")
    private String cName;

    /**
     * 借方金额
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "借方金额")
    private BigDecimal inMoney;

    /**
     * 贷方金额
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "贷方金额")
    private BigDecimal outMoney;

    /**
     * 审核状态  1 已审核，2 未审核
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "审核状态   1 已审核，2 未审核")

    private Integer state;

    /**
     * 审核人id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "审核人id")
    private Integer checkUserId;

    /**
     * 凭证类型  1 借方 2 贷方
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "凭证类型  1 借方 2 贷方")
    private Integer type;
}
