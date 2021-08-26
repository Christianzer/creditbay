package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Concerner;

@Repository
public interface ConcernerRepository extends JpaRepository<Concerner, Integer> {

}
