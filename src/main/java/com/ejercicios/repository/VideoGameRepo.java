package com.ejercicios.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ejercicios.model.VideoGame;

@Repository
public interface VideoGameRepo extends ReactiveMongoRepository<VideoGame, String> {
	
	

}
