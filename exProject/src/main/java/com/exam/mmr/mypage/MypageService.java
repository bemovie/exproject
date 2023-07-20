package com.exam.mmr.mypage;

import java.util.List;

import com.exam.mmr.movie.MovieVo;
import com.exam.mmr.user.UserVo;

public interface MypageService {

	List<MovieVo> selectMypageList(UserVo uvo);

	int insertMypage(MypageVo vo);

	int updateMypage(MypageVo vo);

	int updateMoviePoint(MypageVo vo);

	int selectReviewCount();
	
}