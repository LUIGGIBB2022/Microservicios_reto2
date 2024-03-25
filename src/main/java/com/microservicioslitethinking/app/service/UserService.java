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

    public User updateUser (User userUpdate, Long userId) {
        if (userRepo.existsById(userId))
            {
                // Obtener el usuario existente
                User existingUser = userRepo.findById(userId).get();
                // Realizar las  tareas de actualización del registro
                existingUser.setName(userUpdate.getName());
                existingUser.setPassword(userUpdate.getPassword());
                existingUser.setPin(userUpdate.getPin());
                return userRepo.save(existingUser);
            }
        else
        {
            return null;
        }

    }

}
