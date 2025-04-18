package com.devsuperior.dspequisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspequisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>
{

}
