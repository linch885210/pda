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
     * 出场理货入库请求
     * @param tallySaveDto
     * @return
     */
    @RequestMapping(value = "/tally/warehouse",method = RequestMethod.POST)
    String warehouse(@RequestBody TallySaveDto tallySaveDto);

    /**
     * 出场查验
     * @param inspectionDto
     * @return
     */
    @RequestMapping("/Assist/type/modification")
    String modification(@RequestBody UpdateTypeDto inspectionDto);

    /**
     * 出场理货出库请求
     * @param tallySaveDto
     * @return
     */
    @RequestMapping(value = "/tally/outbound",method = RequestMethod.POST)
    String outbound(TallySaveDto tallySaveDto);

    /**
     * 根据提运单号和运单号查询相关数据返回到PDA
     * @param saveDto
     * @return
     */
    @RequestMapping(value = "/Assist/findTally",method = RequestMethod.POST)
    String findTally(@RequestBody TallySaveDto saveDto);
}
