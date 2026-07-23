package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
		// display all student by using Query retuen type
		Query<Student> q = session.createQuery("from Student",Student.class);
		List<Student> list1 = q.list();
		for(Student s:list1)
			System.out.println(s);
//		by using List<> return type
		session.createQuery("from Student",Student.class)
		.list()
		.forEach(s->System.out.println(s));
	
		
		// find by id
		Student s = session.createQuery("from Student where id=:a",Student.class)
		.setParameter("a", 12)
		.uniqueResult();
		System.out.println(s);
		
//		Query<Student> q = session.createQuery("from Student where id=:a",Student.class);
//		q.setParameter("a", 12);
//		Student s = q.uniqueResult();
//		System.out.println(s);
		
		// find stdent by id and name
//		Query<Student> q = session.createQuery("from Student where id=:a and name=:b",Student.class);
//		q.setParameter("a", 12);
//		q.setParameter("b", "RGPOKAAIRVKAHXY");
//		Student s = q.uniqueResult();
//		System.out.println(s);
		Student s1 = session.createQuery("from Student where id=:a and name=:b",Student.class)
		.setParameter("a", 22)
		.setParameter("b","Rajesh Jadhav")
		.uniqueResult();
		System.out.println(s1);
		
		// find by id or name
		
		
//		Query<Student> q = session.createQuery("from Student where id=:a or name=:b",Student.class);
//		q.setParameter("a", 12);
//		q.setParameter("b","RGPOKAAIRVKAHXY");
//		Student s = q.uniqueResult();
//		System.out.println(s);
		
		// find by id or name
		
		session.createQuery("from Student where id=:a or name=:b",Student.class)
		.setParameter("a", 12)
		.setParameter("b", "Rajesh Jadhav")
		.list()
		.forEach(st->System.out.println(st));
		
		// find by percentage less than
		
		
//		Query q = session.createQuery("from Student where percentage<:a");
//		q.setParameter("a", 12.0);
//		List<Student> list = q.list();
//		for(Student s:list)
//			System.out.println(s);
		
		session.createQuery("from Student where percentage<:a",Student.class)
		.setParameter("a", 12.0)
		.list()
		.forEach(st->System.out.println(st));
	
		// find students percentage between
		
//		Query<Student> q = session.createQuery("from Student where percentage between :a and :b",Student.class);
//		q.setParameter("a",35.0);
//		q.setParameter("b",90.0);
//		List<Student> list = q.list();
//		for(Student s:list)
//			System.out.println(s);
		
		
		session.createQuery("from Student where percentage between :a and :b",Student.class)
		.setParameter("a", 35.0)
		.setParameter("b", 90.0)
		.list()
		.forEach(st->System.out.println(st));
	
		// find Students percentage not between
		
		session.createQuery("from Student where percentage not between :a and :b",Student.class)
		.setParameter("a", 0.0)
		.setParameter("b", 35.00)
		.list()
		.forEach(st->System.out.println(st));
		
		
		//find Students by name contains
		session.createQuery("from Student where name like :a",Student.class)
		.setParameter("a","%a%")
		.list()
		.forEach(st->System.out.println(st));
		
		// delete student by id
		
		int check = session.createQuery("delete from Student where id=:a")
		.setParameter("a",50)
		.executeUpdate();
		System.out.println(check);
		
		// update student by id
		Student s2 = new Student();
		s2.setName("Shri");
		s2.setCity("Satara");
		s2.setPercentage(90.0);
		s2.setId(0);
		
		int check1 = session.createQuery("update Student set name=:a,city=:b,percentage=:c where id=:d")
		.setParameter("a", s1.getName())
		.setParameter("b", s1.getCity())
		.setParameter("c", s1.getPercentage())
		.setParameter("d", s1.getId())
		.executeUpdate();
		System.out.println(check1);
		
		// display first 10 students
		session.createQuery("from Student",Student.class)
		.setMaxResults(10)
		.list()
		.forEach(st->System.out.println(st));
		
		// skip first 10 students and display 10 students
		session.createQuery("from Student",Student.class)
		.setFirstResult(10)
		.setMaxResults(10)
		.list()
		.forEach(st->System.out.println(st));
		
		// pagination by using no of size and no of pages
		pagination1(session);
		
		
		List<Student> list = pagination2(session, 6);
		for(Student st:list)
			System.out.println(st);

        
        tx.commit();
        session.close();
    }
    public static void pagination1(Session session) {
		int size=10;
		int page=0;
		while(true) {
			List<Student> list = session.createQuery("from Student",Student.class)
			.setMaxResults(size)
			.setFirstResult(page*size)
			.list();
			if(!list.isEmpty()) {
				System.out.println("Page No:"+(++page));
				for(Student s:list)
					System.out.println(s);
			}
			else
				break;
		}
	}
	public static List<Student> pagination2(Session session,int page) {
		int size=10;
				return session.createQuery("from Student",Student.class)
						.setMaxResults(size)
						.setFirstResult((page-1)*size)
						.list();
				
	}
}
