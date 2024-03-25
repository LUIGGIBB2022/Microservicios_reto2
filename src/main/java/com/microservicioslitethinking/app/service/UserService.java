package com.microservicioslitethinking.app.service;

import com.microservicioslitethinking.app.entity.User;
import com.microservicioslitethinking.app.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void createUser (User user) { userRepo.save(user);}

}
