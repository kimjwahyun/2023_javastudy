package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// customer 테이블에서 박씨 성을 가진 사람의 모든 정보 검색하자.

public class Ex03_Statement_select {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##kimjwahyun";
			String passwork = "1111";

			conn = DriverManager.getConnection(url, user, passwork);

			// customer 테이블에서 박씨 성을 가진 사람의 모든 정보 검색하자.
			String sql = "select * from customer where name like '박%' ";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
