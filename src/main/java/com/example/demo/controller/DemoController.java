package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/") public String health()
    {
        return "Hello Geeks And Welcome to GeekForGeeks !!!";
    }
}
