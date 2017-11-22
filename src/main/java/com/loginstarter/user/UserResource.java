package com.loginstarter.user;

import com.loginstarter.model.User;
import com.loginstarter.user.model.UserVM;
import com.loginstarter.user.repository.UserRepository;
import com.loginstarter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final UserRepository userRepository;
    private final UserService userService;

    @Autowired
    public UserResource(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerUser(@Valid UserVM userVM) {

        userRepository.findOneByEmail(userVM.getEmail())
                .ifPresent(user -> { throw new RuntimeException("Email address already taken!"); });

        userService.registerUser(userVM);
    }

    @GetMapping("/all")
    public List<User> getAllRegisteredUsers() {
        return userRepository.findAll();
    }

}
