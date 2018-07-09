package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon() throws ClassNotFoundException, SQLException
{
	Connection con=null;
	try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclmhbm","scott","tiger");
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");


		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
