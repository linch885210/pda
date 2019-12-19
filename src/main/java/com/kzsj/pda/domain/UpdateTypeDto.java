package com.kzsj.pda.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateTypeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ��ҵ����id
     */
    @ApiModelProperty(value = "��ҵ��������id")
    private Long id;
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

    /**
     * ����״̬
     */
    @ApiModelProperty(value = "����״̬")
    private Integer status;
}
