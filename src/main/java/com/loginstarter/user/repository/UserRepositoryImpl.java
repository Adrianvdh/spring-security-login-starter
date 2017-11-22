package com.loginstarter.user.repository;

import com.loginstarter.model.User;
import org.springframework.context.annotation.Scope;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
public class UserRepositoryImpl implements UserRepository {

    private List<User> inMemoryUsers = new LinkedList<>();

    @Override
    public Optional<User> findOneByUsername(String s) {

        inMemoryUsers.stream()
                .filter(user -> user.get)
        return null;
    }

    @Override
    public Optional<User> findOneByEmail(String email) {
        return null;
    }
}
