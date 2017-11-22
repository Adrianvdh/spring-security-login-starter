package com.loginstarter.user.service;

import com.loginstarter.model.User;
import com.loginstarter.user.model.UserVM;
import com.loginstarter.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;

    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(UserVM userVM) {
        return new User();
    }
}
