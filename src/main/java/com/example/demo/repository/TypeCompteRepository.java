package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.TypeCompte;
@Repository
public interface TypeCompteRepository extends JpaRepository<TypeCompte, Integer>{

}
