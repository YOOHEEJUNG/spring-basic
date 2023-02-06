package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //���̹�Ƽ�� ���۸� ��Ī�ϴ� ������̼� (������������ ���� ����)
public interface TestMapper {
	
	public String getTime();  //1
	public ArrayList<ScoreVO> getScore();
	public ScoreVO getOne(int a);
	
	public int insertOne(String name); //���ϰ�
	public int insertTwo(ScoreVO vo);  //���߰�
	public int insertThree(Map<String, String> map); //���߰�
	
	//map => 1�� ��ȸ
	public Map <String, Object> selectMap (int num); // 3�� Ű�� ��ȸ
	//���� ���� ������ ��ȸ
	public ArrayList<Map<String, Object>> selectTwo();

	public boolean updateOne(ScoreVO vo); //update(13�� ������Ʈ)
	
	public void insertFour (@Param("������1") String name, @Param("������2") int kor);

}
