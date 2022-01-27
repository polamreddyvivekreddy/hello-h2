package org.hellotech.controller;

import org.hellotech.model.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MenuRestController {

    @GetMapping("/menu")
    public ResponseEntity<Menu> getMenu(){
        Map<String, Double> itemPriceMap = new HashMap<>();
        itemPriceMap.put("Dosa",20.0);
        itemPriceMap.put("Idli",10.0);
        Menu menu = Menu.builder().isMultiCuisine(true).itemPriceMap(itemPriceMap).build();
        return new ResponseEntity<>(menu, HttpStatus.ACCEPTED);
    }

    @PostMapping("/add-menu")
    public ResponseEntity<Menu> addMenu(boolean isMultiCuisineProvided, Map<String, Double> itemPriceMapProvided){
        // TODO: Find an alternative for map as it is difficult to pass by an user!
        Menu menu = Menu.builder().isMultiCuisine(isMultiCuisineProvided).itemPriceMap(itemPriceMapProvided).build();
        return new ResponseEntity<>(menu, HttpStatus.ACCEPTED);
    }
}
