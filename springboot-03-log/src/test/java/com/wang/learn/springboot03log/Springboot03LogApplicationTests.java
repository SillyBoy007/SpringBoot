package com.wang.learn.springboot03log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LogApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        /**
         * 日志级别由低到高
         */
        logger.trace("这是trance日志");
        logger.debug("这是debugger日志");
        logger.info("自定义信息");
        logger.warn("这是warn日志");
        logger.error("这是error");
    }

}
