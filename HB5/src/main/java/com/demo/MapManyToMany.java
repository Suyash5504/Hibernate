package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Subject;
import com.util.HBUtils;

public class MapManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		int engsub[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,32};
//		for(int i=0;i<engsub.length;i++) {
//			Subject subject = session.get(Subject.class, engsub[i]);
//			Department department = session.get(Department.class, 1);
//			department.getSubjects().add(subject);
//		}
		int mansub[]= {1,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
//		for(int i=0;i<mansub.length;i++) {
//			Subject subject = session.get(Subject.class, mansub[i]);
//			Department department = session.get(Department.class, 2);
//			department.getSubjects().add(subject);
//		}
		int medicalsub[]= {1,61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
			    71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
			    81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
		
//		for(int i=0;i<medicalsub.length;i++) {
//		Subject subject = session.get(Subject.class, medicalsub[i]);
//		Department department = session.get(Department.class, 3);
//		department.getSubjects().add(subject);
//		
//		}
		Department d = session.get(Department.class, 3);
		List<Subject> subjects = d.getSubjects();
		for(Subject s: subjects)
			System.out.println(s);
		tx.commit();
	}

}
