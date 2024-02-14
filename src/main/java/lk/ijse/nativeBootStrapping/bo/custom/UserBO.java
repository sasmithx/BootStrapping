package lk.ijse.nativeBootStrapping.bo.custom;

import lk.ijse.nativeBootStrapping.bo.SuperBO;
import lk.ijse.nativeBootStrapping.dto.UserDTO;
import lk.ijse.nativeBootStrapping.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserBO extends SuperBO {
    boolean saveUsers(UserDTO userDTO);
    boolean updateUsers(UserDTO userDTO);
    UserDTO searchUsers(String id);
    ArrayList<String> loadUserIds()  throws SQLException;
    String generateNextUserId();
}
