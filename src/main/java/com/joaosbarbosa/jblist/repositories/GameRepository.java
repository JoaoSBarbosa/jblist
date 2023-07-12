package com.joaosbarbosa.jblist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosbarbosa.jblist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
