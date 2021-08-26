package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer> {

}
