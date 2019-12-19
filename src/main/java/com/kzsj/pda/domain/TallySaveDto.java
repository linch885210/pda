package com.kzsj.pda.domain;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@Data
@ApiModel(value = "com.kzsj.pda.domain.TallySaveDto", description = "理货入库接收参数的dto")
public class TallySaveDto implements Serializable {
    private static final long serialVersionUID = 1L;
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
}
