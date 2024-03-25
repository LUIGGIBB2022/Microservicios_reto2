package com.microservicioslitethinking.app.controller;

import com.microservicioslitethinking.app.entity.Account;
import com.microservicioslitethinking.app.entity.User;
import com.microservicioslitethinking.app.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {this.accountService = accountService;}
    @PostMapping("/account/create")
    public void createAccount (@RequestBody Account account) {accountService.createAccount(account);}

    @PutMapping("/account/update/{id}")
    public ResponseEntity<Account> updatedAccount(@PathVariable("id") Long accountId, @RequestBody Account account)
    {
        account.setId(accountId);
        Account updatedAccount = accountService.updateAccount(accountId, account);
        return new ResponseEntity<>(updatedAccount, HttpStatus.OK);
    }


}
