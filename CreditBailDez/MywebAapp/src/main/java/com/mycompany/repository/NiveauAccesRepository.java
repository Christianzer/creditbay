package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.NiveauAcces;

@Repository
public interface NiveauAccesRepository extends JpaRepository<NiveauAcces, Integer> {

}
