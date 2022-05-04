package com.bridgeLaz.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;


public class Bankuser_details {
public static Connection connection=null;
	public static void main(String[] args) throws  SQLException  {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String URL="jdbc:mysql://localhost:3307/bank";
String username="root";
String password="Shivaleela@123";
connection= DriverManager.getConnection(URL, username, password);
java.sql.Statement st=  connection.createStatement();
ResultSet rs=  st.executeQuery("select username from bank_details where Total_ammount>=5000;");
rs.next();
String Total_avgAmmount=rs.getString("Total_amount");
System.out.println(Total_avgAmmount);
}
	}


