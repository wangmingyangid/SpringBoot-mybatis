package org.wmy.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wmy.mybatis.bean.Key;
import org.wmy.mybatis.service.KeyService;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-29 18:05
 */

@RestController
public class KeyController {
    @Resource
    KeyService service;

    @GetMapping("/getKey")
    public Key getKeyById(){
        return service.getKeyById();
    }

    @GetMapping("/getKeySimple")
    public String getKeyBySimple(){
        return service.getKeyBySimple();
    }

    @GetMapping("/getKeySimple1")
    public Key getKeyBySimple1(){
        return service.getKeyBySimple1();
    }
}
