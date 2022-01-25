package com.footballCheck.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {


    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/write")
    public String write() {
        return "views/write";
    }

}
