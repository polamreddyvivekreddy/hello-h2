package org.hellotech.controller;

import org.hellotech.model.Town;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TownRestController {

    @GetMapping("/towns")
    public List<Town> getTowns(){
        List<Town> townList = new ArrayList<>();
        townList.add(new Town(1,"Kavali",50));
        Town town2 = new Town();
        town2.setId(2);
        town2.setName("Bitragunta");
        town2.setNumberOfRestaurants(50);
        townList.add(town2);
        return townList;
    }
}
