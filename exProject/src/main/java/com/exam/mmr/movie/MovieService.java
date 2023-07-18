package com.exam.mmr.movie;

import java.util.List;

public interface MovieService {

	List<MovieVo> selectMovieList(MovieVo vo);

	int insertMovie(MovieVo vo);

	int deleteMovie(String movieId);

	MovieVo selectMovie(String movieId);

	int updateMovie(MovieVo vo);

	MovieVo selectLogin(MovieVo vo);

	int selectMovieCount();
	
}