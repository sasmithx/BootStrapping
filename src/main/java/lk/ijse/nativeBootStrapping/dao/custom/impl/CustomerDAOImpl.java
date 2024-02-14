package lk.ijse.nativeBootStrapping.dao.custom.impl;

import lk.ijse.nativeBootStrapping.dao.custom.CustomerDAO;
import lk.ijse.nativeBootStrapping.entity.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CustomerDAOImpl implements CustomerDAO {
    private Session session;


    @Override
    public void save(Customer entity) throws SQLException {
        session.save(entity);
    }

    @Override
    public ArrayList<Customer> getAll() throws SQLException {
        try {
            List<Customer> customerList = session.createNativeQuery("Select * from customer", Customer.class).getResultList();
            return (ArrayList<Customer>) customerList;
        }catch (Exception e){
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public void delete(Customer entity) throws SQLException {
        session.delete(entity);
    }

    @Override
    public void update(Customer entity) throws SQLException {
        session.update(entity);
    }

    @Override
    public ArrayList<String> loadIds() throws SQLException {
        String sql = "SELECT C.id FROM customer AS C";
        Query query = session.createQuery(sql);
        List list = query.list();
        session.close();
        return (ArrayList<String>) list;
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }

    @Override
    public int CustomerCount() {
        String sql = "SELECT COUNT(C.id) FROM customer AS C";
        Query query = session.createQuery(sql);
        Long count = (Long) query.getSingleResult();
        return Math.toIntExact(count);
    }
}
