package com.tableralation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Achievment;
import com.model.Employee;
import com.util.HBUtils;

public class EmployeeAchievmentRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        int a[]= {1,2,3,4,5,6,7,8,9,10,10,9,8,7,6,5,4,3,2,1,5,6,7,8,9,10,4,3,2,1};
        for(int i=0;i<a.length;i++) {
        	Employee employee = session.get(Employee.class, a[i]);
        	Achievment achievment = session.get(Achievment.class, i+1);
        	achievment.setEmployee(employee);
        }
        tx.commit();
        session.close();
	}

}
