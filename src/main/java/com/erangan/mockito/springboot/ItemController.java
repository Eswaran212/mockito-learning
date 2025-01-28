package com.erangan.mockito.springboot;

import com.erangan.mockito.springboot.model.Item;
import com.erangan.mockito.springboot.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(path="item")
    public ResponseEntity<Item> getItem(){
        return  new ResponseEntity(itemService.getItem(),OK);
    }
    @GetMapping(path="item-list")
    public ResponseEntity<Item> getItemList(){
        return  new ResponseEntity(itemService.getItemList(),OK);
    }

}
