package com.first.spring.project.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        System.out.println("*****Rest Controller*****");
        return "Hi";
    }
}
