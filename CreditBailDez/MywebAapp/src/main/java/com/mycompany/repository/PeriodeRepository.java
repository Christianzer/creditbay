package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.models.Periode;


@Repository
public interface PeriodeRepository extends JpaRepository<Periode, Integer> {

}
