package HospitalManagement;

import java.io.BufferedReader;
import java.util.*;
import java.util.Map.Entry;
import java.io.IOException;
import java.io.InputStreamReader;


public class Startapp extends User {


	public  void getLogin() throws IOException{
   	 HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
   	 
        //Validate Login Information 
   	 int x=1;
   	 do {
   		 try {
   			 
   			 data.put(987654321, 9908);
   			 data.put(123456789,1210);
   			 
   			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   			 System.out.println("Welcome to the Hospital Management Project !!!");
   			 
   			 System.out.println("Enter Your User Number :");
				 int number = Integer.parseInt(br.readLine());
				 setUser(number);
   			 
   			 System.out.println("Enter Your Password :");
				 int pin = Integer.parseInt(br.readLine());
				 setPassword(pin); 
   		 }
   		 catch(Exception e){
   			 System.out.println("Invalid Characters Only Numbers.");
   			 x=2;
   		 }	
   		 
   		 for(Entry<Integer, Integer> entry : data.entrySet()) {
   			 if(entry.getKey()== getUser()  && entry.getValue()== getPassword()) {
   				main();
   			 }
		      }
   	 }while(x==1);
   	 
     }

	
	public  void main() throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("Press 1 to Administrator Login");
			System.out.println("Press 2 to Doctor Login");
			System.out.println("Press 3 to  Patient Login / Registration");
			System.out.println("Press 4 to  Receptionist Login");
			System.out.println("Press 5 to exit app");
			
			int c =  Integer.parseInt(br.readLine());
			
			if (c==1){
				
				//Administrator Login
				System.out.println("**** ADMIN OPERATIONS ****");
				System.out.println("Press 1 to Register a Doctor");
				System.out.println("Press 2 to  Delete Doctor Info");
				System.out.println("Press 3 to  List Registered Doctors");
				System.out.println("Press 4 to  Add Receptionist");
				System.out.println("Press 5 to Delete Receptionist");
				System.out.println("Press 6 to List Receptionists");
				System.out.println("Press 7 to Logout");
				c =  Integer.parseInt(br.readLine());
				
				if(c==1) {
					//Register a Doctor
					HospOperation.insertDoctorToDB();
				}
				else if(c==2) {
					//Delete Doctor Info	
				
					HospOperation.deleteDoctor();
				}
				else if(c==3) {
					// List Registered Doctors
					HospOperation.showAllDoctors();
				}
				else if(c==4) {
					//Add Receptionist
					HospOperation.insertRecpetionistToDB();
					
				}
				else if(c==5) {
					//Delete Receptionist
					HospOperation.deleteRecpetionist();
					
				}
				else if(c==6) {
					//List Receptionists
					HospOperation.showAllRecpetionist();
				}
				else if (c==7) {
					//logout
					break;
				}
				else {
					System.out.println("Enter Valid Option");
				}
				
			}
			else if(c==2) {
				//Doctor Login
				
				
			}
			else if(c==3) {
				//Patient Login / Registration
			}
			else if(c==4) {
				//Receptionist Login
				
			}
			else if(c==5) {
				//exit
				break;
			}
			else {
				System.out.println("Enter Valid Option");
			}
		}
		
		System.out.println("Thank You For Using My Application");
	}
}
