package lk.ijse.nativeBootStrapping.dao.custom.impl;

import lk.ijse.nativeBootStrapping.dao.custom.ItemDAO;
import lk.ijse.nativeBootStrapping.entity.Customer;
import lk.ijse.nativeBootStrapping.entity.Item;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    private Session session;
    @Override
    public void save(Item entity) throws SQLException {
        session.save(entity);
    }

    @Override
    public ArrayList<Item> getAll() throws SQLException {

        try {
            List<Item> itemtList = session.createNativeQuery("SELECT * from item", Item.class).getResultList();
            return (ArrayList<Item>) itemtList;
        }catch (Exception e){
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Item entity) throws SQLException {
        session.delete(entity);
    }

    @Override
    public void update(Item entity) throws SQLException {
        session.update(entity);
    }

    @Override
    public ArrayList<String> loadIds() throws SQLException {
        String sql = "SELECT I.id FROM item AS I";
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
    public int itemCount() {
        String sql = "SELECT COUNT(I.id) FROM item AS I";
        Query query = session.createQuery(sql);
        Long count = (Long) query.getSingleResult();
        return Math.toIntExact(count);
    }
}
