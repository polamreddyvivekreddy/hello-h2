package org.hellotech.service;

import org.hellotech.model.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class MenuService {

    public ResponseEntity<Menu> getMenu(){
        Map<String, Double> itemPriceMap = new HashMap<>();
        itemPriceMap.put("Dosa",20.0);
        itemPriceMap.put("Idli",10.0);
        Menu menu = Menu.builder().isMultiCuisine(true).itemPriceMap(itemPriceMap).build();
        return new ResponseEntity<>(menu, HttpStatus.ACCEPTED);
    }

    public ResponseEntity<Menu> addMenu(boolean isMultiCuisineProvided, Map<String, Double> itemPriceMapProvided){
        // TODO: Find an alternative for map as it is difficult to pass by an user!
        Menu menu = Menu.builder().isMultiCuisine(isMultiCuisineProvided).itemPriceMap(itemPriceMapProvided).build();
        return new ResponseEntity<>(menu, HttpStatus.ACCEPTED);
    }
}
