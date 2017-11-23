package com.loginstarter.user.repository;

import com.loginstarter.model.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> inMemoryUsers = new LinkedList<>();

    @Override
    public Optional<User> findOneByUsername(String username) {
        return inMemoryUsers.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    @Override
    public Optional<User> findOneByEmail(String email) {
        return inMemoryUsers.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public void save(User user) {
        inMemoryUsers.add(user);
    }

    @Override
    public List<User> findAll() {
        return inMemoryUsers;
    }
}
