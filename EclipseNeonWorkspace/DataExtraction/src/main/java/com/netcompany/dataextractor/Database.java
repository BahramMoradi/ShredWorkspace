package com.netcompany.dataextractor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	static final String USER="";
	static final String PASSWORD="";
	
	static final String DRIVER="com.microsoft.jdbc.sqlserver.SQLServerDriver";
	static final String HOST="";
	static final String PORT="";
	static final String DATABASE="";
	
	private String urlFormat="jdbc:microsoft:sqlserver://%s:%s;DatabaseName=%s"; //args : host, port and databasename
	
	public Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		String url=String.format(urlFormat, HOST,PORT,DATABASE);
		Connection conn=DriverManager.getConnection(url,USER,PASSWORD);
		return conn;
	}
	

}
