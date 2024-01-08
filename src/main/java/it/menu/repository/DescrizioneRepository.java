package it.menu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.DescrizioneEntity;

public interface DescrizioneRepository extends JpaRepository<DescrizioneEntity,Integer>  {
	
     List<DescrizioneEntity> findDescrizioneEntitiesByLinguaEntity_Sigla(String sigla);

}
