package com.tableralation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.Project;
import com.util.HBUtils;

public class EmployeeProjectRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		int pro[]= {1,11,21,22,27};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 1);
//			employee.getProject().add(project);
//		}
//		int pro[]= {2,12,22,25,5};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 2);
//			employee.getProject().add(project);
//		}
//		int pro[]= {3,13,23,21,29};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 3);
//			employee.getProject().add(project);
//		}
		
//		int pro[]= {4,14,24,22,28};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 4);
//			employee.getProject().add(project);
//		}
//		int pro[]= {5,15,25,2,7};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 5);
//			employee.getProject().add(project);
//		}
		
//		int pro[]= {6,16,26,3,5};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 6);
//			employee.getProject().add(project);
//		}
//		int pro[]= {7,17,27,1,5};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 7);
//			employee.getProject().add(project);
//		}
//		int pro[]= {8,18,28,2,7};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 8);
//			employee.getProject().add(project);
//		}
//		int pro[]= {9,19,29,5,17};
//		for(int i=0;i<pro.length;i++) {
//			Project project = session.get(Project.class, pro[i]);
//			Employee employee = session.get(Employee.class, 9);
//			employee.getProject().add(project);
//		}
		int pro[]= {10,20,30,23,15};
		for(int i=0;i<pro.length;i++) {
			Project project = session.get(Project.class, pro[i]);
			Employee employee = session.get(Employee.class, 10);
			employee.getProject().add(project);
		}
		
		tx.commit();
	}

}
