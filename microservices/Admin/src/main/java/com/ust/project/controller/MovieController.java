
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
	MovieRepository movierepo;

	@Autowired
	private MovieService movieservice;
	
	@PostMapping("/addAMovie")
	public ResponseEntity<Movie> addAMovie(@RequestBody MovieDto dto) {
		
		return ResponseEntity.ok(movieservice.createMovie(dto));
		//return ResponseEntity.ok(movierepo.save(dto));
	}

	@GetMapping("/viewAllMovies")
	public List<<Movie>> viewAllMovies() {
		//return movierepo.findAll();
		return ResponseEntity.ok(movieservice.getAllMovies());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<MovieDto> getById(@PathVariable int id) {
		return movierepo.findById(id);
	}

	@PutMapping("/updateAMovie")
	public ResponseEntity<MovieDto> updateMovie(@RequestBody MovieDto dto) {
		Optional<MovieDto> op = movierepo.findById(dto.getMovieId());
		MovieDto temp = null;
		if (op.isPresent()) {
			temp = op.get();
			temp.setMovieName(dto.getMovieName());
			temp.setMovieGenre(dto.getMovieGenre());
			temp.setMovieReleaseDate(dto.getMovieReleaseDate());
			temp.setMovieLanguage(dto.getMovieLanguage());
			temp.setDuration(dto.getDuration());
			temp.setCountry(dto.getCountry());
			temp.setOverallRate(dto.getOverallRate());
			return ResponseEntity.ok(temp);
		}
		else
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
		

	@DeleteMapping("/deleteAMovie/{id}")
	public String deleteMovie(@PathVariable int id) {
		movierepo.deleteById(id);
		return "Movie Deleted..";
	}
	}


