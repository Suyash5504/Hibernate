package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;
import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.model.Subject;

public class HBUtils {
	
	public static SessionFactory sf = new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(Laptop.class)
			.addAnnotatedClass(Gift.class)
			.addAnnotatedClass(Department.class)
			.addAnnotatedClass(Subject.class)
			.buildSessionFactory();

	private static Properties p1() {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3308/hibernate_pratice");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "suyash@123");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.formate_sql", "true");
		p.setProperty("hibernate.show_sql", "false");
		
		
		return p;
	}
}
