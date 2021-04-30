package org.wmy.mybatis.dao;

import org.wmy.mybatis.bean.Key;

/**
 * @author wmy
 * @create 2021-04-29 17:47
 */
public interface IKeyMapper {
    Key getKeyById(int id);

    //分步加载
    Key getKeyByIdForSimple(int id);
}
