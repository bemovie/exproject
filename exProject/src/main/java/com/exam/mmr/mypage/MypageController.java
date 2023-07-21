package com.exam.mmr.mypage;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
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
import com.exam.mmr.movie.MovieVo;
import com.exam.mmr.user.UserVo;

@Controller //스프링한테 Controller로 등록하라고 알려줌
public class MypageController {	

	@Autowired //@Resource @Inject 셋중 하나 사용하면 같은 역할
	private MypageService mypageService;
	//spring이 userService 객체를 가지고 있어야 한다
	

	@GetMapping("/mypage/list")
	public String mypagelist(HttpSession session, Model model, String range) {
		UserVo uvo = (UserVo) session.getAttribute("loginUser");
		uvo.setRange(range);
		List<MovieVo> list = mypageService.selectMypageList(uvo);
		model.addAttribute("mypageList", list);
		model.addAttribute("range", range);
		return "mypage/mypageList";
//		return "redirect:/movie/edit?movieId=" + vo.getMovieId();
	}
	
	@GetMapping("/mypage/add")
	public String mypageadd(MypageVo vo, HttpSession session, Model model) {
		UserVo uvo = (UserVo) session.getAttribute("loginUser");
//		String userId = uvo.getUserId();
		vo.setUserId(uvo.getUserId());
		List<MovieVo> list = mypageService.selectMypageList(uvo);
		int condition = 0;
		for (MovieVo a : list) {
			System.out.println(a.getMovieId());
			System.out.println(vo.getMovieId());
			if ( vo.getMovieId().equals(a.getMovieId()) ) {
				condition = 1;
			}
		}
		
		System.out.println(condition);
		if (condition == 0) {
			int n = mypageService.insertMypage(vo);
			System.out.println(n + "편의 영화 등록");			
		}
		else {
			int n = mypageService.updateMypage(vo);
			System.out.println(n + "편의 영화 수정");
		}
		int m = mypageService.updateMoviePoint(vo);
		System.out.println(m + "편의 평점 수정");
		
		model.addAttribute("condition", condition);
		
		return "redirect:/movie/edit?movieId=" + vo.getMovieId() + "&userId=" + vo.getUserId();
	}
	
	@GetMapping("/mypage/edit")
	public String editform(MypageVo vo, Model model) {
		MypageVo mvo = mypageService.selectMypage(vo);
		model.addAttribute("mvo", mvo);
		return "redirect:/movie/edit?movieId=" + vo.getMovieId() + "&userId=" + vo.getUserId();
	}
	
	
	@GetMapping("/mypage/del")
	public String mypagedel(MypageVo vo, HttpSession session) {
		UserVo uvo = (UserVo) session.getAttribute("loginUser");
		vo.setUserId(uvo.getUserId());
		int n = mypageService.deleteMypage(vo);
		return "redirect:/movie/edit?movieId=" + vo.getMovieId() + "&userId=" + vo.getUserId();
	}
	
}




