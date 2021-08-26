package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Traitements;


@Repository
public interface TraitementsRepository extends JpaRepository<Traitements, Integer> {

}
