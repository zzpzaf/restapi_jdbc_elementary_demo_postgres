package com.zzpzaf.restapidemo.Controllers;

import java.util.List;

import com.zzpzaf.restapidemo.dataObjects.Item;
import com.zzpzaf.restapidemo.dataObjects.StoreRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ItemsController {

    @Autowired
    private StoreRepo repo;

    @GetMapping(value = "/items")
    public ResponseEntity<List<Item>> getAllItems() {

        try {
        
            return new ResponseEntity<>(repo.getItems(), HttpStatus.OK);    

        } catch (Exception e) {
            
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        
        
    }
    
}
