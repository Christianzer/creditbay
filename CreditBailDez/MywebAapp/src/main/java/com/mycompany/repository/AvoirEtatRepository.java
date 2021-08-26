package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.AvoirEtat;

@Repository
public interface AvoirEtatRepository extends JpaRepository<AvoirEtat, Integer> {

}
