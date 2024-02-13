package lk.ijse.nativeBootStrapping.dto;

import lk.ijse.nativeBootStrapping.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private String userId;
    private String userName;
    private String password;

    public User toEntity() {
        System.out.println(userId);
        User user = new User(userId,userName,password);
        return user;
    }
}
