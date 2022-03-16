package com.only.nbi.portal.module.module_name_xxx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test() {
        System.out.println("Hello world!");
        return "Hello world !";
    }
}
