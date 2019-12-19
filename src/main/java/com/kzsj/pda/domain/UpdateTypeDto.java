package com.kzsj.pda.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateTypeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 作业辅助id
     */
    @ApiModelProperty(value = "作业辅助主键id")
    private Long id;
    /**
     * 提运单号
     */
    @ApiModelProperty(value = "提运单号")
    private String billNo;

    /**
     * 运单号
     */
    @ApiModelProperty(value = "运单号")
    private String logisticsNo;

    /**
     * 查验状态
     */
    @ApiModelProperty(value = "查验状态")
    private Integer status;
}
