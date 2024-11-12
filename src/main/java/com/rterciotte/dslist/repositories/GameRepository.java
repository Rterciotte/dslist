package com.rterciotte.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rterciotte.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
