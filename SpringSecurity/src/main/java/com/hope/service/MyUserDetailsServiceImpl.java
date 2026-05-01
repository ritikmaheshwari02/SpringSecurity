package com.hope.service;

import com.hope.dao.UserRepo;
import com.hope.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public User loadUserByUsername(String username) throws UsernameNotFoundException {
                return userRepo.findByUsername(username)
                               .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }
}
