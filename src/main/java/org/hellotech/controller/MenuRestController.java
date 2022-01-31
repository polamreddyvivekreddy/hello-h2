package org.hellotech.controller;

import lombok.extern.slf4j.Slf4j;
import org.hellotech.model.Menu;
import org.hellotech.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class MenuRestController {

    private final MenuService menuService;

    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }


    @GetMapping("/menu")
    public ResponseEntity<Menu> getMenu() {
        log.info("getMenu");
        return menuService.getMenu();
    }


    @PostMapping("/add-menu")
    public ResponseEntity<Menu> addMenu(boolean isMultiCuisineProvided, Map<String, Double> itemPriceMapProvided) {
        return menuService.addMenu(isMultiCuisineProvided, itemPriceMapProvided);
    }
}
