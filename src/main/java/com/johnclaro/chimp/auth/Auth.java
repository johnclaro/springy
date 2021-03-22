package com.johnclaro.chimp.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {

    @GetMapping
    public String register() {
        String response = "Register123";
        return response;
    }
}
