package com.exam.mmr.movie;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.mmr.mypage.MypageVo;

@Mapper
public interface MovieDao {

	List<MovieVo> selectMovieList(MovieVo vo);

	int insertMovie(MovieVo vo);

	int deleteMovie(String movieIdv);

	MovieVo selectMovie(MypageVo vo);

	int updateMovie(MovieVo vo);

	MovieVo selectLogin(MovieVo vo);

	int selectMovieCount();
	
}