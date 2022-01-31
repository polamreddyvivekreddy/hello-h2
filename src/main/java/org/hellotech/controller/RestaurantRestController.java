package org.hellotech.controller;

import lombok.extern.slf4j.Slf4j;
import org.hellotech.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestaurantRestController {

    /*@RestController = @Controller + @ResponseBody
    For instance, hover over @RestController to see this info :)*/

    @GetMapping("/restaurant-rest-controller")
    public Restaurant getRestaurantsUsingResponseEntity() {
        Restaurant restaurant = new Restaurant(3, "Mana Restaurant");
        return restaurant;
    }

    @PostMapping("add-new-restaurant")
    public Restaurant addNewRestaurant(int id, String name) {
        log.info("Request Params passed: {} & {}", id, name);
        Restaurant restaurant = new Restaurant(id, name);
        return restaurant;
    }


}
