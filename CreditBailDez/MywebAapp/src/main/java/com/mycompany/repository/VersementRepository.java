package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Versement;

@Repository
public interface VersementRepository extends JpaRepository<Versement, Integer> {

}
