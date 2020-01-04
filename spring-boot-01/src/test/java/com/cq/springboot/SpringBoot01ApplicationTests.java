package com.cq.springboot;

import com.cq.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBoot01ApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;


    @Test
    public void testLogging() {
        Logger logger = LoggerFactory.getLogger(SpringBoot01ApplicationTests.class);
        logger.trace("你好trace");
        logger.debug("你好debug");
        logger.info("你好info");
        logger.warn("你好warn");
        logger.error("你好error");
    }
    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloservice");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
