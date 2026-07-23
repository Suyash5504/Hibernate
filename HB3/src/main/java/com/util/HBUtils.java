package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class HBUtils {
	
		public static SessionFactory sf = new Configuration()
						.setProperties(p1())
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();

		private static Properties p1() {
			Properties p = new Properties();
			p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3308/hibernate_pratice");
			p.setProperty("hibernate.connection.username","root");
			p.setProperty("hibernate.connection.password", "suyash@123");
			p.setProperty("hibernate.dialet", "org.hibernate.dialet.MySQL8Dialet");
			p.setProperty("hibernate.hbm2ddl.auto", "update");
			p.setProperty("hibernate.show_sql", "true");
			p.setProperty("hibernate.formate_sql","true");
			return p;
		}
}
