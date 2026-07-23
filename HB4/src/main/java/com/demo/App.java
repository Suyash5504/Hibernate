package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
        // display all students
        
//        session.createCriteria(Student.class)
//        .list()
//        .forEach(s->System.out.println(s));
        
        
        // display student by id
        
//        Student student = (com.model.Student) session.createCriteria(Student.class)
//        .add(Restrictions.eq("id", 14))
//        .uniqueResult();
//        System.out.println(student);
        
        // display student by id and name
        
//        Student studentbyidandname = (Student) session.createCriteria(Student.class)
//        .add(Restrictions.eq("id", 14))
//        .add(Restrictions.eq("name","Suyash Patil"))
//        .uniqueResult();
//        System.out.println(studentbyidandname);
        
        // display students by id or name
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.or(Restrictions.eq("id", 14))
//        		.add(Restrictions.eq("name","Suyash Patil")))
//        .list()
//        .forEach(s->System.out.println(s));
        
        // display students by id or name or city
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.or(Restrictions.eq("id", 14))
//        		.add(Restrictions.eq("name", "Rajesh Jadhav"))
//        		.add(Restrictions.eq("city", "pune")))
//        .list()
//        .forEach(s->System.out.println(s));
        
        // find student by percentage less than
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.lt("percentage", 35.0))
//        .list()
//        .forEach(s->System.out.println(s));
        
        // find students by percentage between
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.between("percentage", 0.00, 36.0))
//        .list()
//        .forEach(s->System.out.println(s));
        
        // find students by percentage not between
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.not(Restrictions.between("percentage", 0.0, 36.0)))
//        .list()
//        .forEach(s->System.out.println(s));
        
        // find students by name contains
        
//        session.createCriteria(Student.class)
//        .add(Restrictions.like("name","s%"))
//        .list()
//        .forEach(s->System.out.println(s));
        
        
        
        
        
        
        
        tx.commit();
        session.close();
    }
}
