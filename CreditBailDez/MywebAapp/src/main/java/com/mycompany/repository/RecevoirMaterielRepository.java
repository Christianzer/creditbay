package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.RecevoirMateriel;


@Repository
public interface RecevoirMaterielRepository extends JpaRepository<RecevoirMateriel, Integer> {

}
