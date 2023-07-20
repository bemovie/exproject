package com.exam.mmr.board;

import java.util.List;

import com.exam.mmr.movie.MovieVo;

public interface BoardService {

	List<BoardVo> selectBoardList();

	int insertBoard(BoardVo vo) throws Exception;

	BoardVo selectBoard(String boardId);

	int updateBoard(BoardVo vo);

	int deleteBoard(String boardId);
	
}