package com.exam.mmr.mypage;

import java.util.List;

import com.exam.mmr.movie.MovieVo;

public class MypageVo extends MovieVo{
	private String movieId;
	private String userId;
	private String mypageId;
	private int mypagePoint = -1;
	private String mypageComment = "";

	private List<MovieVo> movieList;
	
	public List<MovieVo> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<MovieVo> movieList) {
		this.movieList = movieList;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMypageId() {
		return mypageId;
	}
	public void setMypageId(String mypageId) {
		this.mypageId = mypageId;
	}
	public int getMypagePoint() {
		return mypagePoint;
	}
	public void setMypagePoint(int mypagePoint) {
		this.mypagePoint = mypagePoint;
	}
	public String getMypageComment() {
		return mypageComment;
	}
	public void setMypageComment(String mypageComment) {
		this.mypageComment = mypageComment;
	}
}
