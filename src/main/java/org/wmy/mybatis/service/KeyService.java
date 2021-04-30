package org.wmy.mybatis.service;

import org.springframework.stereotype.Service;
import org.wmy.mybatis.bean.Key;
import org.wmy.mybatis.bean.Lock;
import org.wmy.mybatis.dao.IKeyMapper;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-29 18:03
 */

@Service
public class KeyService {
    @Resource
    private IKeyMapper mapper;

    public Key getKeyById(){
        return mapper.getKeyById(1);
    }

    public String getKeyBySimple(){
        Key key = mapper.getKeyByIdForSimple(1);
        //有这一句后会执行另一条sql
        System.out.println(key);
        return key.getKeyName();
    }

    /**
     * 该方法主要是因为，返回前端时json转化报错。
     * 发现：当实体类中有的属性值为null时，就会报错。通过在属性类上加上相关注解即可
     * @return
     */
    public Key getKeyBySimple1(){
        //
        Key key = mapper.getKeyByIdForSimple(1);
        System.out.println(key);
        return key;
    }
}
