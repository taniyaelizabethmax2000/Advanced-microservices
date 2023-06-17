package com.ust.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.project.entity.Movie;
import com.ust.project.entity.MovieDto;
import com.ust.project.repository.MovieRepository;
import com.ust.project.service.MovieService;

@RestController
@RequestMapping("/1.0/admin")
public class MovieController {
	
	@Autowired
	MovieService movieService;


	@PostMapping("/addAMovie")
	public ResponseEntity<Movie> addAMovie(@RequestBody MovieDto dto) {
//		return ResponseEntity.ok(movierepo.save(dto));
		return ResponseEntity.ok(movieService.add(dto));
	}

	@GetMapping("/viewAllMovies")
	public List<Movie> viewAllMovies() {
		return movieService.view();
	}

	@GetMapping("/get/{movieId}")
	public ResponseEntity<Movie> getById(@PathVariable long movieId) {
		return ResponseEntity.ok(movieService.fetchById(movieId));
	}

	@PutMapping("/updateAMovie/{movieId}")
	public ResponseEntity<Movie> updateMovie(@RequestBody MovieDto dto,@PathVariable long movieId ) {
		return ResponseEntity.ok(movieService.update(dto,movieId));
	}
		

	@DeleteMapping("/deleteAMovie/{movieId}")
	public String deleteMovie(@PathVariable long movieId) {
		
	return	movieService.delete(movieId);
		
	}
	}


