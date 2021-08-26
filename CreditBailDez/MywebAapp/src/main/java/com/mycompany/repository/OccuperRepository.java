package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Occuper;

@Repository
public interface OccuperRepository extends JpaRepository<Occuper, Integer> {

}
