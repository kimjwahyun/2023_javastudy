package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statement_delete {
	public static void main(String[] args) {
		// 접속하고 처리하기 위해서 3개의 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##kimjwahyun";
			String passwork = "1111";
			conn = DriverManager.getConnection(url, user, passwork);

			// 이름이 이강인 삭제
			String sql = "delete from customer where name = '이강인'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			sql = "select * from customer order by custid asc";
			// stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (result > 0) {
				while (rs.next()) {
					System.out.print(rs.getString("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");
				}
			} else {
				System.out.println("삭제 실패");
				while (rs.next()) {
					System.out.print(rs.getString("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.print(rs.getString("phone") + "\n");
				}
			}

		} catch (Exception e) {
			System.out.println("제대로된 데이터를 넣어주세요. ");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
