package com.ust.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.project.entity.Movie;
import com.ust.project.entity.MovieDto;
import com.ust.project.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movierepo;
	
	
	public Movie createMovie(MovieDto dto) {
		Movie movie=Movie.build(0,dto.getMovieName(), dto.getMovieDirector(),dto.getMovieGenre(),
				dto.getMovieReleaseDate(),	dto.getCountry(),dto.getDuration(),
				dto.getMovieLanguage(),dto.getOverallRate());
		return movierepo.save(movie);
	}
	public Movie getAllMovies() {
		return movierepo.findAll();
	}
}
