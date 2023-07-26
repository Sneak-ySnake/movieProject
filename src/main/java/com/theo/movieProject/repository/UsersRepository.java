package com.theo.movieProject.repository;

import com.theo.movieProject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}
