package com.exam.mmr.movie;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class MovieVo {
	
	private String movieId; /* 영화ID */
	private String movieTitle; /* 영화제목 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date release; /* 개봉일 */
	private String nation; /* 제작국가 */
	private String genre; /* 장르 */
	private int runningtime; /* 러닝타임 */
	private String grade; /* 등급 */
	private String outline; /* 줄거리 */
	private String director; /* 감독 */
	private String actor; /* 출연진 */
	private String ott; /* OTT */
	private float moviePoint; /* 평균평점 */
	private int movie_view; /* 영화조회수 */
	
	private int movieCount;
	private int reviewCount;
	
	private String range;
	
	private String fileId; /* 첨부파일ID */
	private MultipartFile posterFile;
	
	private String searchWord;
	
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	
	
	public MultipartFile getPosterFile() {
		return posterFile;
	}
	public void setPosterFile(MultipartFile posterFile) {
		this.posterFile = posterFile;
	}
	
	public int getMovieCount() {
		return movieCount;
	}
	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	
	public Date getRelease() {
		return release;
	}
	public void setRelease(Date release) {
		this.release = release;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunningtime() {
		return runningtime;
	}
	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getOtt() {
		return ott;
	}
	public void setOtt(String ott) {
		this.ott = ott;
	}
	public int getMovie_view() {
		return movie_view;
	}
	public void setMovie_view(int movie_view) {
		this.movie_view = movie_view;
	}
	
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public float getMoviePoint() {
		return moviePoint;
	}
	public void setMoviePoint(float moviePoint) {
		this.moviePoint = moviePoint;
	}
	
}
