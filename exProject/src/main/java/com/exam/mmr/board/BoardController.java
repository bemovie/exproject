package com.exam.mmr.board;

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
import com.exam.mmr.movie.MovieVo;
import com.exam.mmr.mypage.MypageService;
import com.exam.mmr.user.UserVo;

@Controller //스프링한테 Controller로 등록하라고 알려줌
public class BoardController {	

	@Autowired //@Resource @Inject 셋중 하나 사용하면 같은 역할
	private BoardService boardService;
	//spring이 MovieService 객체를 가지고 있어야 한다
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	@GetMapping("/board/list")
	public String home(Model model) {
		logger.info("community 페이지 실행");
		List<BoardVo> list = boardService.selectBoardList();
		model.addAttribute("boardList", list);
		return "board/boardList";
	}
	
	
	
	@GetMapping("/board/add")
	public String addform() {
		return "board/boardAdd";
	}
	
	@PostMapping("/board/add")
	public String add(BoardVo vo, HttpSession session) throws Exception {
		UserVo uvo = (UserVo) session.getAttribute("loginUser");
		vo.setBoardWriter( uvo.getUserId() );
		int n = boardService.insertBoard(vo);
		System.out.println(n + "편의 게시글 등록");
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/edit")
	public String editform(String boardId, Model model) {
		BoardVo vo = boardService.selectBoard(boardId);
		model.addAttribute("bvo", vo);
		return "board/boardEdit";
	}
	
	@PostMapping("/board/edit")
	public String edit(BoardVo vo) {
		int n = boardService.updateBoard(vo);
		System.out.println(n + "건의 게시글 변경");
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/del")
	public String del(String boardId) {
		int n = boardService.deleteBoard(boardId);
		System.out.println(n + "건의 게시글 삭제");
		return "redirect:/board/list";
	}
	
}


