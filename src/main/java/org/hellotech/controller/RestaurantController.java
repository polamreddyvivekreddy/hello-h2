package org.hellotech.controller;

import org.hellotech.model.Menu;
import org.hellotech.model.Restaurant;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class RestaurantController {

    // Way-1
    @GetMapping("/restaurant-response-entity-object")
    public ResponseEntity<Restaurant> getRestaurantsUsingResponseEntity() {
        Restaurant restaurant = Restaurant.builder().id(1).name("Babai Hotel")
        .menu(Menu.builder().isMultiCuisine(true).itemPriceMap(Map.of("Dosa",20.0)).build()).build();
        ResponseEntity<Restaurant> restaurantResponseEntity = ResponseEntity.ok(restaurant);
        return restaurantResponseEntity;
    }

    // Way-2
    @GetMapping("/restaurant-response-body-annotation")
    @ResponseBody
    public Restaurant getRestaurantsUsingResponseBodyAnnotation() {
        Restaurant kakaRestaurant = new Restaurant(2, "Kaka Hotel");
        return kakaRestaurant;
    }


}
