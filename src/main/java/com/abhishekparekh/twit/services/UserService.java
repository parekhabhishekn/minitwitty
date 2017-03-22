package com.abhishekparekh.twit.services;

import com.abhishekparekh.twit.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by abhishek on 3/21/17.
 */
public interface UserService extends UserDetailsService {
    User findByUsername(String username);
}
