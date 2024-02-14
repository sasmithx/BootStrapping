package lk.ijse.nativeBootStrapping.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerTM {
    private String id;
    private String name;
    private String address;
    private int mobile_num;
}
