package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Profil;
@Repository
public interface ProfilRepository extends JpaRepository<Profil, Integer>{

	@Query(value = "select p.id,COUNT(e.id) FROM employe e INNER JOIN profil p on p.id=e.profil_id GROUP BY p.libelle", nativeQuery = true )
	public List<Object> findByTitle();
}
