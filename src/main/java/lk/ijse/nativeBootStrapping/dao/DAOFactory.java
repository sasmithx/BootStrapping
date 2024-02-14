package lk.ijse.nativeBootStrapping.dao;

import lk.ijse.nativeBootStrapping.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.nativeBootStrapping.dao.custom.impl.ItemDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {}

    public static DAOFactory getDaoFactory(){
        return (daoFactory == null)? daoFactory=new DAOFactory():daoFactory;
    }

    public enum DAOTypes{
        CustomerDAO,ItemDAO
    }

    public <T extends SuperDAO>T getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CustomerDAO:
                return (T)new CustomerDAOImpl();
            case ItemDAO:
                return (T)new ItemDAOImpl();
        }
        return null;
    }
}
