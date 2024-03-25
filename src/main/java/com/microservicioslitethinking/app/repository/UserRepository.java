package com.microservicioslitethinking.app.repository;
import com.microservicioslitethinking.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
    }


