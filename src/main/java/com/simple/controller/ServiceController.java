package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.score.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	//1��
	//ScoreServiceImpl service = new ScoreServiceImpl();

	//2�� - service�� bean���� ���� : ������ü �ڵ�����
	
	//3�� - @Service�� ������ �����ϰ�, ������ü �ڵ� ����
	


	
	@Autowired
	@Qualifier("�̸�")
	private ScoreServiceImpl service;
	
	
	
	
	// ȭ�� ���
	@RequestMapping("/scoreRegist")
	public String registView() {
		return "service/scoreRegist";
	}
	
	//����û
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public String regist(ScoreVO vo) {
		service.regist(vo);
		
//		System.out.println(vo.toString());
		return "service/scoreResult";
	}
	
	//���ȭ��
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		//data ��ȸ
		ArrayList<ScoreVO> list = service.getList();
		model.addAttribute("list", list);
//		System.out.println(list.toString());
		return "service/scoreList";
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("num") int num) {

		service.delete(num);
		return "redirect:/service/scoreList";
	}
}
