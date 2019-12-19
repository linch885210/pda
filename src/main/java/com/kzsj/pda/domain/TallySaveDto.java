package com.kzsj.pda.domain;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@Data
@ApiModel(value = "com.kzsj.pda.domain.TallySaveDto", description = "��������ղ�����dto")
public class TallySaveDto implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ���˵���
     */
    @ApiModelProperty(value = "���˵���")
    private String billNo;

    /**
     * �˵���
     */
    @ApiModelProperty(value = "�˵���")
    private String logisticsNo;
}
