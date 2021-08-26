package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.OptionAchat;

@Repository
public interface OptionAchatRepository extends JpaRepository<OptionAchat, Integer>{

}
