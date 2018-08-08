package kr.co.FChoice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	
	@RequestMapping(value = "/index.do")
	public String index() {
		
		return "/index";
	}
	
	@RequestMapping("/")
	public String home() {
		return "forward:/index.do";
	}
	
}
