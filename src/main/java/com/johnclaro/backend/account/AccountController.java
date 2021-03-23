package com.johnclaro.backend.account;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping({"/accounts"})
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping({"/register"})
    public Account register(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
    }
}
