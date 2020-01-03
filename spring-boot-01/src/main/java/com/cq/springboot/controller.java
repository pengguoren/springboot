package com.cq.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 彭国仁
 * @data 2020/1/3 11:25
 */
@RestController
public class controller {
    @RequestMapping("index")
    public String test() {
        return "hello world";
    }

}
