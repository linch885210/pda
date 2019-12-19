package com.kzsj.pda.controller;

import com.alibaba.fastjson.JSONArray;
import com.kzsj.pda.domain.UpdateTypeDto;
import com.kzsj.pda.domain.TallySaveDto;
import com.kzsj.pda.response.JsonResult;
import com.kzsj.pda.response.ReturnValueLoader;
import com.kzsj.pda.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SystemController {


    @Autowired
    private WareService wareService;


    @RequestMapping("/index")
    public Map<String, String> index() {
        Map map = new HashMap();
        map.put("1", "index");
        return map;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonResult login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        if (username.equals("admin") && password != null) {
            return JsonResult.success("456");
        } else {
            return JsonResult.error("123");
        }
    }

    /**
     * 理货入库接口
     * @param wareVo
     * @return
     */
    @RequestMapping(value = "/tally/ware", method = RequestMethod.POST)
    public ReturnValueLoader tallyWarehousing(@RequestBody TallySaveDto wareVo) {
        String warehouseStr = wareService.warehouse(wareVo);

        ReturnValueLoader returnValueLoader = JSONArray.parseObject(warehouseStr, ReturnValueLoader.class);
        return returnValueLoader;

    }

    /**
     * 出场查验接口
     * @param updateTypeDto
     * @return
     */
    @RequestMapping(value = "/Assist/type/modification", method = RequestMethod.POST)
    public ReturnValueLoader inspection(@RequestBody UpdateTypeDto updateTypeDto) {
        String jsonStr=wareService.modification(updateTypeDto);
        ReturnValueLoader returnValueLoader = JSONArray.parseObject(jsonStr, ReturnValueLoader.class);
        return returnValueLoader;
    }
    @RequestMapping(value = "/tally/outbound",method = RequestMethod.POST)
    public ReturnValueLoader outbound(@RequestBody TallySaveDto wareVo){
        String jsonStr=wareService.outbound(wareVo);
        ReturnValueLoader returnValueLoader = JSONArray.parseObject(jsonStr, ReturnValueLoader.class);
        return returnValueLoader;
    }

    /**
     * 根据提运单号和运单号查询相关数据返回到PDA
     * @param saveDto
     * @return
     */
    @RequestMapping(value = "/Assist/findTally",method = RequestMethod.POST)
    public ReturnValueLoader findTally(@RequestBody TallySaveDto saveDto){
        String jsonStr=wareService.outbound(saveDto);
        ReturnValueLoader returnValueLoader = JSONArray.parseObject(jsonStr, ReturnValueLoader.class);
        return returnValueLoader;
    }


}
