package com.kzsj.pda.service;

import com.kzsj.pda.domain.TallySaveDto;
import com.kzsj.pda.domain.UpdateTypeDto;

public interface WareService {

    /**
     * ����������
     * @param tallySaveDto
     * @return
     */
    String  warehouse(TallySaveDto tallySaveDto);

    /**
     * ��������
     * @param inspectionDto
     * @return
     */
    String modification(UpdateTypeDto inspectionDto);

    /**
     * ����������
     * @param tallySaveDto
     * @return
     */
    String outbound(TallySaveDto tallySaveDto);

    /**
     * �������˵��ź��˵��Ų�ѯ������ݷ��ص�PDA
     * @param tallySaveDto
     * @return
     */
    String findTally(TallySaveDto tallySaveDto);
}
