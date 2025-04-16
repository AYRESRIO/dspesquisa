package com.devsuperior.dspequisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspequisa.dto.GameDTO;
import com.devsuperior.dspequisa.entities.Game;
import com.devsuperior.dspequisa.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
		
	}
}
