package com.rterciotte.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rterciotte.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
