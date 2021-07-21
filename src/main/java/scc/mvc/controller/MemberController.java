package scc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import scc.mvc.member.domain.Member;
import scc.mvc.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/loginForm")
	public String loginForm() {	
		return "loginPage";
	}
	
	@GetMapping("/registerForm")
	public String registerForm() {
		return "registerPage";
	}

	@RequestMapping("/register")
	public String register(Member member) {
		memberService.register(member);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Member member) {
		memberService.login(member.getMemberId(), member.getPassword());
		return "index";
	}
	
	
}
