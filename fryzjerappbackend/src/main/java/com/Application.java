package com;


import com.util.JPAUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        // Check database version
        String sql = "select version()";

        String result = (String) entityManager.createNativeQuery(sql).getSingleResult();
        System.out.println(result);

        entityManager.getTransaction().commit();
        entityManager.close();

        JPAUtil.shutdown();

    }
}
