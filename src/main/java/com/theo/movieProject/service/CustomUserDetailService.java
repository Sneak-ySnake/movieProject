package com.theo.movieProject.service;

import com.theo.movieProject.service.userObject.PrincipalUser;
import com.theo.movieProject.entity.Users;
import com.theo.movieProject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Users user = usersRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException(username);

        return new PrincipalUser(user);
    }
}
