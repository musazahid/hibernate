package com.musa.lab6;

import java.sql.*;

public class Connector {
	Connection con;

	public Connector(Configuration config) {
		try {
			con = DriverManager.getConnection(config.getUrl(),config.getUser(), config.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
