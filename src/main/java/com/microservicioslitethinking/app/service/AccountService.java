package com.microservicioslitethinking.app.service;

import com.microservicioslitethinking.app.entity.Account;
import com.microservicioslitethinking.app.entity.User;
import com.microservicioslitethinking.app.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepo;

    public AccountService(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    public void createAccount(Account account){accountRepo.save(account);}

    public Account updateAccount(Long accountId, Account accountUpdate)
    {
        // Obtener el Cuenta existente
        Account existingAccount = accountRepo.findById(accountId).get();
        // Realizar las  tareas de actualización del registro
        existingAccount.setBalance(accountUpdate.getBalance());
        existingAccount.setAssociated_card(accountUpdate.getAssociated_card());
        return accountRepo.save(existingAccount);
    }
}
