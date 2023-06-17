package com.ust.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName="build")
@Entity
public class Movie {

	@Id
	@GeneratedValue
	
	
	private long movieId;
	private String movieName;
	private String movieDirector;
	private String movieGenre;
	private String movieReleaseDate;
	private String duration;
	private String country;
	private String movieLanguage;
	private double overallRate;
	
}
