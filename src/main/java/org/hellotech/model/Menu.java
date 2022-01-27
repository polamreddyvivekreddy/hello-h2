package org.hellotech.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter // Mandatory to have public getters when returned in controllers object<->json
public class Menu {

    private boolean isMultiCuisine;
    private Map<String, Double> itemPriceMap;

}
