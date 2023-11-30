package com.example.ms.member.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
