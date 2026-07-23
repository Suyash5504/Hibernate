package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Gift;
import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
//        String[] laptopBrands = {
//                "Dell",
//                "HP",
//                "Lenovo",
//                "Asus",
//                "Acer",
//                "Apple",
//                "MSI",
//                "Samsung"
//            };
//        
//        Random r = new Random();
//        for(int i=0;i<laptopBrands.length;i++) {
//        	Laptop l = new Laptop();
//        	l.setName(laptopBrands[i]);
//        	l.setPrice(r.nextInt(100)*10000);
//        	session.save(l);
//    }
//        Student s = session.get(Student.class, 8);
//        Laptop l = session.get(Laptop.class, 6);
//        s.setLaptop(l);
//        l.setStudent(s);
        
//        String[] gifts = {
//                "Lipstick",
//                "Perfume",
//                "Face Cream",
//                "Face Wash",
//                "Nail Polish",
//                "Eyeliner",
//                "Compact Powder",
//                "Body Lotion"
//            };
        
//        String[] gifts = {
//                "Watch",
//                "Handbag",
//                "Wallet",
//                "Sunglasses",
//                "Shoes",
//                "Scarf",
//                "Belt",
//                "Jacket"
//            };
//        String[] gifts = {
//                "Refrigerator",
//                "Washing Machine",
//                "Microwave Oven",
//                "Air Conditioner",
//                "Ceiling Fan",
//                "Water Purifier",
//                "Vacuum Cleaner",
//                "Mixer Grinder"
//            };
//        for(int i=0;i<gifts.length;i++) {
//        	Gift g = new Gift();
//        	g.setName(gifts[i]);
//        	g.setType("Home Appliance");
//        	
//        	session.save(g);
//        }
//        int arr[]= {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
//        for(int i=0;i<arr.length;i++) {
//        	Student student = session.get(Student.class, arr[i]);
//        	Gift gift = session.get(Gift.class, i+1);
//        	gift.setStudent(student);
//        }
        
//        Student student = session.get(Student.class, 1);
//        System.out.println(student);
//        List<Gift> list = student.getGift();
//        for(Gift g:list)
//        	System.out.println(g);
        
        Gift gift = session.get(Gift.class, 1);
        System.out.println(gift.getStudent().getLaptop());
        tx.commit();
        session.close();
    }
}
