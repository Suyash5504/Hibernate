package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx= session.beginTransaction();
        Address a1 = new Address();
        a1.setLine1("Krishnamayur Appartment");
        a1.setLine2("Shahu colony");
        a1.setCity("pune");
        a1.setState("MH");
        
        Employee emp = new Employee();
        emp.setName("Karan Patil");
        emp.setDesignation("Cloud developer");
        emp.setCompany("Pune");
        emp.setSalary(120000);
        emp.setAddress(a1);
        session.save(emp);
        
//        
//        emp.setId(2);
//        session.delete(emp);
        tx.commit();
//        session.close();
    }
}
