package lk.ijse.nativeBootStrapping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "item")
public class Item {
    @Id
    @Column(name = "item_id")
    private String id;
    @Column(name = "item_name")
    private String name;

    @Column(name = "item_price")
    private double price;

}
