package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) //junit���� �׽�Ʈȯ���� ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //���۽�ų ������ ��������
public class JDBCMybatis {
	
//	@Autowired
//	SqlSessionFactoryBean sqlSesssionFactory;
//	@Test
//	public void testCode01() {
//		//���̹�Ƽ�� �ٽ� ��ü
//		System.out.println(sqlSesssionFactory);
//	}
	
	
	@Autowired	
	TestMapper testMapper;
	
//	@Test
//	public void testCode02() {
//		
//		String time = testMapper.getTime();
//		System.out.println(time);
//	}
	
//	//select�±��� resultType
//	@Test
//	public void testCode03() {
//		ArrayList<ScoreVO>  list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
//	
//	//�Ű����� - ���ϰ�
//	@Test
//	public void testCode04() {
//		ScoreVO vo = testMapper.getOne(14);
//		System.out.println(vo.toString());
//	}

	
	//insert - ���ϰ�
//	@Test
//	public void testCOde05() {
//		int result = testMapper.insertOne("�̼���");
//		System.out.println("����/����:" + result);
//	}
//	
	
//	//insert - ���߰�(setter��)
//	
//	@Test
//	public void testCode06() {
//		
//		ScoreVO vo = new ScoreVO(0, "�׽�Ʈ", "34", "100");
//		int result = testMapper.insertTwo(vo);
//		System.out.println("����/����:" + result);
//	}
//	
	//insert - ���߰�(Map) : key���� �Ķ���Ͱ� �ȴ�
	
//	@Test
//	public void testCode07() {
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("name", "ȫ����");
//		map.put("kor", "30");
//		map.put("eng", "40");
//		
//		int result = testMapper.insertThree(map);
//		System.out.println("����/����:" + result);
//	}
	
	
//	//select - mapŸ���� ��ȯ
//	@Test
//	public void testCode08() {
//		Map<String, Object> map = testMapper.selectMap(13);
//		System.out.println(map.toString());
//	}
//	
//	//select - mapŸ���� ��ȯ: �� Ÿ���� ����ϴ� ���� �ε����� ��츸 ���
//	@Test
//	public void testCode09() {
//		ArrayList<Map<String, Object>> list = testMapper.selectTwo();
//		System.out.println(list.toString());
//	}
//	
	
//	//update ����
//	@Test
//	public void testCode10() {
//
//		ScoreVO vo = new ScoreVO(13, "����", "100", "100");
//		boolean result = testMapper.updateOne(vo);
//		System.out.println("����/����:" + result);
//	}
//	
	//insert���� @param - �Ű������� 2�� �̻��� �� �Ű�����
	@Test
	public void testCode11() {
		testMapper.insertFour("�Ķ��׽�Ʈ", 100);
	}
	
	
	
}
