package com.simple.score.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;


@Repository("YYY")
public class ScoreDAOImpl implements ScoreDAO{

	
	//�����ͺ��̽�
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	
	
	@Override
	public void regist(ScoreVO vo) {

//		System.out.println("DAO����:" + vo.toString());
		list.add(vo);
		System.out.println(list.toString());
	}



	@Override
	public ArrayList<ScoreVO> getList() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public void delete(int num) {
	
		list.remove(num);
		
	}

	
}
