package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.CategorieMateriel;

@Repository
public interface CategorieMaterielRepository extends JpaRepository<CategorieMateriel, Integer> {

}
