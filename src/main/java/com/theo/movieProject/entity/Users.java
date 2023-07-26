package com.theo.movieProject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "username")
    private String username;

    @NonNull
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<FavouriteMovie> favouriteMovies;

}
