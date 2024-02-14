package lk.ijse.nativeBootStrapping.bo.custom;

import lk.ijse.nativeBootStrapping.bo.SuperBO;
import lk.ijse.nativeBootStrapping.dto.UserDTO;
import lk.ijse.nativeBootStrapping.entity.User;

public interface UserBO extends SuperBO {
    boolean saveUsers(UserDTO userDTO);

    boolean updateUsers(UserDTO userDTO);
}
