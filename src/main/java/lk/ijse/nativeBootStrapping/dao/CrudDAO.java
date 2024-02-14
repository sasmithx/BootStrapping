package lk.ijse.nativeBootStrapping.dao;

import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T,ID> extends SuperDAO{
     void save(T entity) throws SQLException;
    ArrayList<T> getAll() throws SQLException;
    void delete(T entity) throws SQLException;
    void update(T entity) throws SQLException;
    ArrayList<ID> loadIds() throws SQLException;
    void setSession(Session session);
}
