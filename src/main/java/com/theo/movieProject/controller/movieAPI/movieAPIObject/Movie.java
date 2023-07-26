package com.theo.movieProject.controller.movieAPI.movieAPIObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Movie {

    @JsonProperty("adult")
    boolean adult;

    @JsonProperty("backdrop_path")
    String backdrop_path;

    @JsonProperty("belongs_to_collection")
    BelongsToCollection belongs_to_collection;

    @JsonProperty("budget")
    long budget;

    @JsonProperty("genres")
    List<Genre> genres;

    @JsonProperty("homepage")
    String homepage;

    @JsonProperty("id")
    int id;

    @JsonProperty("imdb_id")
    String imdb_id;

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

    @JsonProperty("production_companies")
    List<ProductionCompany> production_companies;

    @JsonProperty("production_countries")
    List<ProductionCountry> production_countries;

    @JsonProperty("release_date")
    String release_date;

    @JsonProperty("revenue")
    long revenue;

    @JsonProperty("runtime")
    int runtime;

    @JsonProperty("spoken_languages")
    List<SpokenLanguage> spoken_languages;

    @JsonProperty("status")
    String status;

    @JsonProperty("tagline")
    String tagline;

    @JsonProperty("title")
    String title;

    @JsonProperty("video")
    boolean video;

    @JsonProperty("vote_average")
    float vote_average;

    @JsonProperty("vote_count")
    int vote_count;

    public static class BelongsToCollection {
        @JsonProperty("id")
        int id;

        @JsonProperty("name")
        String name;

        @JsonProperty("poster_path")
        String poster_path;

        @JsonProperty("backdrop_path")
        String backdrop_path;
    }

    public static class Genre {
        @JsonProperty("id")
        int id;

        @JsonProperty("name")
        String name;
    }

    public static class ProductionCompany {
        @JsonProperty("id")
        int id;

        @JsonProperty("logo_path")
        String logo_path;

        @JsonProperty("name")
        String name;

        @JsonProperty("origin_country")
        String origin_country;
    }

    public static class ProductionCountry {
        @JsonProperty("iso_3166_1")
        String iso_3166_1;

        @JsonProperty("name")
        String name;
    }

    public static class SpokenLanguage {
        @JsonProperty("english_name")
        String english_name;

        @JsonProperty("iso_639_1")
        String iso_639_1;

        @JsonProperty("name")
        String name;
    }
}