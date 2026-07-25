package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Certificate;
import com.util.HBUtils;

public class AddCertificatesData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
		  String[] itCertificates = {
	        	    "Oracle Certified Java Programmer (OCP)",
	        	    "Oracle Certified Associate Java SE (OCA)",
	        	    "AWS Certified Cloud Practitioner",
	        	    "AWS Certified Solutions Architect",
	        	    "Microsoft Certified: Azure Fundamentals",
	        	    "Microsoft Certified: Azure Administrator",
	        	    "Google Associate Cloud Engineer",
	        	    "Cisco Certified Network Associate (CCNA)",
	        	    "CompTIA A+",
	        	    "CompTIA Network+",
	        	    "CompTIA Security+",
	        	    "Red Hat Certified System Administrator (RHCSA)",
	        	    "Red Hat Certified Engineer (RHCE)",
	        	    "Salesforce Certified Administrator",
	        	    "Salesforce Platform Developer I",
	        	    "Certified Kubernetes Administrator (CKA)",
	        	    "Docker Certified Associate",
	        	    "Scrum Master Certification (CSM)",
	        	    "ISTQB Certified Tester",
	        	    "MongoDB Certified Developer",
	        	    "MySQL Database Administrator Certification",
	        	    "Microsoft Certified: Power BI Data Analyst",
	        	    "Google Professional Cloud Architect",
	        	    "Certified Ethical Hacker (CEH)",
	        	    "PMP (Project Management Professional)",
	        	    "ITIL Foundation Certification",
	        	    "Oracle Database SQL Certified Associate",
	        	    "VMware Certified Professional (VCP)",
	        	    "Jenkins Engineer Certification",
	        	    "GitHub Foundations Certification"
	        	};
	        for(int i=0;i<itCertificates.length;i++) {
	        	Certificate c = new Certificate();
	        	c.setName(itCertificates[i]);
	        	session.save(c);
	        }
	        tx.commit();
	        session.close();
	}

}
