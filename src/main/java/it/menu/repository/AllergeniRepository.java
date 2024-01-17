package it.menu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.AllergeniEntity;

public interface AllergeniRepository  extends JpaRepository<AllergeniEntity,Integer> {
	
	List<AllergeniEntity> findAllergeniEntitiesByLinguaEntity_Sigla(String sigla);

}