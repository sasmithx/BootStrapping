package lk.ijse.nativeBootStrapping.dao.custom;

import lk.ijse.nativeBootStrapping.dao.CrudDAO;
import lk.ijse.nativeBootStrapping.entity.User;

public interface UserDAO extends CrudDAO<User,String> {
    User getUserById(String id);
    String generateNextId();
}
