package kr.co.FChoice.member;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.FChoice.vo.MemberVO;
import kr.co.FChoice.vo.Member_sellerVO;
import kr.co.FChoice.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login.do")
	public String login() {
		return "/member/login";
	}
	
	@RequestMapping(value="/member/register.do")
	public String register() {
		return "/member/register";
	}
	
	@RequestMapping(value="/member/register.do", method=RequestMethod.POST)
	public String register(MemberVO mvo, Member_sellerVO msvo, HttpServletRequest request) {
		
		mvo.setFc_ip(request.getRemoteAddr());
		switch(mvo.getFc_seller()) {
		case 0:
			service.register_user(mvo);
			break;
		case 1:
			msvo.setFcs_id(mvo.getFc_id());
			service.register_company(msvo);
			service.register_user(mvo);
			break;
		}
		
		return "redirect:/index.do";
	}
	
	@RequestMapping(value="/member/terms.do")
	public String terms(Model model) {
		TermsVO tvo = service.terms();
		
		model.addAttribute("tvo", tvo);
		
		return "/member/terms";
	}
}
