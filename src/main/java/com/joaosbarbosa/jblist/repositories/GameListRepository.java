package com.joaosbarbosa.jblist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosbarbosa.jblist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
