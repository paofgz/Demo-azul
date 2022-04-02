package com.itesm.azul.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo") //path para que se llegue a este controlador
public class DemoController {

    @GetMapping("/say-hello")
    public String sayHello(){
        return "Hello world";
    }
}
