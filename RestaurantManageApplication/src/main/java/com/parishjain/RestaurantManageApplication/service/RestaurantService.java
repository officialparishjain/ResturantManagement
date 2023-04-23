package com.parishjain.RestaurantManageApplication.service;

import com.parishjain.RestaurantManageApplication.models.Restaurant;
import com.parishjain.RestaurantManageApplication.repo.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;


    public List<Restaurant> getAllRestaurants(){

       return restaurantDao.fetchAll();

    }

}
