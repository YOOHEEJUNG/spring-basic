package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;

//@Component
//@Repository
@Service("이름") //빈의 이름 명시
//@Controller
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	@Qualifier("YYY")
	private ScoreDAO scoreDAO;
	
	
	public void regist(ScoreVO vo) {
//		System.out.println(vo.toString());
		scoreDAO.regist(vo);
	}


	@Override
	public ArrayList<ScoreVO> getList() {
		
		 
		return scoreDAO.getList();
	}


	@Override
	public void delete(int num) {
		scoreDAO.delete(num);
	}
}
