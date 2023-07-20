package com.exam.mmr.user;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.exam.mmr.HomeController;

@Controller //스프링한테 Controller로 등록하라고 알려줌
public class UserController {	

	@Autowired //@Resource @Inject 셋중 하나 사용하면 같은 역할
	private UserService userService;
	//spring이 userService 객체를 가지고 있어야 한다
	

	@GetMapping("/user/join")
	public String joinForm() {
		return "user/join";
	}
	
	@PostMapping("/user/join")
	public String join(UserVo vo) throws Exception {
		
		int n = userService.joinUser(vo);
		System.out.println(n + "명의 회원 등록");
		return "redirect:/user/login";
	}
	
	@GetMapping("/user/login")
	public String loginForm() {
		return "user/login";
	}
	
	@PostMapping("/user/login")
	public String login(UserVo vo, HttpSession session) {
		
		UserVo uvo = userService.selectLogin(vo);
		if (uvo==null) {	return "redirect:/user/login";	}
		else {	session.setAttribute("loginUser", uvo);
				System.out.println("로그인 성공");
				return "redirect:/movie/list";				}
	}

	@GetMapping("/user/logout")
	public String logout(HttpSession session) {
		session.invalidate(); //세션객체를 제거(후 다시 생성), 모든 속성들도 함께 삭제
		return "user/login";
	}
	
	
}




