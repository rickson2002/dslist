package com.projetoimersao.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoimersao.dslist.entites.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
    

}
