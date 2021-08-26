package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.EtatMateriel;

@Repository
public interface EtatMaterielRepository extends JpaRepository<EtatMateriel, Integer> {

}
