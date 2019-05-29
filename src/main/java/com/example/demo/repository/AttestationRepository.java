package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Attestation;
@Repository
public interface AttestationRepository extends JpaRepository<Attestation, Integer>{

}
