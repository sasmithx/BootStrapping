package lk.ijse.nativeBootStrapping.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemTM {
    private String id;
    private String name;
    private int qty;
    private double price;
}
