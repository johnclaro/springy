package com.johnclaro.chimp.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class AccountController {

    @GetMapping({"/register"})
    public Map<String, String> register(Account account) {
        Account newAccount = new Account("john", "moo");
        Map<String, String> response = new HashMap<>();
        response.put("usernames", newAccount.getUsername());
        response.put("password", newAccount.getPassword());
        return response;
    }
}
