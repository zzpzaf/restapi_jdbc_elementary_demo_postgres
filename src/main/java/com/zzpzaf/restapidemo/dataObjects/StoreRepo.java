package com.zzpzaf.restapidemo.dataObjects;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StoreRepo {

   
    @Autowired
    private JdbcTemplate jdbcTemplate; 

    private String tableName1 = "items";
    private String tableName2 = "vendors";

    public List<Item> getItems() {

        //return jdbcTemplate.query("SELECT * FROM items", BeanPropertyRowMapper.newInstance(Item.class));

        String sqlString = "SELECT * FROM " + tableName1;

        return jdbcTemplate.query(sqlString, BeanPropertyRowMapper.newInstance(Item.class));

    }  

    public List<Vendor> getVendors() {

        String sqlString = "SELECT * FROM " + tableName2;

        return jdbcTemplate.query(sqlString, BeanPropertyRowMapper.newInstance(Vendor.class));

    }  

}
