package org.wmy.mybatis.service;

import org.springframework.stereotype.Service;
import org.wmy.mybatis.bean.Lock;
import org.wmy.mybatis.dao.ILockMapper;

import javax.annotation.Resource;

/**
 * @author wmy
 * @create 2021-04-30 11:01
 */

@Service
public class LockService {
    @Resource
    ILockMapper mapper;

    public Lock getLock(){
        Lock lock = mapper.getLock(1);
        Lock lock1 = mapper.getLock(1);
        return lock;
    }
}
