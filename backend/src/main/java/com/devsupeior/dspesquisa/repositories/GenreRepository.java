package com.devsupeior.dspesquisa.repositories;

import com.devsupeior.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GenreRepository extends JpaRepository<Genre, Long> {
}
