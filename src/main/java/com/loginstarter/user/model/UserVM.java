package com.loginstarter.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVM {

    private String firstName;

    @Email
    private String email;

    private String password;
}
