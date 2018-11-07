package com.util;

import com.model.AppService;
import com.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;


public class HibernateUtil {
    private static final SessionFactory sessionFactory;


    static {
        try {
            Properties prop = new Properties();
            prop.setProperty("spring.h2.console.enabled", "true");
            prop.setProperty("spring.h2.console.path", "/h2");
            prop.setProperty("spring.datasource.username", "sa");
            prop.setProperty("spring.datasource.password", "");
            prop.setProperty("spring.datasource.url", "jdbc:h2:file:~/test");
            prop.setProperty("spring.datasource.driver-class-name", "org.h2.Driver");
            prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");

            Configuration config = new Configuration();
            config.setProperties(prop);
            config.addAnnotatedClass(User.class);
            config.addAnnotatedClass(AppService.class);

            sessionFactory = config.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}
