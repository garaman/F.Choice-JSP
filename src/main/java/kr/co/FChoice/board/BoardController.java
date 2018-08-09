package kr.co.FChoice.board;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.co.FChoice.vo.BoardVO;
import kr.co.FChoice.vo.FileVO;
import kr.co.FChoice.vo.MemberVO;
import kr.co.FChoice.vo.PageVO;


@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/board/list.do")
	public String list(HttpSession session, Model model, HttpServletRequest request) {
		
		String cat = request.getParameter("cat");
		String pg = request.getParameter("pg");
		BoardVO bvo = new BoardVO();
		PageVO pvo = service.page(pg,cat);
		
		bvo.setFc_cat(cat);
		bvo.setLimit(pvo.getLimit());
		
		List<BoardVO> list = service.list(bvo);
		int total = pvo.getTotal();
		
		for(BoardVO t:list) {
			int comment = service.renew(t.getFc_seq());
			t.setFc_comment(comment);
			t.setTotal(total);
			total--;
			}
		
		model.addAttribute("list", list);
		model.addAttribute("page", pvo);
		model.addAttribute("cat", cat);
		return "/board/list";
	}
	
	@RequestMapping(value="/board/write.do")
	public String write(HttpServletRequest request, Model model) {
		String cat = request.getParameter("cat");
		model.addAttribute("cat", cat);
		return "/board/write";		
	}
	
	
	@RequestMapping(value="/board/write.do", method=RequestMethod.POST)
	public String write(BoardVO bvo, HttpServletRequest request, HttpSession session) throws Exception{
		String cat = request.getParameter("cat");
		
		//서버상의 프로젝트 실제 경로 
		String path = request.getSession().getServletContext().getRealPath("/");
		
		//파일업로드
		MultipartFile file = bvo.getFileName();	
		
		if(!file.isEmpty()) {
			bvo.setFc_file(1);
		}
		System.out.println("cat: "+cat);
		MemberVO user = (MemberVO)session.getAttribute("user");
		bvo.setFc_parent(0);
		bvo.setFc_cat(cat);		
		bvo.setFc_id(user.getFc_id());
		bvo.setFc_ip(request.getRemoteAddr());
		
		int seq = service.write(bvo);
		
		if(bvo.getFc_file() == 1) {
			String oName = file.getOriginalFilename();
			int idx = oName.lastIndexOf(".");
			String ext = oName.substring(idx);
			String uName = UUID.randomUUID()+"."+ext;
			file.transferTo(new File(path+"resources/upload/"+uName));
			
			FileVO fvo = new FileVO();
			fvo.setFcf_parent(bvo.getFc_seq());
			fvo.setFcf_oldName(oName);
			fvo.setFcf_newName(uName);
			fvo.setFcf_path(path);
			service.fileupload(fvo);		
		}
		
		
		return "redirect:/board/list.do";		
	}
	
	@RequestMapping(value="/board/view.do")
	public String view(HttpServletRequest request, Model model) {
		String pg = request.getParameter("pg");
		String seq = request.getParameter("seq");
		String cat = request.getParameter("cat");
		
		int sq = Integer.parseInt(seq);
		
		BoardVO bvo = service.view(sq);
		List<BoardVO> co = service.commentview(sq);
		service.hit(sq);
		FileVO fvo = new FileVO();

		if(bvo.getFc_file() == 1) {
			fvo = service.fileDown(sq);
		}
		
		model.addAttribute("file", fvo);
		model.addAttribute("view", bvo);
		model.addAttribute("comment", co);
		model.addAttribute("pg", pg);
		model.addAttribute("cat", cat);
		return "/board/view";
	}
	
	@RequestMapping(value="/board/delete.do")
	public String delete(HttpServletRequest request) {
		String pg = request.getParameter("pg");
		String seq = request.getParameter("seq");
		String cat = request.getParameter("cat");
		int sq = Integer.parseInt(seq);
		
		service.delete(sq);
		
		return "redirect:/board/list.do?pg="+pg+"&cat="+cat;
	}
	
	@RequestMapping(value="/board/modify.do")
	public String modify(HttpServletRequest request,Model model) {
		String pg = request.getParameter("pg");
		String seq = request.getParameter("seq");
		String cat = request.getParameter("cat");
		int sq = Integer.parseInt(seq);
		
		BoardVO bvo = service.view(sq);
		model.addAttribute("modify", bvo);
		model.addAttribute("pg", pg);
		model.addAttribute("cat", cat);
		
		return "/board/modify";		
	}
	
	@RequestMapping(value="/board/modify.do", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, BoardVO mo) {
		String pg = request.getParameter("pg");
		String seq = request.getParameter("seq");
		String cat = request.getParameter("cat");
		int sq = Integer.parseInt(seq);
		mo.setFc_seq(sq);
		
		service.modify(mo);
		
		return"redirect:/board/list.do?pg="+pg+"&cat="+cat;
	}
	
	
	@RequestMapping(value="/board/comment.do", method=RequestMethod.POST)
	public String comment(HttpServletRequest request, BoardVO co, HttpSession session) {
		String pg = request.getParameter("pg");
		String com = request.getParameter("commenttxt");
		String cat = request.getParameter("cat");
		co.setFc_content(com);
		
		MemberVO user = (MemberVO)session.getAttribute("user");
		co.setFc_id(user.getFc_id());
		co.setFc_ip(request.getRemoteAddr());		
		
		service.comment(co);
				
		return "redirect:/board/view.do?pg="+pg+"&seq="+co.getFc_seq()+"&cat="+cat;
	}
	

}
