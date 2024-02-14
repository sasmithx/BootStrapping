package lk.ijse.nativeBootStrapping.dao.custom;

import lk.ijse.nativeBootStrapping.dao.CrudDAO;
import lk.ijse.nativeBootStrapping.entity.Item;

public interface ItemDAO extends CrudDAO<Item,String> {
    int itemCount();
}
