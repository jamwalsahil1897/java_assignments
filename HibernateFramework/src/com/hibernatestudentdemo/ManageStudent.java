package com.hibernatestudentdemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;

import com.studentservice.StudentService;

public class ManageStudent {
	public static void main(String[] args) {
		
		StudentService studentservice = new StudentService();
		
		//adding the student records
		 Integer studentID1 = studentservice.addStudent("Sahil", "Delhi", "9871976034");
		 Integer studentID2 = studentservice.addStudent("Rajan", "UP", "9871632456");
		 Integer studentID3 = studentservice.addStudent("Vivek", "Noida", "7673457234");
		 
		 List<Integer> listInfo = new ArrayList<Integer>();
		 listInfo.add(studentID1);
		 listInfo.add(studentID2);
		 listInfo.add(studentID3);
		 
		 if(listInfo.size()!=0) {
			 System.out.println("****************Inserted*****************");
		 }
		 else {
			 System.out.println("############# Not Inserted ##############");
		 }	
	//list student record in the table
	
	try {
		studentservice.ListAllEmployee();
	}
	catch(HibernateException e) {
		e.printStackTrace();
		}

	//update the student record
	try {
		studentservice.updateStudentDetails(studentID2, "Sahil");
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	
	// delete the student record
	try {
		studentservice.deleteById(studentID2, "Rajan");
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	}

}




