package com.erangan.mockito.springboot.services;

import com.erangan.mockito.springboot.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService{
    public Item getItem(){
        return new Item(1, "item-1", 100, 12.5);
    }

    public List<Item> getItemList(){
        return List.of(new Item(1, "item-1", 100, 12.5),
        new Item(1*2, "item-2", 100*2, 12.5*2),
        new Item(1*3, "item-3", 100*3, 12.5*3)
        );
    }
}
