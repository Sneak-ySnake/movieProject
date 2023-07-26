package com.theo.movieProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/searchMovieResult").setViewName("searchMovieResult");
        registry.addViewController("/moviePage").setViewName("testPage");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("searchPage");
    }

}
