package com.devsuperior.dspesquisa.controllers;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @CrossOrigin(origins = "http://localhost:3000") //provisório
    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
