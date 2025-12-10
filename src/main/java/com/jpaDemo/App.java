package com.jpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {
//        System.out.println("Hello World");

        Student sa = new Student();
        sa.setId(10);
        sa.setName("Panday");
        sa.setTech("Python");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "my-unit");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
em.persist(sa);
em.getTransaction().commit();
//        Student student= em.find(Student.class, 1);
        System.out.println(sa);
    }


}
