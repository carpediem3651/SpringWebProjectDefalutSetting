package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	@Test
	public void testConnection()throws Exception {
		
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//데이터 베이스 이름과 비밀번호에 따라 설정 값이 달라짐.
		Connection con =
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","projectpractice","projectpractice");
		
		log.info(con);
		
		con.close();
	}
}
