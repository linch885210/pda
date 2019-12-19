package com.kzsj.pda.feign;

import com.kzsj.pda.config.FeignConfig;
import com.kzsj.pda.domain.TallySaveDto;
import com.kzsj.pda.domain.UpdateTypeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value ="whme",configuration= FeignConfig.class)
public interface WareClient {
    /**
     * ��������������
     * @param tallySaveDto
     * @return
     */
    @RequestMapping(value = "/tally/warehouse",method = RequestMethod.POST)
    String warehouse(@RequestBody TallySaveDto tallySaveDto);

    /**
     * ��������
     * @param inspectionDto
     * @return
     */
    @RequestMapping("/Assist/type/modification")
    String modification(@RequestBody UpdateTypeDto inspectionDto);

    /**
     * ���������������
     * @param tallySaveDto
     * @return
     */
    @RequestMapping(value = "/tally/outbound",method = RequestMethod.POST)
    String outbound(TallySaveDto tallySaveDto);

    /**
     * �������˵��ź��˵��Ų�ѯ������ݷ��ص�PDA
     * @param saveDto
     * @return
     */
    @RequestMapping(value = "/Assist/findTally",method = RequestMethod.POST)
    String findTally(@RequestBody TallySaveDto saveDto);
}
