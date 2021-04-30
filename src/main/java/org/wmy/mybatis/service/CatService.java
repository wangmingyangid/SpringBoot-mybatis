package org.wmy.mybatis.service;

import org.springframework.stereotype.Service;
import org.wmy.mybatis.bean.Cat;
import org.wmy.mybatis.dao.ICatMapper;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-29 11:31
 */

@Service
public class CatService {
    @Resource
    private ICatMapper mapper;

    public Cat getById(int id){
        Cat cat = mapper.getById(id);
        return cat;
    }
}
