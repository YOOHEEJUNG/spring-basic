package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardService;
import com.simple.board.service.BoardServiceImpl;
import com.simple.command.BoardVO;

@Controller
@RequestMapping("/service")
public class BoardServiceController {

	@Autowired
	@Qualifier(" BoardService")
	private BoardService board;
	
	
	// ��� ȭ�� ���
	@RequestMapping("/boardRegister")
	public String registView() {
		return "service/boardRegister";
	}
	
	
	//��� ����
	@RequestMapping(value="/Bregist",  method=RequestMethod.POST)
	public String regist(BoardVO vo){
		
		board.boardRegist(vo);
		
		return "service/boardResult";
		
		
	}
	
	//��� ����
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list=  board.getList();
		model.addAttribute("list", list);
		
		
		return "service/boardList";
		
	}
	
	
	//���� ����
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num) {
		
		board.boardDelete(num);
		
		return "redirect:/service/boardList";
	}
}
