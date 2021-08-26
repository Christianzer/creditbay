package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {

	
}
