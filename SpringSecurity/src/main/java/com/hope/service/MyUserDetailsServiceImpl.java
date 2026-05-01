package com.hope.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceImpl implements MyUserDetailsService{


    @Override
    public UserDetailsService userDetailsService() {
        return null;
    }
}
