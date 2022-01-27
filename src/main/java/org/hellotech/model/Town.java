package org.hellotech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Town {

    private int id;
    private String name;
    private int numberOfRestaurants;
}
