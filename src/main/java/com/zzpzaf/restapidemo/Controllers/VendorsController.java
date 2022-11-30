package com.zzpzaf.restapidemo.Controllers;

import java.util.List;

import com.zzpzaf.restapidemo.dataObjects.StoreRepo;
import com.zzpzaf.restapidemo.dataObjects.Vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VendorsController {

    @Autowired
    private StoreRepo repo;

    @GetMapping(value = "/vendors")
    public ResponseEntity<List<Vendor>> getAllVendors() {

        try {
        
            return new ResponseEntity<>(repo.getVendors(), HttpStatus.OK);    

        } catch (Exception e) {
            
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        
        
    }
    
}
