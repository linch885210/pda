package com.kzsj.pda.service;

import com.kzsj.pda.domain.TallySaveDto;
import com.kzsj.pda.domain.UpdateTypeDto;

public interface WareService {

    /**
     * 出场理货入库
     * @param tallySaveDto
     * @return
     */
    String  warehouse(TallySaveDto tallySaveDto);

    /**
     * 出场查验
     * @param inspectionDto
     * @return
     */
    String modification(UpdateTypeDto inspectionDto);

    /**
     * 出场理货入库
     * @param tallySaveDto
     * @return
     */
    String outbound(TallySaveDto tallySaveDto);

    /**
     * 根据提运单号和运单号查询相关数据返回到PDA
     * @param tallySaveDto
     * @return
     */
    String findTally(TallySaveDto tallySaveDto);
}
