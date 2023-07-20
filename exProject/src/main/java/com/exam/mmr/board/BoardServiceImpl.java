package com.exam.mmr.board;

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
public class BoardServiceImpl implements BoardService {
	
	@Autowired //spring에다가 여기에 맞는 객체 주입해달라고 요청
	private BoardDao boardDao;

	@Override
	public List<BoardVo> selectBoardList() {
		return boardDao.selectBoardList();
	}

	@Override
	public int insertBoard(BoardVo vo) throws Exception {
		return boardDao.insertBoard(vo);
	}

	@Override
	public BoardVo selectBoard(String boardId) {
		return boardDao.selectBoard(boardId);
	}

	@Override
	public int updateBoard(BoardVo vo) {
		return boardDao.updateBoard(vo);
	}

	@Override
	public int deleteBoard(String boardId) {
		return boardDao.deleteBoard(boardId);
	}
	
	

}
