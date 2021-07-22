package scc.mvc.movie.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,
	generator = "MOVIE_SEQ_GENERATOR")
	private Long movieCode;
	private String movieName;
	private String movieRate;
	private Long movieRunningtime;
	private String movieOpenDate;
	
	private String movieDistribution;
	private Long movieTotalAudience;
	private String movieGenre;
	private Long movieStatus;
	private String movieIntro;
	private String moviePoster;
	
	
	public Movie() {}
	public Movie(Long movieCode, String movieName, String movieRate, Long movieRunningtime, String movieOpenDate,
			String movieDistribution, Long movieTotalAudience, String movieGenre, Long movieStatus, String movieIntro,
			String moviePoster) {
		super();
		this.movieCode = movieCode;
		this.movieName = movieName;
		this.movieRate = movieRate;
		this.movieRunningtime = movieRunningtime; 
		this.movieOpenDate = movieOpenDate;
		this.movieDistribution = movieDistribution;
		this.movieTotalAudience = movieTotalAudience;
		this.movieGenre = movieGenre;
		this.movieStatus = movieStatus;
		this.movieIntro = movieIntro;
		this.moviePoster = moviePoster;
	}
	
	
	public Long getMovieCode() {
		return movieCode;
	}
	public void setMovieCode(Long movieCode) {
		this.movieCode = movieCode;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRate() {
		return movieRate;
	}
	public void setMovieRate(String movieRate) {
		this.movieRate = movieRate;
	}
	public Long getMovieRunningtime() {
		return movieRunningtime;
	}
	public void setMovieRunningtime(Long movieRunningtime) {
		this.movieRunningtime = movieRunningtime;
	}
	public String getMovieOpenDate() {
		return movieOpenDate;
	}
	public void setMovieOpenDate(String movieOpenDate) {
		this.movieOpenDate = movieOpenDate;
	}
	public String getMovieDistribution() {
		return movieDistribution;
	}
	public void setMovieDistribution(String movieDistribution) {
		this.movieDistribution = movieDistribution;
	}
	public Long getMovieTotalAudience() {
		return movieTotalAudience;
	}
	public void setMovieTotalAudience(Long movieTotalAudience) {
		this.movieTotalAudience = movieTotalAudience;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public Long getMovieStatus() {
		return movieStatus;
	}
	public void setMovieStatus(Long movieStatus) {
		this.movieStatus = movieStatus;
	}
	public String getMovieIntro() {
		return movieIntro;
	}
	public void setMovieIntro(String movieIntro) {
		this.movieIntro = movieIntro;
	}
	public String getMoviePoster() {
		return moviePoster;
	}
	public void setMoviePoster(String moviePoster) {
		this.moviePoster = moviePoster;
	}
	
	
}
