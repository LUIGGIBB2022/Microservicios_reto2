package com.microservicioslitethinking.app.controller;

import com.microservicioslitethinking.app.entity.Account;
import com.microservicioslitethinking.app.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {this.accountService = accountService;}
    @PostMapping("/account/create")
    public void createAccount (@RequestBody Account account) {accountService.createAccount(account);}
}
