package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;
import com.simple.command.Quiz03VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	// 1번 화면
	@RequestMapping("/quiz01") // 입력 경로
	public String quiz01() {
		return "quiz/quiz01"; // 출력 경로
	}

	@RequestMapping("/sendBirth")
	public String quiz01_ok(@ModelAttribute("birth") Quiz01VO vo) {
		System.out.println(vo.toString());
		
		return "quiz/quiz01_ok";
	}

	// 2번 화면
	@RequestMapping("/quiz02") // 입력 경로
	public String quiz02() {
		return "quiz/quiz02"; // 출력 경로
	}
	
	
	@RequestMapping("/join")
	public String quiz02_ok(@ModelAttribute("join") Quiz02VO vo) {
		
		System.out.println(vo.toString());
		
		return "quiz/quiz02_ok";
	}
		
	// 3번 화면
	@RequestMapping("/res_quiz01") // 입력 경로
	public String quiz03() {
		return "quiz/quiz03"; // 출력 경로
	}
	

	
	@RequestMapping("/join2")
	public String quiz03_ok(@ModelAttribute("join2") Quiz03VO vo,
							RedirectAttributes re) {
		
		if(vo.getId() == "") {
			re.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/res_quiz01";
		}else if(!vo.getPw().equals(vo.getPw_check())){
			re.addFlashAttribute("msg", "비밀번호를 입력하세요");
			return "redirect:/quiz/res_quiz01";
		}else if(vo.getPw().equals(vo.getPw_check())) {
			return "quiz/quiz03_ok";
			
		}
		
		return "redirect:/quiz/res_quiz01";
	
	}
}
