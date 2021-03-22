package com.johnclaro.chimp.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AccountController {

    @GetMapping({"/register"})
    public String register(Account account) {
        Account newAccount = new Account("john", "moo");
        return newAccount.getUsername();
    }
}
