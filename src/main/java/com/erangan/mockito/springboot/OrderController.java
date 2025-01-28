package com.erangan.mockito.springboot;

import com.erangan.mockito.springboot.model.Item;
import com.erangan.mockito.springboot.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    ItemServiceImpl itemService;

    @GetMapping(path="/item",produces = "application/json")
    public Item getItem(){
        return itemService.getItem();
    }

}
