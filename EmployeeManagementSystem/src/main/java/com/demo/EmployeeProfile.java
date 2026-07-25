package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Achievment;
import com.model.Certificate;
import com.model.Employee;
import com.model.Project;
import com.util.HBUtils;

public class EmployeeProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Employeee Profile");
		Employee employee = session.get(Employee.class, 9);
		System.out.println("Employee Name:"+employee.getName());
		System.out.println("Designation:"+employee.getDesignation());
		System.out.println("Company:"+employee.getCompany());
		System.out.println("Salary:"+employee.getSalary()+".rs");
		System.out.println("Laptop:"+employee.getLaptop().getName());
		System.out.print("Achievment:");
		List<Achievment> ach = employee.getAchievments();
		for(Achievment a:ach)
			System.out.print(a.getName()+",");
		System.out.print("\nProject:");
		List<Project> project = employee.getProject();
		for(Project p:project)
			System.out.print(p.getName()+",");
		System.out.print("\nCertificate:");
		List<Certificate> certificates = employee.getCertificates();
		for(Certificate c:certificates)
			System.out.print(c.getName()+",");
	}

}
