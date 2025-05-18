package com.devsuperior.dspequisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspequisa.dto.RecordDTO;
import com.devsuperior.dspequisa.dto.RecordInsertDTO;
import com.devsuperior.dspequisa.entities.Game;
import com.devsuperior.dspequisa.entities.Record;
import com.devsuperior.dspequisa.repositories.GameRepository;
import com.devsuperior.dspequisa.repositories.RecordRepository;


@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;
	
	@Autowired 
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
	
		Game game = gameRepository.getReferenceById(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);		
	}
}
