package HospitalManagement;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class HospOperation {
	
	
     public static void insertDoctorToDB() {
    	 
    	
    	 
    	 //jdbc codes 
    	 try {
    		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	 System.out.println("********** ENTER DOCTOR DETAILS *********");
        	 
        	 System.out.println("Enter Doctors First Name: ");
        	 String FirstName = br.readLine();
        	 
        	 System.out.println("Enter Doctors last Name: ");
        	 String LastName = br.readLine();
        	 
        	 System.out.println("Enter Doctors Specialization: ");
        	 String Specialization = br.readLine();
        	 
        	 System.out.println("Enter Doctors Experience: ");
        	 int  Experience = Integer.parseInt(br.readLine());
        	 
        	 System.out.println("Enter Doctors Age: ");
        	 int  Age = Integer.parseInt(br.readLine());
    		 Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
    		 String query = "insert into doctor(FirstName,LastName,Specialization,Experience,Age) values('"+FirstName+"','"+LastName+"','"+Specialization+"','"+Experience+"','"+Age+"')";
    		 
    		 //prepared Statement
    		 PreparedStatement psmt= con.prepareStatement(query);
    		 
    		 //execute
    		 psmt.executeUpdate();
    		 
    		 int row=psmt.executeUpdate();
    			
    			if(row >0) {
    				System.out.println("Doctor Info added Successfully !!!");
    			}
    			else {
    				System.out.println("Somthing Went Wrong");
    			}
    		
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}	
     }

	public static void deleteDoctor() {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
    	 //jdbc codes 
    	 try {
    		 System.out.println("Enter Id you want to delete: ");
    		 
    		 int c = Integer.parseInt(br.readLine());
    		 Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
    		 String query = "Delete from doctor where ID ='"+c+"'  ";
    		 
    		 //prepared Statement
    		 PreparedStatement psmt= con.prepareStatement(query); 		 
    		 
    		 //execute
    		 psmt.executeUpdate();
    		System.out.println("Doctor info Deleted Successfully !!!");
    		
    		
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}
    	 
	}

	public static void showAllDoctors() {
		 
    	 //jdbc codes 
    	 try {
    		
    			Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
    			
    	        String query = "select * from doctor "; 
    			PreparedStatement psmt=con.prepareStatement(query) ;
    			
    			//execute
       		 
       		   ResultSet rs = psmt.executeQuery();
    			
    			while(rs.next())
    			{
    				System.out.println("ID : "+rs.getInt("ID"));
    				System.out.println("FirstName : "+rs.getString("FirstName"));
    				System.out.println("LastName : "+rs.getString("LastName"));
    				System.out.println("Specialization : "+rs.getString("Specialization"));
    				System.out.println("Experience : "+rs.getDouble("Experience"));
    				System.out.println("Age : "+rs.getDouble("Age"));
    				System.out.println("\n============================================\n");
    			}
    		
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}
    	
		
	}
	
	//*************************************************************************

	public static void insertRecpetionistToDB() {
 	
   	 //jdbc codes 
   	 try {
   		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("********** ENTER RECEPTIONIST DETAILS *********");
    	 
    	 System.out.println("Enter Receptionist First Name: ");
    	 String FirstName = br.readLine();
    	 
    	 System.out.println("Enter Receptionist last Name: ");
    	 String LastName = br.readLine();
    	 
    	 System.out.println("Enter Receptionist Experience: ");
    	 int  Experience = Integer.parseInt(br.readLine());
    	 
    	 System.out.println("Enter Receptionist Age: ");
    	 int  Age = Integer.parseInt(br.readLine());
		 Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
		 String query = "insert into Reception(FirstName,LastName,Experience,Age) values('"+FirstName+"','"+LastName+"','"+Experience+"','"+Age+"')";
		 
		 //prepared Statement
		 PreparedStatement psmt= con.prepareStatement(query);
		 
		 //execute
		 psmt.executeUpdate();
		 
		 int row=psmt.executeUpdate();
			
			if(row >0) {
				System.out.println("Receptionist Info added Successfully !!!");
			}
			else {
				System.out.println("Somthing Went Wrong");
			}
		
	 }
	 catch (Exception e) {
		e.printStackTrace();
	}
    }

	public static void deleteRecpetionist() {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
    	 //jdbc codes 
    	 try {
    		 System.out.println("Enter Receptionist Id you want to delete: ");
    		 
    		 int c = Integer.parseInt(br.readLine());
    		 Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
    		 String query = "Delete from Reception where ID ='"+c+"'  ";
    		 
    		 //prepared Statement
    		 PreparedStatement psmt= con.prepareStatement(query); 		 
    		 
    		 //execute
    		 psmt.executeUpdate();
    		System.out.println("Receptionist info Deleted Successfully !!!");
    		
    		
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}
    	 
	}


	public static void showAllRecpetionist() {
		 try {
	    		
 			Connection con = ConnectionProvider.createConnection(); //  refer ConnectionProvider.java
 			
 	        String query = "select * from Reception "; 
 			PreparedStatement psmt=con.prepareStatement(query) ;
 			
 			//execute
    		 
    		   ResultSet rs = psmt.executeQuery();
 			
 			while(rs.next())
 			{
 				System.out.println("ID : "+rs.getInt("ID"));
 				System.out.println("FirstName : "+rs.getString("FirstName"));
 				System.out.println("LastName : "+rs.getString("LastName"));
 				System.out.println("Experience : "+rs.getDouble("Experience"));
 				System.out.println("Age : "+rs.getDouble("Age"));
 				System.out.println("\n============================================\n");
 			}
 		
 	 }
 	 catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
