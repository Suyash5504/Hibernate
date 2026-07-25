package com.tableralation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Certificate;
import com.model.Employee;
import com.util.HBUtils;

public class EmployeeCertificateRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
//        int cer[]= {1,11,21,4,8};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 1);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {2,12,22,3,5};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 2);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {3,13,23,8,19};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 3);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {4,14,24,7,9};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 4);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {5,15,25,4,9};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 5);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {6,16,26,8,18};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 6);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {7,17,27,6,18};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 7);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {8,18,28,18,5};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 8);
//        	employee.getCertificates().add(certificate);
//        }
//        int cer[]= {9,19,29,28,18};
//        for(int i=0;i<cer.length;i++) {
//        	Certificate certificate = session.get(Certificate.class, cer[i]);
//        	Employee employee = session.get(Employee.class, 9);
//        	employee.getCertificates().add(certificate);
//        }
        int cer[]= {10,20,30,11,21};
        for(int i=0;i<cer.length;i++) {
        	Certificate certificate = session.get(Certificate.class, cer[i]);
        	Employee employee = session.get(Employee.class, 10);
        	employee.getCertificates().add(certificate);
        }
        tx.commit();
        session.close();
	}

}
