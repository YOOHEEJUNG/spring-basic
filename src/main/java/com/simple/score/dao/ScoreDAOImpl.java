package com.simple.score.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.simple.command.ScoreVO;


@Repository("YYY")
public class ScoreDAOImpl implements ScoreDAO{

	@Autowired
	private DataSource dataSource;
	
	
	@Override
	public void regist(ScoreVO vo) {
	
		
			String sql = "insert into score(name, kor, eng) values(?,?,?)";
		
			Connection conn = null;
			PreparedStatement pstmt = null;
		
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		
		ArrayList<ScoreVO> list = new ArrayList<>();
		
		String sql = "select * from score order by num desc";
		
		
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			
				ScoreVO vo =  new ScoreVO();
				vo.setNum(rs.getInt("num"));  //컬럼명
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getString("kor"));
				vo.setEng(rs.getString("eng"));
			
				list.add(vo);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
		
	}

	@Override
	public void delete(ScoreVO vo) {
		
		String sql = "delete from score where num=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
	
	
	try {
		conn = dataSource.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, vo.getNum());
		
		pstmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}finally {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
		
	}

	

	
//	//데이터베이스
//	ArrayList<ScoreVO> list = new ArrayList<>();
//	
//	@Override
//	public void regist(ScoreVO vo) {
//		
//		//연결...
//		//connect
//
//
////		System.out.println("DAO영역:" + vo.toString());
//		list.add(vo);
//		System.out.println(list.toString());
//	}
//
//
//
//	@Override
//	public ArrayList<ScoreVO> getList() {
//		// TODO Auto-generated method stub
//		return list;
//	}
//
//
//
//	@Override
//	public void delete(int num) {
//	
//		list.remove(num);
//		
//	}
	
	

	
}
