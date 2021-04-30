package org.wmy.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class MybatisApplicationTests {
    @Resource
    private DataSource  dataSource;

    @Test
    void contextLoads() {
        Class<? extends DataSource> sourceClass = dataSource.getClass();
        System.out.println(sourceClass);
    }

}
