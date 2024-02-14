package lk.ijse.nativeBootStrapping.bo.custom;

import lk.ijse.nativeBootStrapping.bo.SuperBO;
import lk.ijse.nativeBootStrapping.dto.UserDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    boolean saveItems(UserDTO userDTO);
    boolean updateItems(UserDTO userDTO);
    UserDTO searchItems(String id);
    ArrayList<String> loadItemIds()  throws SQLException;
    String generateNextItemId();
}
