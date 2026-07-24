package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Gift;
import com.model.Student;
import com.model.Subject;
import com.util.HBUtils;

public class StudentProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s = session.get(Student.class, 8);
		
		System.out.println("Student Information");
		System.out.println("Student Name:"+s.getName());
		System.out.println("Student Department:"+s.getDepartment().getName());
		System.out.print("Subjects:");
		List<Subject> subjects = s.getDepartment().getSubjects();
		for(Subject s1: subjects)
			System.out.print(s1.getName()+", ");
		System.out.println("\nLaptop:"+s.getLaptop().getName());
		System.out.print("Achievments:");
		List<Gift> gifts = s.getGift();
		for(Gift g:gifts)
			System.out.print(g.getName()+",");
		tx.commit();
	}

}
