package kr.co.FChoice.sub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubController {
	
	@RequestMapping(value="/sub/aboutus.do")
	public String aboutus() {
		return "/sub/aboutus";
	}
	
	@RequestMapping(value="/sub/cart.do")
	public String cart() {
		return "/sub/cart";
	}
	
	@RequestMapping(value="/sub/list.do")
	public String list() {
		return "/sub/list";
	}
	
	@RequestMapping(value="/sub/userinfo.do")
	public String userinfo() {
		return "/sub/userinfo";
	}
	
	@RequestMapping(value="/sub/products.do")
	public String products() {
		return "/sub/products";
	}
	
	@RequestMapping(value="/sub/view.do")
	public String view() {
		return "/sub/view";
	}

}
