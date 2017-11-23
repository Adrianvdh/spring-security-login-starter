package com.loginstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping
    public String protectedPage(HttpServletRequest request) {
        return "Welcome !" + request.getRemoteUser();
    }
}
