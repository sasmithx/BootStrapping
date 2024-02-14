package lk.ijse.nativeBootStrapping.bo.custom;

import lk.ijse.nativeBootStrapping.bo.SuperBO;
import lk.ijse.nativeBootStrapping.dto.UserDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    boolean saveCustomers(UserDTO userDTO);
    boolean updateCustomers(UserDTO userDTO);
    UserDTO searchCustomers(String id);
    ArrayList<String> loadCustomerIds()  throws SQLException;
    String generateNextCustomerId();
}
