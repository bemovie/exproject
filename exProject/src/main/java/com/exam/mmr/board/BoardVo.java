package com.exam.mmr.board;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardVo {
	
	private String boardId; /* 게시글ID */
	private String boardWriter; /* 사용자ID */
	private String boardTitle; /* 게시글제목 */
	private String boardContent; /* 게시글내용 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date boardDate;/* 작성일 */
	private String noticeAt; /* 공지여부 */
	private String othbcAt; /* 공개여부 */
	private String useAt; /* 사용여부 */
	int boardView; /* 게시글조회수 */
	
	private String boardCategory;
	
	public String getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}
	
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getNoticeAt() {
		return noticeAt;
	}
	public void setNoticeAt(String noticeAt) {
		this.noticeAt = noticeAt;
	}
	public String getOthbcAt() {
		return othbcAt;
	}
	public void setOthbcAt(String othbcAt) {
		this.othbcAt = othbcAt;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
	public int getBoardView() {
		return boardView;
	}
	public void setBoardView(int boardView) {
		this.boardView = boardView;
	}
	
}
