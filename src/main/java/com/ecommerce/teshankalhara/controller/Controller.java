package com.ecommerce.teshankalhara.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    @GetMapping("/name")
    public String getName() {
        return "Teshan Kalhara";
    }
}
