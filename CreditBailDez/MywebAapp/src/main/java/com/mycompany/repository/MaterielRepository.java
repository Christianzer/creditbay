package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Materiel;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Integer> {

}
