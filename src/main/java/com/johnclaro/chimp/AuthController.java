package com.johnclaro.chimp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping
    public String register() {
        String response = "Register";
        return response;
    }
}
