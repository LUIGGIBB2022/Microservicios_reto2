package com.microservicioslitethinking.app.service;

import com.microservicioslitethinking.app.entity.Account;
import com.microservicioslitethinking.app.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepo;

    public AccountService(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    public void createAccount(Account account){accountRepo.save(account);}
}
