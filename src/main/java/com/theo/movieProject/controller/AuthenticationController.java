package com.theo.movieProject.controller;

import com.theo.movieProject.controller.movieAPI.movieAPIObject.Movie;
import com.theo.movieProject.entity.FavouriteMovie;
import com.theo.movieProject.entity.Users;
import com.theo.movieProject.repository.FavouriteMovieRepository;
import com.theo.movieProject.repository.UsersRepository;
import com.theo.movieProject.service.userObject.PrincipalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthenticationController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private FavouriteMovieRepository favouriteMovieRepository;

    @PostMapping("/usertest")
    public void createUser(@RequestBody LoginForm loginForm) {
        usersRepository.save(new Users(loginForm.username, loginForm.password));
    }

    @GetMapping("/test")
    public void test() {
        Users user = usersRepository.findByUsername("theo1");

        for (FavouriteMovie movie: user.getFavouriteMovies()) {
            System.out.println(movie.getMovieId() + " " + movie.getUser().getUsername());
        }
    }

    class LoginForm {
        public String username;
        public String password;
    }

}
