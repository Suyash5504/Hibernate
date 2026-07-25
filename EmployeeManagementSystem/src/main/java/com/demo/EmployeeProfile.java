package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HBUtils;

public class EmployeeProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Employeee Profile");
		Employee employee = session.get(Employee.class, 1);
		System.out.println("Employee Name:"+employee.getName());
		System.out.println("Designation:"+employee.getDesignation());
		System.out.println("Company:"+employee.getCompany());
		System.out.println("Salary:"+employee.getSalary()+".rs");
		System.out.println("Laptop:"+employee.getLaptop().getName());
	}

}
