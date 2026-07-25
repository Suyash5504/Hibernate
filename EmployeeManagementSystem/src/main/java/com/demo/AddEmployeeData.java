package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HBUtils;

public class AddEmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		String[] names = {
			    "Aarav Sharma",
			    "Vivaan Patil",
			    "Aditya Singh",
			    "Rohan Deshmukh",
			    "Siddharth Kulkarni",
			    "Rahul Jadhav",
			    "Karan Chavan",
			    "Priya Joshi",
			    "Sneha Pawar",
			    "Anjali More"
			};
		String[] companies = {
			    "TCS",
			    "Infosys",
			    "Wipro",
			    "HCL Technologies",
			    "Tech Mahindra",
			    "Accenture",
			    "Capgemini",
			    "Cognizant",
			    "IBM",
			    "Oracle"
			};
		String[] designations = {
			    "Software Engineer",
			    "Java Developer",
			    "Frontend Developer",
			    "Backend Developer",
			    "Full Stack Developer",
			    "UI/UX Designer",
			    "QA Engineer",
			    "DevOps Engineer",
			    "System Analyst",
			    "Project Manager"
			};
		Random r = new Random();
		for(int i=0;i<names.length;i++) {
			Employee e = new Employee();
			e.setName(names[i]);
			e.setDesignation(designations[i]);
			e.setCompany(companies[i]);
			e.setSalary(r.nextInt(100)*1000);
			session.save(e);
		}
		tx.commit();
		session.close();
	}

}
