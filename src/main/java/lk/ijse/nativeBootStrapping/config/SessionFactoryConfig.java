package lk.ijse.nativeBootStrapping.config;

import com.mysql.cj.Session;

import java.util.Properties;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;

    private SessionFactoryConfig() {}

    public static SessionFactoryConfig getInstance(){
        return (factoryConfig == null)?
                factoryConfig=new SessionFactoryConfig():factoryConfig;
    }

    public Session getSession(){
        Properties properties = new Properties();

        properties.load(ClassLoader.getSystemClassLoader()).get;
    }

}
