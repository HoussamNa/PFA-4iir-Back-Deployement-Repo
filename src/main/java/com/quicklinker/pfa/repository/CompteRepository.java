package com.quicklinker.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicklinker.pfa.model.CompteModel;

@Repository
public interface CompteRepository extends JpaRepository<CompteModel,Integer> {

}
