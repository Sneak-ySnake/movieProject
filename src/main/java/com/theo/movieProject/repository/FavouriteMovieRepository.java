package com.theo.movieProject.repository;

import com.theo.movieProject.entity.FavouriteMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteMovieRepository extends JpaRepository<FavouriteMovie, Integer> {
}
