package it.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

}
