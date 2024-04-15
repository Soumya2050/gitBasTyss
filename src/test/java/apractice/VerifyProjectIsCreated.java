package apractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;



public class VerifyProjectIsCreated {
	
	@Test(priority = 1)
	public  void verifyProjectIsCreated() throws SQLException {
		
		Connection conn=null;
		String empName = "Trisulam";
		try {
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/soumya","soumya","Soumya@2050");
			Statement statement=conn.createStatement();
			String query="select * from emp";
			ResultSet result=statement.executeQuery(query);
			boolean flag=false;
			while(result.next()) {
				String value=result.getString(1);
				if (value.equalsIgnoreCase(empName)) {
					System.out.println("Project is created");
					flag=true;
					break;
				}				
			}
			if (!flag) {
				System.out.println("Project is NOT created");
			}					
		} 
		finally {
			conn.close();
		}
		System.out.println("<----------------------------------------->");
	}
	@Test(priority = 2)
	public void fetchDataIntoDB() throws SQLException {
		Connection con=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement stmt=con.createStatement();
			String query="Select * from emp";
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5)+"\t"+result.getInt(6));
			}
		} finally {
			con.close();
		}
		System.out.println("<----------------------------------------->");
	}
	@Test(priority = 3)
	public void insertDataIntoDB() throws SQLException {
		Connection con=null;
		try {
			
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/soumya","soumya","Soumya@2050");
			Statement stmt=con.createStatement();
			String query= "insert into emp values('sobhan',104,45000,756325548)";
			int result=stmt.executeUpdate(query);
			if(result==1)
			{
				System.out.println("Data is Insert successfully");
			}else
				System.out.println("Data is not Insert successfully");
			
		} finally {
			
		}
		System.out.println("<----------------------------------------->");

	}
	@Test(priority = 4)
	public void FetchDataIntoDATAbase() throws SQLException {
		
		Connection con=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/soumya","soumya","Soumya@2050");
			Statement stmt=con.createStatement();
			String query="Select * from emp ;";
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println(result.getString(1)+"\t"+result.getInt(2)+"\t"+result.getInt(3)+"\t"+result.getInt(4));
			}
		} finally {
			con.close();
		}
		System.out.println("<----------------------------------------->");

	}
	

}
