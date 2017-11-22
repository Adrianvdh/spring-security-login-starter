package com.loginstarter.user;

import com.loginstarter.user.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user/registration")
public class UserResource {



    @PostMapping
    public void registerUser(@Valid User user) {

    }

}
