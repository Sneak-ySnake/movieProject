package com.theo.movieProject.controller.movieAPI.movieAPIObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class MovieSearchResults {

    @JsonProperty("page")
    int page;

    @JsonProperty("results")
    List<MovieResult> results;

    @JsonProperty("total_pages")
    int total_pages;

    @JsonProperty("total_results")
    int total_results;

    @Getter
    public static class MovieResult {
        @JsonProperty("adult")
        boolean adult;

        @JsonProperty("backdrop_path")
        String backdrop_path;

        @JsonProperty("genre_ids")
        List<Integer> genre_ids;

        @JsonProperty("id")
        int id;

        @JsonProperty("original_language")
        String original_language;

        @JsonProperty("original_title")
        String original_title;

        @JsonProperty("overview")
        String overview;

        @JsonProperty("popularity")
        float popularity;

        @JsonProperty("poster_path")
        String poster_path;

        @JsonProperty("release_date")
        String release_date;

        @JsonProperty("title")
        String title;

        @JsonProperty("video")
        boolean video;

        @JsonProperty("vote_average")
        float vote_average;

        @JsonProperty("vote_count")
        int vote_count;

    }

}
