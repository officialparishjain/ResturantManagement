package com.parishjain.RestaurantManageApplication.controllers;

import com.parishjain.RestaurantManageApplication.models.Restaurant;
import com.parishjain.RestaurantManageApplication.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/RestaurantManagement")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/restaurant/All")

    List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }
}
