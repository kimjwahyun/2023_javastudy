package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 박세리의 주소를 대한민국 제주도, 전화번호를 000-9000-0001 로 변경하자
public class Ex06_Statement_update {
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

			String sql = "update customer set address = '대한민국 제주도', phone = '000-9000-0001' where name = '박세리'";
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

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
