package com.only.nbi.portal.module.alfa.controller;

import com.only.nbi.portal.module.alfa.domain.Alfa;
import com.only.nbi.portal.module.alfa.service.AlfaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AlfaController {

    @Resource
    private AlfaService alfaService;

    @GetMapping("/test1")
    public String test() {
        System.out.println("Hello world!");
        return "Hello world !";
    }

    @GetMapping("/getById")
    public Object test(int id) {
        System.out.println("getById!");
        Alfa byId = alfaService.getById(id);
        return byId;
    }

}
