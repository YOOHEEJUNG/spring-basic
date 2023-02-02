package com.simple.score.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

//service구현체에서 사용할 추상메서드의 모형을 선언
public interface ScoreService {
	public void regist(ScoreVO vo);
	public ArrayList<ScoreVO> getList();
	public void delete(int num);
}
