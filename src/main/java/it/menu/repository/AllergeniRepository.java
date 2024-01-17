package it.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.AllergeniEntity;
import it.menu.entity.LinguaEntity;

public interface AllergeniRepository  extends JpaRepository<AllergeniEntity,Integer> {

}
