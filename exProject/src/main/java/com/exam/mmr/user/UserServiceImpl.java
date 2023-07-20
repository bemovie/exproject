package com.exam.mmr.user;

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
public class UserServiceImpl implements UserService {
	
	@Autowired //spring에다가 여기에 맞는 객체 주입해달라고 요청
	private UserDao userDao;

	@Override
	public int joinUser(UserVo vo) {
		return userDao.joinUser(vo);
	}

	@Override
	public UserVo selectLogin(UserVo vo) {
		return userDao.selectLogin(vo);
	}
	
	

}
