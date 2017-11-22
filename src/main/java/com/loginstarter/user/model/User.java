package com.loginstarter.user.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

@Data
public class User {

    private String firstName;

    @Email
    private String email;

    private String password;

    private String[] address = {"one", "two", "three"};

    public User(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }
}
