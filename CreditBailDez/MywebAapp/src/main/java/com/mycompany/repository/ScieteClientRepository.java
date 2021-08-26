package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.ScieteClient;


@Repository
public interface ScieteClientRepository extends JpaRepository<ScieteClient, Integer>{

}
