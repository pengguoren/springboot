package com.cq.springboot;

import com.cq.springboot.bean.Person;
import org.junit.jupiter.api.Test;
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
    public void testHelloService() {
        boolean b = ioc.containsBean("helloservice");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
