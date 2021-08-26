package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
