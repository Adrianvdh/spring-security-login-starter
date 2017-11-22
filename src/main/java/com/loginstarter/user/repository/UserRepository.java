package com.loginstarter.user.repository;

import com.loginstarter.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findOneByUsername(String s);

    Optional<User> findOneByEmail(String email);
}
