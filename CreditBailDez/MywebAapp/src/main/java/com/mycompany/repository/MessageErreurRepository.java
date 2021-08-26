package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.MessageErreurs;

@Repository
public interface MessageErreurRepository extends JpaRepository<MessageErreurs, Integer> {

}
