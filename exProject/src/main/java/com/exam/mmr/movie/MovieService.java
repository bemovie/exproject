package com.exam.mmr.movie;

import java.util.List;

import com.exam.mmr.mypage.MypageVo;

public interface MovieService {

	List<MovieVo> selectMovieList(MovieVo vo);

	int insertMovie(MovieVo vo);

	int deleteMovie(String movieId);

	MovieVo selectMovie(MypageVo vo);

	int updateMovie(MovieVo vo);

	MovieVo selectLogin(MovieVo vo);

	int selectMovieCount();
	
}