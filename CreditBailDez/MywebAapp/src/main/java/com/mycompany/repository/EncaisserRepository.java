package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Encaisser;

@Repository
public interface EncaisserRepository extends JpaRepository<Encaisser, Integer> {

}
