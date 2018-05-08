package com.nirmal.medapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {

	public static Connection getDatabase() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmc?autoReconnect=true&useSSL=false", "root", "root");

			return con;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

}