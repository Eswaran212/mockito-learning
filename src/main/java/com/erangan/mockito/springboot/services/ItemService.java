package com.erangan.mockito.springboot.services;

import com.erangan.mockito.springboot.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ItemService {
    public Item getItem();
    public List<Item> getItemList();
}
