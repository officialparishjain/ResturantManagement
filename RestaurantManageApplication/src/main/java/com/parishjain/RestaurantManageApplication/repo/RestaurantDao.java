package com.parishjain.RestaurantManageApplication.repo;

import com.parishjain.RestaurantManageApplication.models.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {

    // Table of Restaurants
    List<Restaurant> restList;

    public RestaurantDao(){

        restList = new ArrayList<>();
        restList.add(new Restaurant("101","Tips Food","25 Ludhiana","9988025514","Fast Food","gh@gmail.com"));
        restList.add(new Restaurant("102","Pick 4 Lick","25 Ludhiana","9988025514","Fast Food","gh@gmail.com"));
    }


    public List<Restaurant> fetchAll() {
        return restList;
    }
}
