package com.example;

import com.example.entity.Supplier;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Supplier s1 = new Supplier();
        s1.setSid(1);
        s1.setSname("Rajan Enterprises");
        s1.setSrank(4.5);
        s1.setCity("Delhi");

        Supplier s2 = new Supplier();
        s2.setSid(2);
        s2.setSname("Indian Supply");
        s2.setSrank(3.4);
        s2.setCity("Gurugram");

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();

        // Query 1
        List<String> suppliers =
                em.createQuery("select s.sname from Supplier s", String.class)
                        .getResultList();

        System.out.println("Supplier Names:");
        suppliers.forEach(System.out::println);

        // Query 2
        List<String> delhiSuppliers =
                em.createQuery("select s.sname from Supplier s where s.city='Delhi'", String.class)
                        .getResultList();

        System.out.println("\nSuppliers from Delhi:");
        delhiSuppliers.forEach(System.out::println);

        em.close();
        emf.close();
    }
}