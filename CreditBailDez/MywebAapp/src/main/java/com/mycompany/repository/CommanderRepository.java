package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.DemandeDeCredit;


@Repository
public interface CommanderRepository extends JpaRepository<DemandeDeCredit, Integer> {

}
