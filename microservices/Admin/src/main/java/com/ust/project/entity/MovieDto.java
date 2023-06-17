package com.ust.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName="build")
public class MovieDto {

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
