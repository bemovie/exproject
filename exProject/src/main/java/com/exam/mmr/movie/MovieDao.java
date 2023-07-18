package com.exam.mmr.movie;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieDao {

	List<MovieVo> selectMovieList(MovieVo vo);

	int insertMovie(MovieVo vo);

	int deleteMovie(String movieIdv);

	MovieVo selectMovie(String movieId);

	int updateMovie(MovieVo vo);

	MovieVo selectLogin(MovieVo vo);

	int selectMovieCount();
	
}