package com.theo.movieProject.controller.movieAPI;

import com.theo.movieProject.controller.movieAPI.movieAPIObject.Movie;
import com.theo.movieProject.controller.movieAPI.movieAPIObject.MovieAPIConstant;
import com.theo.movieProject.controller.movieAPI.movieAPIObject.MovieSearchResults;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MovieController {

    @GetMapping("/searchMovieResult1")
    public String searchMovieResult(@RequestParam String movieId, Model model) {
        String uri = MovieAPIConstant.API_URL + MovieAPIConstant.API_MOVIE_ENDPOINT + movieId + MovieAPIConstant.API_KEY_PARAM;
        RestTemplate restTemplate = new RestTemplate();
        Movie response = restTemplate.getForObject(uri, Movie.class);

        model.addAttribute("movieTitle", response.getTitle());

        return "searchMovieResult1";
    }

    @GetMapping("/searchMovieResult")
    public String searchMovie(@RequestParam String query, @RequestParam int pageNumber, Model model) {
        String uri = MovieAPIConstant.API_URL
                + MovieAPIConstant.API_MOVIE_SEARCH_ENDPOINT
                + MovieAPIConstant.API_KEY_PARAM
                + "&query=" + query
                + "&page=" + pageNumber;

        RestTemplate restTemplate = new RestTemplate();
        MovieSearchResults response = restTemplate.getForObject(uri, MovieSearchResults.class);

        model.addAttribute("originalQuery", query);
        model.addAttribute("totalPage", response.getTotal_pages());
        model.addAttribute("totalResults", response.getTotal_results());
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("movieList", response.getResults());

        return "searchMovieResult";
    }

    @GetMapping("/moviePage")
    public String getTestPage(@RequestParam String movieId, Model model) {
        String uri = MovieAPIConstant.API_URL + MovieAPIConstant.API_MOVIE_ENDPOINT + movieId + MovieAPIConstant.API_KEY_PARAM;
        RestTemplate restTemplate = new RestTemplate();
        Movie response = restTemplate.getForObject(uri, Movie.class);

        model.addAttribute("movieTitle", response.getTitle());
        return "moviePage";
    }

}
