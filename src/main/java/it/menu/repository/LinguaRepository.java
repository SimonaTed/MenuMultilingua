package it.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.LinguaEntity;

public interface LinguaRepository extends JpaRepository<LinguaEntity,Integer> {

	LinguaEntity findBySigla (String sigla);
	
}
