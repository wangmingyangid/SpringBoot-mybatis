package org.wmy.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wmy.mybatis.bean.Lock;
import org.wmy.mybatis.service.LockService;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-30 11:02
 */

@RestController
public class LockController {
    @Resource
    LockService service;

    @GetMapping("/getLock")
    public Lock getLock(){
        return service.getLock();
    }
}
