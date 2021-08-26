package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.SocieteAcquereuse;

@Repository
public interface SocieteAcquereuseRepository extends JpaRepository<SocieteAcquereuse, Integer>{

}
