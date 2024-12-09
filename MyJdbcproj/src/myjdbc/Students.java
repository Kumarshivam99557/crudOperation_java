package myjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	public void createData() {
		// TODO Auto-generated method stub
		try {
        	// Database credentials
        	String jdbcURL = "jdbc:mysql://localhost:3306/shivamtest"; 
        	String username = "root"; 
        	String password = "Shivam@995579"; 
            // Establishing connection
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "INSERT INTO student (sid,sname,semail) VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
           
           pstm.setInt(1,10);
           pstm.setString(2,"shivam");
           pstm.setString(3, "shivam@gmail.com");
           
     
            pstm.execute();
            System.out.println("Data  inserted Successfully");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	
	
}

	public void readData() {
		// TODO Auto-generated method stub
		try {
        	// Database credentials
        	String jdbcURL = "jdbc:mysql://localhost:3306/shivamtest"; 
        	String username = "root"; 
        	String password = "Shivam@995579"; 
            // Establishing connection
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "Select * from student";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
           
           while(rs.next()) {
        	   System.out.println("id ="+ rs.getInt(1));
        	   System.out.println("id ="+ rs.getString(2));
        	   System.out.println("id ="+ rs.getString(3));
           }
     
            
            System.out.println("read Successfully");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
		
		
	}

