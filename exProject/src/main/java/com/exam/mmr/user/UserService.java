package com.exam.mmr.user;

import java.util.List;

public interface UserService {

	int joinUser(UserVo vo);

	UserVo selectLogin(UserVo vo);
	
}