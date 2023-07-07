package com.devsupeior.dspesquisa.entities;

import java.io.Serializable;
import java.time.Instant;

public class Record implements Serializable {
    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    private Long id;
    private String name;
    private Integer age;
    private Instant moment;
    private Game game;

    public Record() {
    }

    public Record(Long id, String name, Integer age, Instant moment, Game game) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.moment = moment;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        return id.equals(record.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}