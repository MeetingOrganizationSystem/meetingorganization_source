package com.virtusa.integrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConn {
	
	private static DataResource dataResource=new DataResource();

public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	
	//addRoom();
	updateRoom();
//{
//	Class.forName(dataResource.getDriver());
//	Connection connection=DriverManager.getConnection(dataResource.getUrl(),"root",dataResource.getPassword());
//	Statement statement=connection.createStatement();
//
//	ResultSet resultSet= statement.executeQuery("select * from admin");
//	while(resultSet.next())
//	{
//		System.out.println(resultSet.getString("admin_name"));
//	}

	}
/*public static void addRoom() throws ClassNotFoundException, SQLException {
	Class.forName(dataResource.getDriver());
	Connection connection=DriverManager.getConnection(dataResource.getUrl(),"root",dataResource.getPassword());
	PreparedStatement preparedStatement=connection.prepareStatement("insert into admin values(?,?,?)");
	preparedStatement.setInt(1, 600);
	preparedStatement.setString(2, "mehdi");
	preparedStatement.setString(3, "mehdi423");
	int  rows=preparedStatement.executeUpdate();
	if(rows>0) {
		System.out.println("Data su");
	}else {
		System.out.println("not");
	}*/

public static void updateRoom() throws ClassNotFoundException, SQLException {
	Class.forName(dataResource.getDriver());
	Connection connection=DriverManager.getConnection(dataResource.getUrl(),"root",dataResource.getPassword());
	PreparedStatement preparedStatement=connection.prepareStatement("update admin set admin_id=?,admin_name=? where adminUserName=?");
	preparedStatement.setInt(1, 700);
	preparedStatement.setString(2, "shami");
	preparedStatement.setString(3, "zafar123");
	int  rows=preparedStatement.executeUpdate();
	if(rows>0) {
		System.out.println("Data su");
	}else {
		System.out.println("not");
	}
}
}

