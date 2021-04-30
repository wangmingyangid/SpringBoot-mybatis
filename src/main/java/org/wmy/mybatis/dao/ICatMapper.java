package org.wmy.mybatis.dao;


import org.wmy.mybatis.bean.Cat;

/**
 * @author wmy
 * @create 2021-04-28 20:44
 */
public interface ICatMapper {
     Cat getById(Integer id);
}
