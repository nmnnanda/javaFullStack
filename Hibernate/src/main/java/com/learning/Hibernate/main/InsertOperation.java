package com.learning.Hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class InsertOperation {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Ankit");
        s1.setCourseEnrolled("Java2EE");

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Harsh");
        s2.setCourseEnrolled("Hibernate");

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("Nanda");
        s3.setCourseEnrolled("Developer");

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        session.beginTransaction();
        session.save(s1);
        System.out.println("S1 saved successfully....");
        session.save(s2);
        System.out.println("S2 saved successfully....");
        session.save(s3);
        System.out.println("S3 saved successfully....");

        tx.commit();

        session.close();
        factory.close();
    }
}
