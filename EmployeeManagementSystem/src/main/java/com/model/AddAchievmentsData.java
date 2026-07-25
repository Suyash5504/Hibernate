package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HBUtils;

public class AddAchievmentsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		String[] itAchievements = {
			    "Best Employee Award",
			    "Employee of the Month",
			    "Star Performer Award",
			    "Outstanding Developer Award",
			    "Innovation Award",
			    "Technical Excellence Award",
			    "Project Excellence Award",
			    "Best Team Player Award",
			    "Customer Appreciation Award",
			    "Leadership Excellence Award",
			    "Best Software Engineer Award",
			    "Best Java Developer Award",
			    "Top Performer Award",
			    "Excellence in Coding Award",
			    "Fastest Bug Fixer Award",
			    "Quality Champion Award",
			    "Best Full Stack Developer Award",
			    "Cloud Excellence Award",
			    "DevOps Excellence Award",
			    "Cybersecurity Excellence Award",
			    "AI & ML Excellence Award",
			    "Best Intern Award",
			    "Rookie of the Year Award",
			    "Best Mentor Award",
			    "Best Project Delivery Award",
			    "Agile Champion Award",
			    "Continuous Improvement Award",
			    "Best Problem Solver Award",
			    "Best Innovation Project Award",
			    "Employee Excellence Award"
			};
		for(int i=0;i<itAchievements.length;i++) {
			Achievment a = new Achievment();
			a.setName(itAchievements[i]);
			session.save(a);
		}
		tx.commit();
		session.close();
	}

}
