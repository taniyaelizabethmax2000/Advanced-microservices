package com.ust.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ust.project.entity.Movie;
import com.ust.project.entity.MovieDto;
import com.ust.project.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movierepo;

	public Movie add(MovieDto dto) {
//		Movie movie=Movie.build(0,dto.getMovieName(),dto.getMovieDirector(),
//				dto.getMovieGenre(),dto.getMovieReleaseDate(),dto.getMovieLanguage(),
//				dto.getDuration(),dto.getCountry(),dto.getOverallRate());
		Movie movie=new Movie();
		movie.setMovieName(dto.getMovieName());
		movie.setMovieDirector(dto.getMovieDirector());
		movie.setMovieGenre(dto.getMovieGenre());
		movie.setMovieReleaseDate(dto.getMovieReleaseDate());
		movie.setMovieLanguage(dto.getMovieLanguage());
		movie.setDuration(dto.getDuration());
		movie.setCountry(dto.getCountry());
		movie.setOverallRate(dto.getOverallRate());
		return movierepo.save(movie);
	}

	public List<Movie> view() {
		// TODO Auto-generated method stub
		return movierepo.findAll();
	}

	public Movie fetchById(long movieId) {
		Optional<Movie> op=movierepo.findById(movieId);
		if(op.isPresent()) {
			return op.get();
			}
		return null;
	}

	public Movie update(MovieDto dto,long movieId) {
		Optional<Movie> op = movierepo.findById(movieId);
		Movie temp = null;
		if (op.isPresent()) {
			temp = op.get();
			temp.setMovieName(dto.getMovieName());
			temp.setMovieGenre(dto.getMovieGenre());
			temp.setMovieReleaseDate(dto.getMovieReleaseDate());
			temp.setMovieLanguage(dto.getMovieLanguage());
			temp.setDuration(dto.getDuration());
			temp.setCountry(dto.getCountry());
			temp.setOverallRate(dto.getOverallRate());
			return temp;
		}
		else
			return null;
	}

	public String delete(long movieId) {
		movierepo.deleteById(movieId);
		return "Movie Deleted Successfully";
		
	}
	

}
