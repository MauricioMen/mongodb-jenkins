package com.ejercicios.controller;


import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicios.model.VideoGame;
import com.ejercicios.repository.VideoGameRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/mongoDB")
public class VideoGameController {

	@Autowired
	private VideoGameRepo gameRepo;
	
	
	@PostMapping(value = "/VideoGame" ,consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Mono<VideoGame> saveVideoGame(@RequestBody VideoGame game){
		return gameRepo.save(game);
	}
	
	@GetMapping(value = "/VideoGame",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Mono<VideoGame> getVideoGameId(@RequestParam("id") String id){
		return gameRepo.findById(id).delayElement(Duration.ofSeconds(3));
	}
	
	@GetMapping(value = "/VideoGames",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<VideoGame> getAllVideoGames(){
		return gameRepo.findAll().delayElements(Duration.ofSeconds(3));
	}
}