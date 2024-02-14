package lk.ijse.nativeBootStrapping.dao.custom;

import lk.ijse.nativeBootStrapping.dao.CrudDAO;
import lk.ijse.nativeBootStrapping.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer,String> {
    int CustomerCount();
}
