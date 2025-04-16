package com.devsuperior.dspequisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspequisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
