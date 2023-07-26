package com.theo.movieProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "favourite_movie")
@Getter
@Setter
public class FavouriteMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "favourite_id")
    private int favourite_id;

    @Column(name = "movie_id")
    private int movieId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
