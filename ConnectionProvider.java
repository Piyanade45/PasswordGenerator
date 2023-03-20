package HospitalManagement;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	  static Connection con;
      public static Connection createConnection() {
    	 try {
    		 //Load the Driver
       	    Class.forName("com.mysql.cj.jdbc.Driver");
       	    //create connection
       	    String url = "jdbc:mysql://localhost:3306/hospitalmanagement";
       	    String user ="root";
       	    String password="";
       	    con= DriverManager.getConnection(url,user,password);
       	
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
         return con;	  
      }
}

