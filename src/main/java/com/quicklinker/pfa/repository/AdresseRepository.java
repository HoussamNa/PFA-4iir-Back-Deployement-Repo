package com.quicklinker.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quicklinker.pfa.model.AdresseModel;

@Repository
public interface AdresseRepository  extends JpaRepository<AdresseModel,Integer> {

}
