package myjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Students {

	public void createDatabase() {
		 try {
	        	// Database credentials
	        	String jdbcURL = "jdbc:mysql://localhost:3306/"; 
	        	String username = "root"; 
	        	String password = "Shivam@995579"; 
	            // Establishing connection
	            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

	            Statement statement = connection.createStatement();
	     
	            String sql = "create database shivamtest";
	            statement.execute(sql);
	            System.out.println("Database connected Successfully");

	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	public void createTable() {
		// TODO Auto-generated method stub
		
//		System.out.println("new class made");
		 try {
	        	// Database credentials
	        	String jdbcURL = "jdbc:mysql://localhost:3306/shivamtest"; 
	        	String username = "root"; 
	        	String password = "Shivam@995579"; 
	            // Establishing connection
	            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

	            Statement statement = connection.createStatement();
	     
	            String sql = "create table student (sid int (3), sname varchar (200),semail varchar(200))";
	            statement.execute(sql);
	            System.out.println("Table connected Successfully");

	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	}
}
