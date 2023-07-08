package com.devsupeior.dspesquisa.services;

import com.devsupeior.dspesquisa.dto.RecordDTO;
import com.devsupeior.dspesquisa.dto.RecordInsertDTO;
import com.devsupeior.dspesquisa.entities.Game;
import com.devsupeior.dspesquisa.entities.Record;
import com.devsupeior.dspesquisa.repositories.GameRepository;
import com.devsupeior.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = new Record();
        entity.setMoment(Instant.now());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());

        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);
        entity = repository.save(entity);

        return new RecordDTO(entity);
    }

}
