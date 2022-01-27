package org.hellotech.controller;

import org.hellotech.model.Menu;
import org.hellotech.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MenuRestController {

    private final MenuService menuService;

    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }


    @GetMapping("/menu")
    public ResponseEntity<Menu> getMenu() {
        return menuService.getMenu();
    }

    @PostMapping("/add-menu")
    public ResponseEntity<Menu> addMenu(boolean isMultiCuisineProvided, Map<String, Double> itemPriceMapProvided) {
        return menuService.addMenu(isMultiCuisineProvided, itemPriceMapProvided);
    }
}
