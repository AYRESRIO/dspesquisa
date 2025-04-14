package com.devsuperior.dspequisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspequisa.entities.Record;


public interface RecordRepository extends JpaRepository<Record,Long>
{

}
