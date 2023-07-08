package com.devsupeior.dspesquisa.services;

import com.devsupeior.dspesquisa.dto.GameDTO;
import com.devsupeior.dspesquisa.dto.RecordDTO;
import com.devsupeior.dspesquisa.dto.RecordInsertDTO;
import com.devsupeior.dspesquisa.entities.Game;
import com.devsupeior.dspesquisa.entities.Record;
import com.devsupeior.dspesquisa.repositories.GameRepository;
import com.devsupeior.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

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

@Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return repository.findByMoments(minDate,maxDate,pageRequest).map(x -> new RecordDTO(x));
    }
}
