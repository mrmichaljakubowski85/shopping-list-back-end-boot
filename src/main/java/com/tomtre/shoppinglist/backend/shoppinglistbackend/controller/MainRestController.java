package com.tomtre.shoppinglist.backend.shoppinglistbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainRestController {

    @GetMapping("/test")
    public String showTest() {
        return "xxx controller endpoint!";
    }

}
