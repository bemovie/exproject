package com.exam.mmr.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {

	List<BoardVo> selectBoardList();

	int insertBoard(BoardVo vo) throws Exception;

	BoardVo selectBoard(String boardId);

	int updateBoard(BoardVo vo);

	int deleteBoard(String boardId);
	
}