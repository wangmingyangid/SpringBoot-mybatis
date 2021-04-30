package org.wmy.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wmy.mybatis.bean.Cat;
import org.wmy.mybatis.service.CatService;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-29 11:39
 */

@RestController
public class CatTestController {
    @Resource
    private CatService catService;

    @GetMapping("/cat/{id}")
    public Cat getCatById(@PathVariable("id") int id) {
        Cat cat = catService.getById(id);
        return cat;
    }
}
