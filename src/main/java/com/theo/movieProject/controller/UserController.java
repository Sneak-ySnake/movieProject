package com.theo.movieProject.controller;

import com.theo.movieProject.entity.Users;
import com.theo.movieProject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/createUser")
    public String createUser(@RequestBody Users user) {
       if(usersRepository.findByUsername(user.getUsername()).equals(null)) {
           //Users user = new Users(loginInfo.username, loginInfo.password);
           usersRepository.save(user);
        }

        return "/";
    }

    class LoginForm {
        public String username;
        public String password;
    }

}
