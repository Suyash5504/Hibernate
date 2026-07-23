package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con= new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Student s1= new Student();
        s1.setName("suyash");
        s1.setCity("pune");
        s1.setPercentage(90);
        session.save(s1);
        
        Student s = session.get(Student.class,9);
        session.delete(s);
        
        Student student = session.get(Student.class, 7);
        student.setPercentage(80.0);
        session.update(student);
        
        
        tx.commit();
        session.close();  
    }
}
