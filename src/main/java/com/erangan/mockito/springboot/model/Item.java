package com.erangan.mockito.springboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Item {
     public long id;
     public String name;
     public long quantity;
     public double price;

    public Item(long id, String name, long quantity, double price){
        this.id=id;
        this.name=name;
        this.quantity =quantity;
        this.price=price;
    }
}
