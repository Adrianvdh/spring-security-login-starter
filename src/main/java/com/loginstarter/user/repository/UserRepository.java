package com.loginstarter.user.repository;

import com.loginstarter.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findOneByUsername(String username);

    Optional<User> findOneByEmail(String email);

    void save(User user);

    List<User> findAll();
}
