package com.microservicioslitethinking.app.repository;

import com.microservicioslitethinking.app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
