package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Prelever;

@Repository
public interface PreleverRepository extends JpaRepository<Prelever, Integer>{

}
