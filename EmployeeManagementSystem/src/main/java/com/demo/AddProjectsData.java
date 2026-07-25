package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Project;
import com.util.HBUtils;

public class AddProjectsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		String[] itProjects = {
			    "Employee Management System",
			    "Student Management System",
			    "Library Management System",
			    "Hospital Management System",
			    "Bank Management System",
			    "Online Shopping System",
			    "E-Commerce Website",
			    "Inventory Management System",
			    "Hotel Management System",
			    "School Management System",
			    "Pharmacy Management System",
			    "Attendance Management System",
			    "Payroll Management System",
			    "Online Food Ordering System",
			    "Online Examination System",
			    "Bus Reservation System",
			    "Railway Reservation System",
			    "Vehicle Rental System",
			    "Blood Bank Management System",
			    "Event Management System",
			    "Customer Relationship Management (CRM)",
			    "Clinic Management System",
			    "Task Management System",
			    "Complaint Management System",
			    "Expense Tracker",
			    "Weather Forecast Application",
			    "Chat Application",
			    "Movie Ticket Booking System",
			    "Job Portal System",
			    "E-Learning Management System"
			};
		for(int i=0;i<itProjects.length;i++) {
			Project p = new Project();
			p.setName(itProjects[i]);
			session.save(p);
		}
		tx.commit();
	}

}
