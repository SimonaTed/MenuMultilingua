package it.menu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.StrutturaEntity;

public interface StrutturaRepository extends JpaRepository<StrutturaEntity,Integer> {

	List<StrutturaEntity> findStrutturaEntitiesByDescrizioni_LinguaEntity_Sigla(String sigla);
	
}
