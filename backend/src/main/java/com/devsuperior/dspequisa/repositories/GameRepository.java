package com.devsuperior.dspequisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspequisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
