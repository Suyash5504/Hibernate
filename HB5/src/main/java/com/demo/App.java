package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Laptop;
import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
        String[] laptopBrands = {
                "Dell",
                "HP",
                "Lenovo",
                "Asus",
                "Acer",
                "Apple",
                "MSI",
                "Samsung"
            };
        
        Random r = new Random();
        for(int i=0;i<laptopBrands.length;i++) {
        	Laptop l = new Laptop();
        	l.setName(laptopBrands[i]);
        	l.setPrice(r.nextInt(100)*10000);
        	session.save(l);
        	
        }
        
        
        tx.commit();
        session.close();
    }
}
