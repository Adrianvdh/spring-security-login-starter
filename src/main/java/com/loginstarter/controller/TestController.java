package com.loginstarter.controller;

import com.loginstarter.user.model.UserVM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping
    public UserVM protectedPage() {
        return new UserVM("adrian", "adrian@zailab.com", "1123");
    }
}
