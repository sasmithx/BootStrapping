package lk.ijse.nativeBootStrapping.config;

import com.mysql.cj.Session;
import lk.ijse.nativeBootStrapping.entity.Customer;
import lk.ijse.nativeBootStrapping.entity.Item;
import lk.ijse.nativeBootStrapping.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;

    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        Metadata metaData =
                new MetadataSources(serviceRegistry).
                        addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Item.class)
                        .addAnnotatedClass(User.class)
                        .getMetadataBuilder().build();

        sessionFactory = metaData.buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?
                factoryConfig=new SessionFactoryConfig():factoryConfig;
    }

    public Session getSession(){
        return (Session) sessionFactory.openSession();
    }

}
