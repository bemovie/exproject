package com.exam.mmr.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.exam.mmr.movie.MovieVo;

public class UserVo extends MovieVo {
	private String userId;		/* 회원ID */
	private String userPass; 	/* 회원PASSWORD */
	private String userName; 	/* 회원이름 */
	private int userPoint;	 	/* 회원포인트 */
	private String email; 		/* 회원E-mail */
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserPoint() {
		return userPoint;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
