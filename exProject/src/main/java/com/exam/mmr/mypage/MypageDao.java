package com.exam.mmr.mypage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.exam.mmr.movie.MovieVo;
import com.exam.mmr.user.UserVo;

@Mapper
public interface MypageDao {

	List<MovieVo> selectMypageList(UserVo uvo);

	int insertMypage(MypageVo vo);

	int updateMypage(MypageVo vo);

	int updateMoviePoint(MypageVo vo);

	int selectReviewCount();

	int deleteMypage(MypageVo vo);

	MypageVo selectMypage(MypageVo vo);

	int selectMypageCount(MypageVo vo);
	
}