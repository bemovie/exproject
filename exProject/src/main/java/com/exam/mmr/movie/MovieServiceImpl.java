package com.exam.mmr.movie;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service //스프링이 자동으로 객체를 만들어서 container에 등록함
public class MovieServiceImpl implements MovieService {
	
	@Autowired //spring에다가 여기에 맞는 객체 주입해달라고 요청
	private MovieDao movieDao;
	
	@Value("${bbs.upload.path}")
	private String uploadPath; 
//	"C:/eGovFrame-4.0.0/worksapce.project/exProject/src/main/webapp/resources/upload"
	
	@PostConstruct //스프링이 현재 객체의 초기화 작업이 완료된 후 실행
	public void init( ) {
		new File(uploadPath).mkdirs(); //uploadPath 디렉토리가 없으면 생성
	}
	
	
	
	@Override
	public List<MovieVo> selectMovieList(MovieVo vo) {
		return movieDao.selectMovieList(vo);
	}

	@Override
	public int insertMovie(MovieVo vo) {
		MultipartFile pf = vo.getPosterFile();
		if ( pf.getSize() > 0) {
			System.out.println("파일명 : " + pf.getOriginalFilename());
			System.out.println("파일크기 : " + pf.getSize() );
			
			String fname = null; 
			File saveFile = null;
			do {
				fname = UUID.randomUUID().toString() + pf.getOriginalFilename().substring(pf.getOriginalFilename().lastIndexOf(".")); //중복될 확률이 극도로 낮은 랜덤 문자열 생성
				saveFile = new File(uploadPath, fname);
			} while ( saveFile.exists() ); // 낮은 확률이겠지만, 존재하면 돌아가고, 존재안하면 빠져나옴
			
			try {
				pf.transferTo(saveFile); //파일 pf의 내용을 saveFile에 복사(저장)
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			} 
			vo.setFileId(fname); //첨부 파일 저장 이름
		}
		return movieDao.insertMovie(vo);
	}

	@Override
	public int deleteMovie(String movieId) {
		return movieDao.deleteMovie(movieId);
	}

	@Override
	public MovieVo selectMovie(String movieId) {
		return movieDao.selectMovie(movieId);
	}

	@Override
	public int updateMovie(MovieVo vo) {
		return movieDao.updateMovie(vo);
	}

	@Override
	public MovieVo selectLogin(MovieVo vo) {
		return movieDao.selectLogin(vo);
	}

	@Override
	public int selectMovieCount() {
		return movieDao.selectMovieCount();
	}

}
