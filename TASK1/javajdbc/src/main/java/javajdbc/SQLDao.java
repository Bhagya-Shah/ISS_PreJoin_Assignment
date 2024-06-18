package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SQLDao {
	private static final String jdbcUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=registerDB;encrypt=true;trustServerCertificate=true;user=user45;password=@ISS2024";

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(jdbcUrl);
	}

	// CREATE operation
	private static void createMember(String uname, String password, String email, String phone) {
		String sql = "INSERT INTO member (uname, password, email, phone) VALUES (?, ?, ?, ?)";

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, phone);

			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rowsAffected);

		} catch (SQLException e) {
			System.err.println("Error during INSERT operation.");
			e.printStackTrace();
		}
	}

	// READ operation
	private static void readMembers() {
		String sql = "SELECT * FROM member";

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			System.out.println("Members:");
			while (resultSet.next()) {
				String uname = resultSet.getString("uname");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");
				System.out.println(
						"uname: " + uname + ", password: " + password + ", Email: " + email + ", phone: " + phone);
			}
			connection.close();

		} catch (SQLException e) {
			System.err.println("Error during SELECT operation.");
			e.printStackTrace();
		}
	}

	// UPDATE operation
	private static void updateMember(String uname, String password, String email, String phone) {
		String sql = "UPDATE member SET password = ?, email = ?, phone = ? WHERE uname = ?";

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, password);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, phone);
			preparedStatement.setString(4, uname);

			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Rows updated: " + rowsAffected);
			connection.close();
		} catch (SQLException e) {
			System.err.println("Error during UPDATE operation.");
			e.printStackTrace();
		}
	}

	// DELETE operation
	private static void deleteMember(String uname) {
		String sql = "DELETE FROM member WHERE uname = ?";

		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, uname);

			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Rows deleted: " + rowsAffected);
			connection.close();
		} catch (SQLException e) {
			System.err.println("Erroe DELETE operation.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// String jdbcUrl =
		// "jdbc:sqlserver://DESKTOP-NGN9O5V\\SQLEXPRESS:1433;databaseName=RegisterDB;integratedSecurity=true";
		// String user = "user45";
		// String password = "@ISS2024";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// CRUD
			createMember("bhagya45", "@ISS24", "bhagya@iss.com", "9321641511");
			createMember("ankit11", "@ISS24", "ankita@iss.com", "1234567890");
			createMember("ariyan33", "@ISS24", "ariyan@iss.com", "9876543210");
			createMember("vivek18", "@ISS24", "vivek@iss.com", "8901234567");
			readMembers();
			updateMember("ariyan33", "@ISS2025", "ariyan@gmail.com", "9898765432");
			readMembers();
			deleteMember("vivek18");
			readMembers();

		} catch (ClassNotFoundException e) {
			System.err.println("SQL Server JDBC Driver not found.");
			e.printStackTrace();
		}
	}
}
