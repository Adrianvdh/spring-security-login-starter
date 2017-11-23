package com.loginstarter.user.service;

import com.loginstarter.model.User;
import com.loginstarter.user.model.UserVM;
import com.loginstarter.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DefaultUserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User registerUser(UserVM userVM) {
        User user = new User();
        user.setFirstName(userVM.getFirstName());
        user.setUsername(userVM.getUserName());
        user.setEmail(userVM.getEmail());

        String encodedPassword = passwordEncoder.encode(userVM.getPassword());
        user.setPassword(encodedPassword);

        userRepository.save(user);

        return user;
    }


}
