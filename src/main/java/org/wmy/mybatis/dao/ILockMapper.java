package org.wmy.mybatis.dao;

import org.wmy.mybatis.bean.Lock;

/**
 * @author wmy
 * @create 2021-04-30 9:36
 */
public interface ILockMapper {
    Lock getLockById(int id);
    Lock getLock(int id);
}
