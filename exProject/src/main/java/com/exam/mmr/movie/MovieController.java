package com.exam.mmr.movie;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.exam.mmr.HomeController;
import com.exam.mmr.mypage.MypageService;
import com.exam.mmr.mypage.MypageVo;

@Controller //스프링한테 Controller로 등록하라고 알려줌
public class MovieController {	

	@Autowired //@Resource @Inject 셋중 하나 사용하면 같은 역할
	private MovieService movieService;
	//spring이 MovieService 객체를 가지고 있어야 한다
	
	@Autowired //@Resource @Inject 셋중 하나 사용하면 같은 역할
	private MypageService mypageService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	@GetMapping("/home")
	public String home(MovieVo vo, Locale locale, Model model) {
		logger.info("home 페이지 실행");
		vo.setRange("point");
		List<MovieVo> list = movieService.selectMovieList(vo);
		int mcnt = movieService.selectMovieCount();
		int rcnt = mypageService.selectReviewCount();
		model.addAttribute("movieList", list);
		model.addAttribute("moiveCount", mcnt);
		model.addAttribute("reviewCount", rcnt);
		return "home";
	}
	
	
	
	@GetMapping("/movie/list")
	public String list(MovieVo vo, Model model) {
		List<MovieVo> list = movieService.selectMovieList(vo);
		model.addAttribute("movieList", list);
		model.addAttribute("searchWord", vo.getSearchWord());
		model.addAttribute("range", vo.getRange());		
		return "movie/movieList";
	}
	
	
	
	@GetMapping("/movie/add")
	public String addform() {
		return "movie/movieAdd";
	}
	
	@PostMapping("/movie/add")
	public String add(MovieVo vo) throws Exception {
		System.out.println(vo.getPosterFile().getOriginalFilename());
		int n = movieService.insertMovie(vo);
		System.out.println(n + "편의 영화 등록");
		return "redirect:/movie/list";
	}
	
	
	
	@GetMapping("/movie/edit")
	public String editform(MypageVo vo, Model model) {
		int count = mypageService.selectMypageCount(vo);
		vo.setMypageCount(count);
		MovieVo mvo = movieService.selectMovie(vo);
		model.addAttribute("mvo", mvo);
		model.addAttribute("count", count);
		return "movie/movieEdit";
	}

	@RequestMapping(value = "/movie/edit.do", method = RequestMethod.POST)
	public String edit(MovieVo vo) {
	
//	req.setCharacterEncoding("UTF-8"); //필터로 이동, 필터에 있으니까 필요x
//	MovieVo vo = new MovieVo();
//	vo.setMovieId(req.getParameter("movieId"));
//	vo.setMovieName(req.getParameter("movieName"));
//	vo.setMoviePoint(Integer.parseInt(req.getParameter("moviePoint")));

	int n = movieService.updateMovie(vo); //updateMovie 구현 (MovieDao)
	
	System.out.println(n + "명의 회원 변경");

	//redirect : 지정한 주소로 이동하라는 명령을 담은 응답을 웹브라우저에게 전송
//	resp.sendRedirect(req.getContextPath() + "/movie/list.do"); // 목록 화면으로 이동
	return "redirect:/movie/list.do";
	
	}
	
	//1.삭제기능이 동작하도록 이 메서드 코드를 변경
	//2.회원정보변경 화면에 삭제버튼을 추가
	@RequestMapping(value = "/movie/del.do", method = RequestMethod.GET)
	public String del(String movieId) {
		
//		req.setCharacterEncoding("UTF-8"); //필터로 이동
		//~ 파라미터 값 읽어오기 ~
//		String movieId = req.getParameter("movieId");
		
		int n = movieService.deleteMovie(movieId);
		
		System.out.println(n + "명의 회원 삭제");
		
//		resp.sendRedirect(req.getContextPath() + "/movie/list.do");
		return "redirect:/movie/list.do";
	}
	
	//로그인 동작이 수행되도록 아래 메서드들을 변경
	@RequestMapping(value = "/movie/login.do", method = RequestMethod.GET)
	public String loginform() {
	
		//req.getRequestDispatcher("/WEB-INF/views/movie/login.jsp").forward(req, resp);
		return "movie/login";
	}
	
	
//	@SessionAttribute(name = "sa")
	@RequestMapping(value = "/movie/login.do", method = RequestMethod.POST)
	public String login(MovieVo vo, /*HttpServletRequest req,*/ HttpSession session) {
		
//		MovieVo vo = new MovieVo();
//		vo.setMovieId(req.getParameter("movieId"));
//		vo.setMoviePass(req.getParameter("moviePass"));
		
		MovieVo mvo = movieService.selectLogin( vo ); 
		if (mvo==null) { //로그인 실패시, 로그인 화면으로 이동
//			resp.sendRedirect(req.getContextPath() + "/movie/login.do"); // 로그인 화면으로 이동
			return "redirect:/movie/login.do";
			
		}else { //로그인 성공
//			HttpSession session = req.getSession();
			session.setAttribute("loginUser", mvo); //세션에 로그인한 사용자정보 저장			
//			resp.sendRedirect(req.getContextPath() + "/movie/list.do"); // 회원 목록 화면으로 이동
			return "redirect:/movie/list.do";
		}
	}
	
	@RequestMapping(value = "/movie/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session, @SessionAttribute("loginUSer") MovieVo vo) {
//		HttpSession session = req.getSession(); //현재 사용자의 세션을 가져옴
		session.invalidate(); //세션객체를 제거(후 다시 생성), 모든 속성들도 함께 삭제
		
//		resp.sendRedirect(req.getContextPath() + "/movie/login.do"); // 로그인 화면으로 이동
		return "redirect:/movie/login.do";
	}
}


