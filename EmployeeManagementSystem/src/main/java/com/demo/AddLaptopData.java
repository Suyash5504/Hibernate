package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Laptop;
import com.util.HBUtils;

public class AddLaptopData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        String[] laptopBrands = {
        	    "Dell",
        	    "HP",
        	    "Lenovo",
        	    "Apple",
        	    "Asus",
        	    "Acer",
        	    "MSI",
        	    "Samsung",
        	    "Microsoft",
        	    "LG"
        	};
        Random r = new Random();
        for(int i=0;i<laptopBrands.length;i++) {
        	Laptop l = new Laptop();
        	l.setName(laptopBrands[i]);
        	l.setPrice(r.nextDouble()*10000);
        	session.save(l);
        }
        tx.commit();
        session.close();
	}

}
