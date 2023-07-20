package com.exam.mmr.mypage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.exam.mmr.movie.MovieVo;
import com.exam.mmr.user.UserVo;

@Service //스프링이 자동으로 객체를 만들어서 container에 등록함
public class MypageServiceImpl implements MypageService {
	
	@Autowired //spring에다가 여기에 맞는 객체 주입해달라고 요청
	private MypageDao mypageDao;

	@Override
	public List<MovieVo> selectMypageList(UserVo uvo) {
		return mypageDao.selectMypageList(uvo);
	}

	@Override
	public int insertMypage(MypageVo vo) {
		return mypageDao.insertMypage(vo);
	}

	@Override
	public int updateMypage(MypageVo vo) {
		return mypageDao.updateMypage(vo);
	}

	@Override
	public int updateMoviePoint(MypageVo vo) {
		return mypageDao.updateMoviePoint(vo);
	}

	@Override
	public int selectReviewCount() {
		return mypageDao.selectReviewCount();
	}
	
	

}
