package com.loginstarter.security;

import com.loginstarter.model.User;
import com.loginstarter.user.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

@Component("userDetailsService")
public class DefaultUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public DefaultUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> storedUser = userRepository.findOneByUsername(username);

        return storedUser.map(user -> {
            return new org.springframework.security.core.userdetails.User(
                    username,
                    user.getPassword(),
                    Collections.singleton(() -> "ROLE_ADMIN"));
        }).orElseThrow(() -> new RuntimeException("User " + username + " was not found!"));
    }
}
