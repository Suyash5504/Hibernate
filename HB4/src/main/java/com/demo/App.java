package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
        tx.commit();
        session.close();
    }
}
