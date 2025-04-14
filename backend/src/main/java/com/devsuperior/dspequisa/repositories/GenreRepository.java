package com.devsuperior.dspequisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspequisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>
{

}
