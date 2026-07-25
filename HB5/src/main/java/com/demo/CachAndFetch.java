package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.HBUtils;

public class CachAndFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session user1 = HBUtils.sf.openSession();
		Session user2 = HBUtils.sf.openSession();
		Transaction utx1 = user1.beginTransaction();
		Transaction utx2 = user2.beginTransaction();
		Student student1 = user1.get(Student.class, 1);
		System.out.println(student1);
		Student student2 = user2.get(Student.class, 1);
		System.out.println(student2);
//		System.out.println(user1.createCriteria(Student.class)
//				.add(Restrictions.eq("id", 1))
//				.setCacheable(true)
//				.uniqueResult());
//		System.out.println(user2.createCriteria(Student.class)
//				.add(Restrictions.eq("id", 1))
//				.setCacheable(true)
//				.uniqueResult());
		utx1.commit();
		utx2.commit();
	}

}
