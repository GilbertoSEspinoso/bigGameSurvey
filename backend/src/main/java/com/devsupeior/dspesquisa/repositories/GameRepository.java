package com.devsupeior.dspesquisa.repositories;

import com.devsupeior.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
