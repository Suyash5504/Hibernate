package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Subject;
import com.util.HBUtils;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
//		String[] subjects = {
//			    "Engineering Mathematics", "Engineering Physics", "Engineering Chemistry",
//			    "Programming in C", "Data Structures", "Object-Oriented Programming",
//			    "Database Management System", "Operating System", "Computer Networks",
//			    "Software Engineering", "Java Programming", "Python Programming",
//			    "Web Technology", "Computer Organization", "Digital Electronics",
//			    "Microprocessors", "Theory of Computation", "Compiler Design",
//			    "Artificial Intelligence", "Machine Learning", "Cloud Computing",
//			    "Cyber Security", "Data Science", "Computer Graphics",
//			    "Discrete Mathematics", "Engineering Mechanics", "Environmental Studies",
//			    "Digital Signal Processing", "Embedded Systems", "Internet of Things (IoT)"
//			};
//		String[] subjects = {
//			    "Principles of Management", "Business Communication", "Financial Accounting",
//			    "Marketing Management", "Human Resource Management", "Operations Management",
//			    "Financial Management", "Business Economics", "Business Statistics",
//			    "Organizational Behavior", "Strategic Management", "Project Management",
//			    "Entrepreneurship Development", "Business Law", "Supply Chain Management",
//			    "Production Management", "Consumer Behavior", "International Business",
//			    "Management Information System", "Corporate Finance", "Cost Accounting",
//			    "Retail Management", "Sales Management", "Digital Marketing",
//			    "Investment Management", "Risk Management", "Leadership and Team Management",
//			    "Business Ethics", "Quality Management", "E-Commerce"
//			};
		String[] subjects = {
			    "Anatomy", "Physiology", "Biochemistry", "Pathology", "Pharmacology",
			    "Microbiology", "Forensic Medicine", "Community Medicine", "General Medicine",
			    "General Surgery", "Obstetrics and Gynecology", "Pediatrics", "Orthopedics",
			    "Ophthalmology", "Otorhinolaryngology (ENT)", "Dermatology", "Psychiatry",
			    "Radiology", "Anesthesiology", "Emergency Medicine", "Cardiology",
			    "Neurology", "Nephrology", "Pulmonology", "Oncology", "Endocrinology",
			    "Gastroenterology", "Urology", "Dentistry", "Nursing"
			};
//		for(int i=0;i<subjects.length;i++) {
//			Subject s = new Subject();
//			s.setName(subjects[i]);
//			session.save(s);
//		}
		
		tx.commit();
		
	}

}
