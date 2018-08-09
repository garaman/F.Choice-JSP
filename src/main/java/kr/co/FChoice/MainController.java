package kr.co.FChoice;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	
	@RequestMapping(value = "/index.do")
	public String index(HttpSession session) {
		session.setAttribute("Glogin", Globals.isLogin);
		
		return "/index";
	}
	
	@RequestMapping("/")
	public String home() {
		return "forward:/index.do";
	}
	
}
