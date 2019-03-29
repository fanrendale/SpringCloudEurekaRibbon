package com.xjf.eurekaribbon.controller;

import com.xjf.eurekaribbon.service.EurekaRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费者控制类，对用户提供服务
 * @author xjf
 * @date 2019/3/28 19:01
 */
@RestController
public class EurekaRibbonController {
    @Autowired
    private EurekaRibbonService eurekaRibbonService;

    @RequestMapping("/ribbonInfo")
    public String ribbonInfo(){
        String message = eurekaRibbonService.getInfo();

        return "获取的信息:"+message;
    }
}
