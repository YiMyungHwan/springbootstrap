package com.mx.springbootstrap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class Hello {
    @Value("${spring.mvc.static-path-pattern}")
    String resourcesPath;

    @GetMapping("/test")
    public String test() {

        System.out.println(resourcesPath);

        return "Hello world";
    }
}
