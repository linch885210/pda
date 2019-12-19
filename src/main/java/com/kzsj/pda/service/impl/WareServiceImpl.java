package com.kzsj.pda.service.impl;

import com.kzsj.pda.domain.TallySaveDto;
import com.kzsj.pda.domain.UpdateTypeDto;
import com.kzsj.pda.feign.WareClient;
import com.kzsj.pda.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wareServiceImpl")
public class WareServiceImpl implements WareService {

    @Autowired
    private WareClient wareClient;
    @Override
    public String warehouse(TallySaveDto tallySaveDto) {
        return wareClient.warehouse(tallySaveDto);
    }

    @Override
    public String modification(UpdateTypeDto inspectionDto) {
        return wareClient.modification(inspectionDto);
    }

    @Override
    public String outbound(TallySaveDto tallySaveDto) {
        return wareClient.outbound(tallySaveDto);
    }

    @Override
    public String findTally(TallySaveDto tallySaveDto) {
        return wareClient.outbound(tallySaveDto);
    }
}
