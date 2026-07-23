package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
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
        
        session.createCriteria(Student.class)
        .list()
        .forEach(s->System.out.println(s));
        
        
        // display student by id
        
        Student student = (com.model.Student) session.createCriteria(Student.class)
        .add(Restrictions.eq("id", 14))
        .uniqueResult();
        System.out.println(student);
        
        // display student by id and name
        
        Student studentbyidandname = (Student) session.createCriteria(Student.class)
        .add(Restrictions.eq("id", 14))
        .add(Restrictions.eq("name","Suyash Patil"))
        .uniqueResult();
        System.out.println(studentbyidandname);
        
        // display students by id or name
        
        session.createCriteria(Student.class)
        .add(Restrictions.or(Restrictions.eq("id", 14))
        		.add(Restrictions.eq("name","Suyash Patil")))
        .list()
        .forEach(s->System.out.println(s));
        
        // display students by id or name or city
        
        session.createCriteria(Student.class)
        .add(Restrictions.or(Restrictions.eq("id", 14))
        		.add(Restrictions.eq("name", "Rajesh Jadhav"))
        		.add(Restrictions.eq("city", "pune")))
        .list()
        .forEach(s->System.out.println(s));
        
        // find student by percentage less than
        
        session.createCriteria(Student.class)
        .add(Restrictions.lt("percentage", 35.0))
        .list()
        .forEach(s->System.out.println(s));
        
        // find students by percentage between
        
        session.createCriteria(Student.class)
        .add(Restrictions.between("percentage", 0.00, 36.0))
        .list()
        .forEach(s->System.out.println(s));
        
        // find students by percentage not between
        
        session.createCriteria(Student.class)
        .add(Restrictions.not(Restrictions.between("percentage", 0.0, 36.0)))
        .list()
        .forEach(s->System.out.println(s));
        
        // find students by name contains
        
        session.createCriteria(Student.class)
        .add(Restrictions.like("name","s%"))
        .list()
        .forEach(s->System.out.println(s));
        
        // find students by id in
        
        session.createCriteria(Student.class)
        .add(Restrictions.in("id", 4,8,66,33,998,666))
        .list()
        .forEach(s->System.out.println(s));
        
        List<Integer> id= new ArrayList();
        id.add(10);
        id.add(44);
        id.add(99);
        id.add(123);
        id.add(556);
        Criteria criteria = session.createCriteria(Student.class);
        if(!id.isEmpty())
        	criteria.add(Restrictions.in("id", id))
        	.list()
        	.forEach(s->System.out.println(s));
        
        // find students order by percentage asc
        
        session.createCriteria(Student.class)
        .addOrder(Order.asc("percentage"))
        .list()
        .forEach(s->System.out.println(s));
        
        // find max percentage from student
        
        double maxpercentage = (double) session.createCriteria(Student.class)
        .setProjection(Projections.max("percentage"))
        .uniqueResult();
        System.out.println(maxpercentage);
        
        // display names from student
        
        session.createCriteria(Student.class)
        .setProjection(Projections.property("name"))
        .list()
        .forEach(name->System.out.println(name));
        
        // display students whose percentage is max 1st Rank
        
        session.createCriteria(Student.class)
        .add(Restrictions.eq("percentage",session.createCriteria(Student.class)
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .list()
        .forEach(s->System.out.println(s));
        
        // display second highest percentage from students 2nd rank
        
        session.createCriteria(Student.class)
        .add(Restrictions.eq("percentage",  session.createCriteria(Student.class)
        .add(Restrictions.lt("percentage",  session.createCriteria(Student.class)
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .list()
        .forEach(s->System.out.println(s));
        
        // display 3rd highest percentage from student - 3rd rank
        
        session.createCriteria(Student.class)
        .add(Restrictions.eq("percentage", session.createCriteria(Student.class)
        .add(Restrictions.lt("percentage", session.createCriteria(Student.class)
        .add(Restrictions.lt("percentage", session.createCriteria(Student.class)
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .setProjection(Projections.max("percentage"))
        .uniqueResult()))
        .list()
        .forEach(s->System.out.println(s));
        
        tx.commit();
        session.close();
    }
}
