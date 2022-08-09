package com.example.demo1weblogic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shanhy
 * @date 2022-08-08 8:56
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/show")
    public String show(){
        return "OK";
    }

}
