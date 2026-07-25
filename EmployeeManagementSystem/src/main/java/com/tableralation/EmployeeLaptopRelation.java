package com.tableralation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.Laptop;
import com.util.HBUtils;

public class EmployeeLaptopRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++) {
			Laptop laptop = session.get(Laptop.class, a[i]);
			Employee employee = session.get(Employee.class, i+1);
			employee.setLaptop(laptop);
			laptop.setEmployee(employee);
		}
		tx.commit();
	}

}
