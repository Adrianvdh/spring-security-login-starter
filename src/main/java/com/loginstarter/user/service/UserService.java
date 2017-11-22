package com.loginstarter.user.service;

import com.loginstarter.model.User;
import com.loginstarter.user.model.UserVM;

public interface UserService {

    User registerUser(UserVM userVM);
}
