package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.AchatMateriel;

@Repository
public interface AchatMaterielRepository extends JpaRepository<AchatMateriel, Integer>{

}
